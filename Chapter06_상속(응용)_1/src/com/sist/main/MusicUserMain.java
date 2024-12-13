package com.sist.main;
import javax.swing.*; 
import javax.swing.table.*;
	   /* Container
		* ***= JFrame
		* JDialog
		* ***= JWindow
		* JPanel
		*/
public class MusicUserMain extends JFrame{
	JTabbedPane tp;
	MusicListPanel mlp=new MusicListPanel();
	MusicFindPanel mfp=new MusicFindPanel();
	MusicDetailPanel mdp=new MusicDetailPanel();
	public MusicUserMain()
	{
		tp=new JTabbedPane();
		tp.addTab("뮤직목록", mlp);
		tp.addTab("뮤직검색", mfp);
		tp.addTab("상세검색", mdp);
		// LEFT / RINGHT / TOP(default) / BOTTOM
//		tp.setTabPlacement(JTabbedPane.TOP);
		//윈도우 추가
		add("Center",tp);
		//크기
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MusicUserMain();
	}

}
