package com.sist.io;
import java.io.*;
// 파일제어 => 파일에 읽기 / 쓰기
//          --------------- Reader / Writer
import java.util.*;
public class IO_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// FileWriter : 파일에 입력
		FileWriter fw=null; // 2byte 단위 : 한글은 2byte 단위
		try
		{
			fw=new FileWriter("c:\\java_data\\sawon.txt",true);
			// sawon.txt 파일이 없는 경우에는 자동으로 생성
			fw.write("1|홍길동|개발부|서울|300\r\n");
			System.out.println("등록완료");
		}catch(Exception ex)
		{
			
		}
		finally
		{
			try
			{
				
			}catch(Exception e) {}
		}

	}

}
