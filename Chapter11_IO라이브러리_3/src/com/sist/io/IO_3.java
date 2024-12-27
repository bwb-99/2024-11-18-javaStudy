package com.sist.io;
import java.util.*;
import java.io.*;
// BufferedInputStream / BufferedOutputStream
// String StringBuffer
//  파일 자체 제어 => FileReader / FileWriter
//                BufferedReader / BufferedWriter
//                  => 한줄씩 읽기, 한줄씩 저장
//                  => readLine(), writeLine()
public class IO_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	FileInputStream fis=new FileInputStream("c:\\javaDev\\mydata3.jar");
        	BufferedInputStream bis=new BufferedInputStream(fis);
        	
        	FileOutputStream fos =new FileOutputStream("c:\\\\javaDev\\\\mydata3.jar");
        	BufferedOutputStream bos=new BufferedOutputStream(fos);
        	
        	int i=0;
        	byte[] buffer=new byte[1024];
        	while((i=fis.read(buffer,0,1024))!=-1)
        	{
        		fos.write(buffer, 0, i);
        	
        	System.out.println("복사 완료");
        	}
        			
        }catch(Exception ex) {}
	}

}
