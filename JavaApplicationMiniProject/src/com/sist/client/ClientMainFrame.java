package com.sist.client;

import javax.swing.*;
//						상속 => 재사용 => 변경
public class ClientMainFrame extends JFrame{
	MenuForm mf=new MenuForm(); //포함클래스 => 있는 그대로
	ControlPanel cp=new ControlPanel();
		//배치
		public ClientMainFrame()
		{
			setLayout(null); // 사용자 정의 => 직접 배치
			mf.setBounds(20, 15, 1150, 50);
			//mf.setBounds(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
			add(mf);
			cp.setBounds(10, 75, 1170, 585);
			add(cp);
			setSize(1200,700);
			setVisible(true);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try
			{
				UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
			}catch(Exception ex) {}
			new ClientMainFrame();
	}

}
