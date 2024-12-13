package com.sist.main;

import java.awt.Color; 
import java.awt.Font;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
////////////////
import com.sist.vo.*;
import com.sist.manager.*;
///////////// Back
import java.awt.event.*;

// 행위 => 마우스 / 키보드 => 사건 => 사건에 처리
// 사건이 발생하면 => 사건정보를 프로그래머로 넘겨준다
//				  ------------- 메소드가 구현이 안됨
// 추상 / 인터페이스
// 웹 => JavaScript

public class MusicFindPanel extends JPanel{
	JLabel la;
	JButton b1,b2;
	JTable table;
	DefaultTableModel model;
	JTextField tf;
	
	GenieMusicSystem gm=new GenieMusicSystem();
	public MusicFindPanel() {
	

	
		setLayout(null);
		tf=new JTextField();
		la=new JLabel("Music 검색", JLabel.CENTER);
		la.setFont(new Font("궁서체",Font.BOLD,35));
		la.setBounds(10, 120, 760, 50);
		add(la);
		
		tf.setBounds(10, 70, 200, 30);
		add(tf);
		String[] col= {"순위", "곡명", "가수명", "앨범"};
		String[][] row=new String[0][4];
		model=new DefaultTableModel(row,col);
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		js.setBounds(10, 105, 760, 405);
		add(js);
		tf.addActionListener(this);
	
	}
	/*
	 *  Event
	 *  버튼 / 텍스트 엔터 / 메뉴 actionPerformed
	 *  마우스
	 *  	mouseClicked , mouseReleased mpusePressed
	 *  	mouseEntered mouseExited
	 *  키보드
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String fd=tf.getText();
		if(e.getSource()==tf) //엔터
		{
			//입력 데이터 읽기
			JOptionPane.showMessageDialog(this, "검색어를 입력하시오:");
			tf.requestFocus();
			return;
		}
	}

	public void musicFind(String fd)
	{
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		
		MusicVO[] music=gm.musicFinData(fd);
		
		for(MusicVO vo:music)
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
	  
}