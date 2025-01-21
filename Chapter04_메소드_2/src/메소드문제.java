import java.text.ChoiceFormat;
import java.util.Scanner;
public class 메소드문제 {
	
//	1. 1~10까지 출력하는 메소드를 구현하시오.
	// 매개변수(X) , 리턴형(X)
	static void 문제1()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
	}
//	2. 1~10까지 합을 구하는 메소드를 구현하시오.
	static int 문제2()
	{
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum+=i;
		}
		return sum; //값만 넘겨준다
	}		

//		3. 1~n까지 합을 구하는 메소드를 구현하시오. // 사용자가 요청한 값 (n) => 매개변수
	static int 문제3(int n)
	{
		
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		return sum; //값만 넘겨준다
	}
	
//		4. 두 정수의 나눗셈 결과를 구하는 메소드를 구현하시오.(실수)
//	static double 문제4(int a, int b)
//	{
//		return a/(double)b; // double 일경우 0으로 나눈 값 오류 생길 수 있다
//		
//	}
	static String 문제4(int a, int b)
	{
		if( b==0)
			return "0으로 나눌 수 없다"; // B가 0이면 종료
			
		return String.valueOf(a/(double)b);
		//메소드 종료 => 메소드안에서 return은 여러개 사용이 가능
		/*
		 * 	메소드가 종료하는 시점은 return
		 * 	반복문은 break
		 * 	=> 메소드는 원하는 위치에서 종료가 가능하다
		 */
		
	}
	
//		5. 문자열의 소문자를 대문자로 바꾸는 메소드를 구현하시오.
	static void 문제5(String s)
	{
		//자체에서 처리=> 영역에서 출력 abcD ===> ABCD
		//s=s.toUpperCase();
		//System.out.println(s);
		String ss="";
		for(int i=0;i<s.length();i++)
		{
			 char c=s.charAt(i);
			 if(c>='a' && c<='z')
			 {
				 c=(char)(c-32); // a=97 , A=65 => 32 '+'=> 대문자
			 }
			 else
				 ss+=c;
			
		}
		
		/*
		 * 		for(int i=0;i<s.length();i++)
		 * 		{
		 * 			char c=s.charAt(i);
		 * 			if(c>='a' && c<='z')
		 * 			{
		 * 				c=(char)(c-32)
		 * 			}
		 * 		}
		 * 
		 */
	}

	static String 문제5_1(String s)
	{
		return s.toUpperCase();
	}
	
//	6. 문자열을 입력받아서 좌우 대칭인지 확인하는 메소드를 구현하시오.
	/*
	 * 	경우의 수 : 3개
	 */
	//국어점수, 영어점수, 수학점수 입력 => 총점/평균 출력
	static String 문제6(String s)
	{//오류체크
		if(s.length()%2!=0)
			return "문자열 갯수가 짝수이여야 합니다.";
		
		String res=""; //둘중에 한개만 전송
		boolean bCheck=true;
		/*
		 *   |-----|
		 *   A B B A
		 *     |-|
		 */
		for(int i=0;i<s.length()/2;i++)
		{
			char start=s.charAt(i);
			char end=s.charAt(s.length()-1-i);
			if(start!=end)
			{
				bCheck=false;
				break;
			}
		}
		if(bCheck==true)
			res="좌우대칭 입니다";
		else
			res="좌우대칭이 아닙니다";
		
		return res;
	}
	
//		7. 문자열을 거꾸로 출력하는 메소드를 구현하시오.
	static void 문제7(String s)
	{
		//거꾸로 출력하는 라이브러리
		//new StringBuilder(s).reverse()
//		System.out.println(new StringBuilder(s).reverse());
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}
//		8. 학점을 구하는 메소드를 구현하시오.
		static void 문제8(int kor)
		{
			char c='A';
			switch(kor/10)
			{
			case 10: case 9:
				c='A';
				break;
				
			case 8:
				c='B';
				break;
				
			case 7:
				c='C';
				break;
				
			case 6:
				c='D';
				break;
				
			default:
				c='F';
			}
			System.out.println("학점:"+c);
		}
	
		static void hakjum2(int kor)
		{
			double[] limit= {50,60,70,80,90};
			String[] grade= {"F","D","C","B","A"};
			ChoiceFormat cf=new ChoiceFormat(limit, grade);
			System.out.println(cf.format(kor));
		}
//		9. 년도를 입력받아서 윤년인지 여부를 확인하는 메소드를 구현하시오.
//		10. 두수를 입력받아 큰 수를 출력하는 메소드를 구현하시오.
//		11. 입력 받은 값이 짝수인지 홀숨인지 판별하는 메소드를 구현하시오.
//		12. 3의 배수를 판별하는 메소드를 구현하시오.
//		13. 년,월,일을 입력받아서 요일을 구하는 메소드를 구현하시오.
//		14. 메소드를 정의하여 입력받은 숫자를 거꾸로 뒤집은 쉬를 출력하는 프로그램을 작성하세요.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		문제1();
		int hap=문제2();
		System.out.println("\n1~10까지 합: "+hap);
		hap=문제3(1000);
		System.out.println("1~n까지 합: "+hap);
		String d=문제4(10,3);
		//0으로 나눈 경우 오류 메세지 : Infinity
		System.out.println(d);
		문제5("abcDEFgh");
		
		String s=문제5_1("abcDEFgh");
		System.out.println(s);
		
		String ss=문제6("ABCCBA");
		System.out.println(ss);
		
		문제7("ABCDEFG");
		
		문제8(90);
		hakjum2(70);
		
		
		
		
	}

}
