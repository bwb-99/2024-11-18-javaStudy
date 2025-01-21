package com.sist.main;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;


public class 네트워크_2 extends JFrame implements ActionListener{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 네트워크_2();
		

	}

	@Override 
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	//내부 클래스 => 멤버클래스 => 클래스가 가지고 있는 모든 데이터
	
	class BarThread extends Thread
	{
		// 프로그램바를 한개만 작동
		int index;
		public BarThread(int index)
		{
			this.index=index;
		}
	}

}
