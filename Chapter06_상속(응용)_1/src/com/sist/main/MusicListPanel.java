package com.sist.main;

import java.awt.Color;  
import java.awt.Font;

import javax.swing.*;
import javax.swing.table.*;

import com.sist.manager.*;
import com.sist.vo.*;
import java.awt.event.*;

public class MusicListPanel extends JPanel 
implements ActionListener
{
	JLabel la;
	JButton b1,b2;
	JTable table;
	DefaultTableModel model;
	GenieMusicSystem gm=new GenieMusicSystem();
	public MusicListPanel()
	{
		setLayout(null);
		la=new JLabel("Music Top 50", JLabel.CENTER);
		la.setFont(new Font("궁서체",Font.BOLD,35));
		la.setBounds(20, 90, 760, 50);
		add(la);
		
		b1=new JButton("지니뮤직");
		b2=new JButton("멜론뮤직");
		b1.setBounds(20, 40, 120, 30);
		b2.setBounds(145, 40, 120, 30);
		add(b1);
		add(b2);
		
		String[] col= {"순위", "곡명", "가수명", "앨범"};
		String[][] row=new String[0][4];
		model=new DefaultTableModel(row,col);
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		js.setBounds(10, 70, 760, 440);
		add(js);
		musicPrint(1);
		
		/*
		 * 	<table border=1>
		 * 	<tr>
		 * 		<th>순위<th>
		 *  	<th>곡명<th>
		 *   	<th>가수명<th>
		 *    	<th>앨범<th>
		 *   <tr>
		 *   <% } %>
		 *   
		 *   </table>
		 */
//		JPanel p=new JPanel();
//		b1=new JButton("이전");
//		b2=new JButton("다음");
//		p.add(b1);
//		setBackground(Color.pink);
	}
	public void musicPrint(int type)
	{
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		if(type==1)
		{
			gm=new GenieMusicSystem();
			la.setText("지니뮤직 TOP50");
			b1.setEnabled(false);
			b2.setEnabled(true);
		}
		else
		{
			gm=new MalonMusicSystem();
			la.setText("멜론 뮤직 TOP50");
			b2.setEnabled(false);
			b1.setEnabled(true);
		}
		
		la.setText(gm.title);
		MusicVO[] musics=gm.musicAllData();
		for(MusicVO vo:musics)
		{
			String[] data= {
					String.valueOf(vo.getNo()),
					vo.getTitle(),
					vo.getSinger(),
					vo.getAlbum()
			};
			model.addRow(data);
		}
	}
	// 버튼처리
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)//b1버튼 클릭
		{
			musicPrint(1);
		}
		else if(e.getSource()==b2)
		{
			musicPrint(2);
		}
	}
}
