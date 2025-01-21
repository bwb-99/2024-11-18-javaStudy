package com.sist.io;
import java.io.FileReader;
/*
 * 	   1. File 정보
 *        = 파일명 : getName()
 *        = 경로명 : getPath()
 *        = 파일 생성 : createNewFile()
 *        = 폴더에 있는 파일 목록 : listFiles()
 *        = 파일 크기 : length()
 *        = 폴더 생성 : mkdir()
 *        = 삭제 
 *     2. 파일 입출력
 *        -------- 이미지 / 동영상 / zip
 *           FileInoutStream / FileOutputStream => byte
 *              => 바이트 스트림
 *              => read / write
 *              => close
 *        -------- 실제 파일 입출력
 *           FileReader / FileWriter => char
 *              => 문자 스트림
 *              => close
 *              => 'w' => create => 새로운 파일 생성
 *              => 'a' => append => 기존파일에 옆/밑에 출력
 *                               => 문자열 결합
 *                  new FileReader("파일명") => w
 *                  new FileReader("파일명",true) => a
 *     3. 속도 최적화
 *            InpitStream / OutputStream
 *            Reader      / Writer
 *            
 *            => BufferedInputStream / BufferedOutputStream
 *            => ***BufferedReader / ***BufferedWriter
 *     4. 객체단위로 입출력
 *            ObjectInputStream / ObjectOutputStream
 *     5. 네트워크 입출력
 *            송신 : OutputStream => 네트워크 패킷 => byte
 *            수신 : Buttered
 *            수신
 *     6. 표준 입출력
 *        입력 => System.in.read() => Scanner
 *        출력 => System.out.println()
 */
import java.util.*;
public class IO_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		try
		{
			fr=new FileReader("c:\\javaDev\\seoul_location");
			int i=0;
			long start=System.currentTimeMillis();
			while((i=fr.read())!=-1)
			{
				System.out.println((char)i);
			}
			long end=System.currentTimeMillis();
			
			System.out.println("걸린 시간:"+(end-start)+"초(MS)");
		}catch(Exception ex) {}
		try
		{
			
		}
				

	}

}
