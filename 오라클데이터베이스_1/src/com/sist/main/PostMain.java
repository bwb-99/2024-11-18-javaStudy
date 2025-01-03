package com.sist.main;
import java.util.*;
import com.sist.dao.*;
import com.sist.vo.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
public class PostMain extends JFrame{
	JTextField tf;
	JButton jb;
	JTable talbe;
	DefaultTableModel model;
	public PostMain()
	{
		tf=new JTextField(10);
		jb=new JButton("우편번호 검색");
		
		String[] col= {"우편번호","주소"};
		String[][] row=new String[0][2];
		model=new DefaultTableModel(row,col);
		
		p.add(tf);p.add(jb);
		
		
		
		
		setdefaultClose
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new PostMain();
	}
	//우편번호 출력
	public void postFind()
	{
		//1.테이블에 있는 데이터 지우기
		for(int i=model)
			
	}

}
