package com.sist.io;
import java.io.*;
// 필터스트림 => 읽기 성능을 최적화 => 속도가 빠르게 만든다
/*
 *   파일의 단점
 *   ========= 구분자가 없다
 *   사원 1명
 * 
 */
public class IO_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileReader fr=new FileReader("c:\\javaDev\\seoul_location.txt");
			BufferedReader br=new BufferedReader(fr);
			long start=System.currentTimeMillis();
			while(true)
			{
				String msg=br.readLine();
				if(msg==null) break;
				System.out.println(msg);
			}
			int i=0;
			while(((i=fr.read())!=-1))
			{
				System.out.println((char)i);
			}
			long end=System.currentTimeMillis();
			fr.close();
			br.close();
		}catch(Exception ex) {}

	}

}
