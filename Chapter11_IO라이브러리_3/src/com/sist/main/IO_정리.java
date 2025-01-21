package com.sist.main;
/*
 *    IO => java.io => CheckException => 예외 처리후 사용
 *                     ---------------
 *                     | java.sql / java.net / java.lang(Thread)
 *     1) 특징
 *        = 단방향 => Input / Output(빨대)
 *          => 읽기/쓰기 => 쓰레드 이용해서 처리
 *          => 네트워크 : 전송(쓰기) => 수신(읽기)
 *                      -------    --------
 *          => Thread는 프로그램안에서 다른 프로그램 여러개를 동시에 수행
 *          => 예) 비행기 / 총알 => 시분할 (시간 나눠서 처리)
 *        = 데이터 이동하는 통로 : Stream
 *        = Queue방식이다 => FITO(먼저 들어간 것이 먼저 나오게)
 *      2) 종류
 *         = 바이트 송수신 = 바이트 스트림
 *          => 1byte읽기 / 1byte 쓰기
 *          => 동영상 / 이미지 / zip...
 *          => ~InputStream / ~OutputStream
 *          => 웹) 업로드 / 다운로드 / 웹 데이터 읽기
 *             네트워크에서 주로 사용
 *        = 문자 송수신 = 문자 스트림
 *          => 2byte 읽기 / 2byte 쓰기
 *          => 한글을 포함한 한글제어
 *          => ~Reader / ~Writer
 *        => ~InputStream / ~OutputStream
 *          => FileInputStream / FileOutputStream
 *          => ObjectInputStream / ObjectOutputStream
 *        => ~Reader / ~ Writer
 *          => FileReader / FileWriter
 *        = 속도를  최적화 => 필터스트림
 *          => BufferedInputStream / BufferedOutputStream
 *          => BufferdReader / BufferedWriter
 *       3) 사용되는 곳
 *                   입력스트림                 출력스트림
 *            사용자 =========== 자바프로그램 ================ 화면
 *            (키보트, 마우스)     응용프로그램                모니터/화면 출력
 *            
 *            메모리에서 입출력
 *            파일에서 입출력
 *            네트워크에서 입출력
 *            --------------- 스트림을 이용한다
 *            스트림 => 안전성
 *              | 메모리에 저장된 데이터를 읽어온다 => 절대 잊어버리지 않는다
 *              | 소켓프로그램 => 신뢰성이 좋다
 *               | 이메일(smtp) 파일업로드(FTP) , TELNET
 *            
 *            표준 입출력
 *              = System.in / System.out
 *              public final calss System
 *              {
 *                public static InputStream in;
 *                              => read
 *              
 *              
 *          
 *           
 */
import java.util.*;
import java.io.*;
public class IO_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			// Scanner => 가장 단순한 입력 클래스
			System.out.println("문자열 입력:");
			String msg=in.readLine();
			System.out.println(msg);
		}catch(Exception ex) {}

	}

}
