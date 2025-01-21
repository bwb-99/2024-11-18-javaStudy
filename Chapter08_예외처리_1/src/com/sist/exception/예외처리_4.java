package com.sist.exception;
import java.util.Scanner;

/*
 * 		UnCheck
 * 		-------
 * 		   |
 * 		 
 * 
 * 
 * 
 * 		ArrayIndexOutOfBoundsException 
 * 		ArithmeticException
 * 
 * 		
 */
public class 예외처리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] arr=new int[2]; // 배열범위, 0
		try
		{
			System.out.println("첫번째 정수 입력:");
			String s1=scan.next();
			System.out.println("두번째 정수 입력:");
			String s2=scan.next();// 오류발생
			
			arr[0]=Integer.parseInt(s1);//정수변환
			arr[1]=Integer.parseInt(s2);
			
			int result=arr[0]/arr[1];
			System.out.println("result"+result);
			
		
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			//System.out.println(ex.getMessage());
			// 에러 메세지만 출력
			ex.printStackTrace(); // 권장
			//에러시 => 에러위치확인
		}
		catch(ArithmeticException e)
		{
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		//기타적인 에러
		
//		}catch(ArrayIndexOutOfBoundsException ex)
//		{
//			System.out.println("배열 범위 초과");
//		}catch(ArithmeticException e)
//		{
//			System.out.println("0으로 나눌 수 없습니다");
//		}
//		System.out.println("정상수행");
		catch(NumberFormatException  e)
		{
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("정상 수행");
		// 정상수행 => catch는 수행하지 않는다
		//try안에서 오류발생 시 catch  수행
//		
	}

}
