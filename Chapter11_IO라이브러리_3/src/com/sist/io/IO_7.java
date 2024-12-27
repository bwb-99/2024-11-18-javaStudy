package com.sist.io;
import java.io.*;
import java.net.*;
import java.util.*;

import javax.swing.text.Document;

import org.jsoup.Jsoup;
public class IO_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 일일박스오피스, 실시간 예매율, 좌석예매율, 
		String[] strUrl= {"","searchMainDailyBoxOffice.do","searchMainRealTicket.do","searchMainDailySeatTicket.do",};
		
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("===== Menu =====");
			System.out.println("1. 일일박스오피스");
			System.out.println("2. 실시간 예매율");
			System.out.println("3. 좌석점유율");
			System.out.println("=========");
			System.out.print("메뉴선택:");
			int menu=scan.nextInt();
			String path="https://www.kobis.or.kr/kobis/business/main/";
			path=path+strUrl[menu];
			Document doc= (Document) Jsoup.connect(path).get();
			System.out.println(doc.toString());
			//.do => 
//			URL url=new URL(path);
//			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
//			
//			if(conn!=null) // 접속이 된 경우
//			{
//				BufferedReader br= new BufferedReader(new InputStreamReader(conn.getInputStream()));
//				//전송 => 1byte, 받은 경우 => 2byte으로 변환 후
//				// 한글이 깨진다 => UTF-8
//				// 네투워크의 단점 : 전송시 byte(1byte)
//				// => 2byte
//				// 네트워크 : Oracle , 웹
//				// => 주소 / PORT
//				//    URL => 8080 => 65535
//				while(true)
//				{
//					String msg=br.readLine();
//					if(msg==null) break;
//					
//					System.out.println(msg);
//				}
//			}
//			conn.disconnect();
		}catch(Exception ex) {}

	}

}
