package com.sist.client;
import java.util.*;
import java.net.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

import com.sist.commons.*;
import java.awt.event.*;
// 마우스 / 버튼 / 엔터 => 서버로 전송 
// 서버에서 전송하는 값 읽기 => 자동화 처리 => 쓰레드 
public class ChatMain extends JFrame
implements ActionListener,Runnable,MouseListener
{
    Login login=new Login();
    WaitRoom wr=new WaitRoom();
    CardLayout card=new CardLayout();
    // <jsp:include>
    // 네트워크 관련 클래스 
    Socket s;
    OutputStream out;
    BufferedReader in;
    // 본인 여부 확인 
    String myId;
    public ChatMain()
    {
    	setLayout(card);
    	add("LOG",login);
    	add("WR",wr);
    	setSize(800, 600);
    	setVisible(true);
    	setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    	
    	login.b1.addActionListener(this);
    	login.b2.addActionListener(this);
    	
    	wr.tf.addActionListener(this);
    	wr.b6.addActionListener(this);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new ChatMain();
	}
	
	// 서버 => 수신 => 화면 출력 => 쓰레드 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				String msg=in.readLine();
				StringTokenizer st=
						new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				switch(protocol)
				{
				  case Function.LOGIN:
				  {
					 String[] data= {
						st.nextToken(),
						st.nextToken(),
						st.nextToken(),
						st.nextToken()
					 };
					 wr.model2.addRow(data);
				  }
				  break;
				  case Function.MYLOG:
				  {
					 card.show(getContentPane(), "WR");
					 myId=st.nextToken();
					 setTitle(myId);
				  }
				  break;
				  case Function.WAITCHAT:
				  {
					  wr.ta.append(st.nextToken()+"\n");
					  wr.bar.setValue(wr.bar.getMaximum());
				  }
				  break;
				  case Function.EXIT:// 남아있는 사람처리
				  {
					  String yid=st.nextToken();
					  //exit.jsp?id=admin
					  //String yid=request.getParameter("id")
					  for(int i=0;i<wr.model2.getRowCount();i++)
					  {
						  String id=wr.model1.getValueAt(i,  0).toString();
						  if(yid.equals(id))
						  {
							  wr.model2.removeRow(i);
							  try
							  {
								  
							  }catch(Exception ex) {}
						  }
					  }
				  }
				  break;
				  case Function.MYEXIT: // 로그인하고 있는 사람 
				  {
					  dispose();
					  System.exit(0);
				  }
				  break;
				}
			}
		}catch(Exception ex) {}
	}
	
	// 서버로 요청값 전송 => 사용자 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b2)
		{
			dispose();// 윈도우 메모리 해제 
			System.exit(0);//프로그램 종료 
			// React-Query => TanStack-Query
		}
		else if(e.getSource()==login.b1)
		{
			// 1. 입력값 읽기 
			String id=login.tf1.getText();
			if(id.trim().length()<1)
			{
				JOptionPane.showMessageDialog(this, 
						"아이디를 입력하세요");
				login.tf1.requestFocus();
				return;
			}
			
			String name=login.tf2.getText();
			if(name.trim().length()<1)
			{
				JOptionPane.showMessageDialog(this, 
						"이름을 입력하세요");
				login.tf2.requestFocus();
				return;
			}
			
			String sex="남자";
			if(login.rb1.isSelected())
			{
				sex="남자";
			}
			else
			{
				sex="여자";
			}
			
			// 서버와 연결
			connection(id, name, sex);
		}
		else if(e.getSource()==wr.tf)
		{
			String msg=wr.tf.getText();
			if(msg.trim().length()<1)
			{
				wr.tf.requestFocus();
				return;
			}
			
			// 서버로 전송 
			try
			{
				out.write((Function.WAITCHAT+"|"
						  +msg+"\n").getBytes());
			}catch(Exception ex) {}
			
			wr.tf.setText("");
		}
		else if(e.getSource()==wr.b6)
		{
			// 나가기
		    try
		    {
		    	out.write((Function.EXIT+"\n").getBytes());
		    }catch(Exception ex ) {}
		}
	}
	public void connection(String id,String name,String sex)
	{
		try
		{
			s=new Socket("localhost",5115);
			// 서버 정보 
			out=s.getOutputStream();
			in=new BufferedReader(
				new InputStreamReader(
						s.getInputStream()));
			// login요청 
			out.write((Function.LOGIN+"|"
					 +id+"|"+name+"|"+sex+"\n").getBytes());
			// ObjectOutputStream
		}catch(Exception ex){}
		// 서버와 통신을 해라 
		new Thread(this).start();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getClickCount()==2)// 더블클릭
		{
			
		}
		
			
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}