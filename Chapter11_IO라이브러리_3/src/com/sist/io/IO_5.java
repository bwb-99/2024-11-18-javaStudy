package com.sist.io;
import java.io.BufferedWriter;
import java.io.FileWriter;
// 문자 단위 저장 => write(String s)
import java.util.*;

import javax.net.ssl.ExtendedSSLSession;

public class IO_5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileWriter fw=new FileWriter("c:\\java_data\\student.txt");
			/*String msg="Hello java!! => IO";
			fw.write(msg);
			fw.close();*/
			String msg="Hello oracle!!";
			//크롤링 / OpenAPI
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(msg);
			System.out.println("저장완료!!");
		}catch(Exception ex) {
		ex.printStackTrace();
		}
	}

}
