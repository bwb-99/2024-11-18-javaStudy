package com.sist.io;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
public class IO_4 {

	public static void main(String[] args, char[] msg) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		FileWriter fw=null; // 파일에 저장
		FileReader fr=null; // 파일 읽기
		
		//한글로 된 파일 제어 => 2byte => Reader / Writer
		try
		{
			fw=new FileWriter("c:\\java_data\\sawon2.txt");
			fr=new FileReader("c:\\java_data\\sawon2.txt");
			// ObjectInputStream / ObjectOutputStream
			// => List가 통째로 저장이 가능
			while(true)
			{
				System.out.println("=====  Menu =====");
				System.out.println("1. 사원 목록");
				System.out.println("2. 사원 등록");
				System.out.println("==========");
				System.out.println("3. 종료");
			
				int menu;
				if(menu==3)
				{
					break;
				}
				else if(menu==2)
				{
					
					System.out.println("이름 입력:");
					sa.setName(scan.next());
					
					fw.write(msg);
				}
			}
		}catch(Exception ex) 
		{
			ex.printStackTrace(); // 오류확인
		}
		try
		{
			fr=new FileReader("c:\\java_data\\sawon2.txt");
			int i=0;
			String data="";
			while(i<data.length()-1)
				()
		}

	}

}
