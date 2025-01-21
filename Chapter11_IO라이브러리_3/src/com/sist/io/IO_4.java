package com.sist.io;
// 파일 출력 => FileOutputStream / FileWriter
//            BufferedOutputStream  / BufferedWirter
//              => Byte(1글자 저장) char => 여러문자열 저장이 가능   
import java.io.*;
public class IO_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileOutputStream fos=new FileOutputStream("c:\\java_data\\student.txt");
			// 파일이 없는 경우에는 자동으로 생성
			// 파일이 있는 경우에는 글쓰가 된다
			//Write
			/*fos.write('A');
			fos.write('B');
			fos.write('C');
			fos.write('D');
			fos.write('E');
			fos.close();*/
			String msg="ABCDEFGHIJKLMNOPQRSTUVWSYZ";
			fos.write(msg.getBytes());
			fos.close();
			System.out.println("저장 완료!!");
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
