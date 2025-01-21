import java.util.Arrays;
import java.util.Scanner;
public class 배열문제_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1. 다음 중 배열 선언이 잘못된 것은? 4)
		 * 
		 * 배열 : 관련된 데이터를 여러개 모아서 메모리에 저장 => 한개의 이름으로 관리
		 * 		---------	---------
		 * 1) 같은 데이터형		2) 연속적인 메모리 구조
		 * => 한개의 이름으로 관리
		 * 	 ---------------
		 * 		배열명 => 구분자(인덱스)
		 * 	3) 배열을 선언하면 고정적이다 => 추가, 삭제가 불가능
		 * 		=> 현재 배열보다 큰 배열을 다시 생성한다(추가)
		 * 			int[] arr=new int[5]; => 7
		 * 			int[] arr_ext = new int[7]
		 * 			=> 동적으로 생성은 가능
		 * 		=> 현재 배열보다 작은 배열을 다시 생성한다(삭제)
		 * 	4) 인덱스번호=> 0부터~
		 * 		=> 배열에 저장된 갯수 => 배열명.length
		 * 	5) 배열선언 / 배열 초기화
		 * 	   데이터형[] 배열명={1,2,...}
		 * 	   데이터형[] 배열명=new 데이터형[저장갯수]
		 * 			--- 배열기호 => 숫자
		 * 
		 * 1) int[] n = {1, 2, 3, 4, 5};
		 * 2) int n[] = {0};
		 * 3) int[] n = new int[3];
         * 4) int n[3] = new int[3]; 
         * 	  ----------------------
         * 		int[] String[] char[]
         * 	  ----------------------> 데이터형
         * 
         */
		
		/*
		 * 2. 배열을 선언하고 생성하는 다음 물음에 답하라
		 * 
		 * 1) 10개의 문자를 가지는 배열 c를 생성하는 코드를 한 줄로 쓰라.
		 * 2) 0에서 5까지 정수 값으로 초기화된 정수 배열 n을 선언하라.
		 * 3) '일', '월', '화', '수', '목', '금', '토'로 초기화된 배열 day를 선언하라.
		 * 4) 4개의 논리 값을 가진 배열 bool을 선언하고 true, false, false, true로 선언하라
		 */
//		 char[] c=new char[10];
//		 int[] n=new int[0,1,2,3,4,5];
//		 char[] day=new char['일', '월', '화', '수', '목', '금', '토'];
//		 boolean[] bool=[true, false, false, true];
		
//		  3. 배열 alpha를 모두 출력하고자 한다. 빈칸에 적절한 코드를 삽입하시오.
		  
//		  char[] alpha = {'a', 'b', 'c', 'd'};
//		  for( int i=0; i<alpha.length; i++)
//		  System.out.print(alpha[i]);
//								 --- 일반 for문
//		 for(char c:alpha)	=> 배열에 저장된 실제 데이터
//			 System.out.print(c);
		
		/* => 배열 제어 => 값을 변경 , 값을 저장 / 값을 읽기
		 * => 일반 for
		 * => for-each => 값을 읽어서 출력
		 * 	  -------- front(react, Vuejt,JSP)
		 * 변수 => 저장 / 읽기 / 변경
		 */
		
		// 4. 양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라
//		int[] num=new int[10];
//		//초기화
//		for(int i=0;i<num.length; i++)
//		{
//			num[i] =(int)(Math.random()*100)+1;
//		}
//		System.out.print(Arrays.toString(num));
//		System.out.println();
//		// 3의 배수만 출력
//		for(int i:num)
//		{
//			if(i%3==0)
//				System.out.print(i+" ");
//	
//		}
		
		
				
		
		
			
		
		// 5. 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.
		
//		int[] num=new int[10];
//		
//		//초기화
//		for(int i=0;i<num.length; i++)
//		{
//			num[i] =(int)(Math.random()*10)+1;
//			
//		}
//		System.out.print("10개의 정수:"+Arrays.toString(num));
//		System.out.println();
//		
//		int sum=0;
//		for(int i:num)
//		{
//			sum+=i;
//		}
//		System.out.printf("평균:%.2f",sum/10.0);
		/*
		 * 	1. 저장하는 공간(메모리)
		 * 		=> 한개, 두개 => 일반 변수
		 * 		=> 3개 이상 => 배열
		 * 		=> 웹 : 사용자가 보내준 데이터 읽기
		 * 				getParameter("id")
		 * 	2. 초기화 
		 *	3. 처리 내용 => 평균, 갯수,인덱스위치...
		 *	=> 데이터베이스(오라클) 검색, 저장...
		 *	4. 결과값 출력
		 *		=> 브라우저로 전송 setAttribute("id","admin")
		 *			sendJson()
		 *
		 *		[], List ==> 자바스크립트에서는 데이터형(X)
		 *		-------- JSON => React/Vue/Ajax
		 *		List ==> []
		 *		클래스 ==> {}
		 *		
		 *		String / StringButffer
		 *
		 */

		
		
		


		
		
		// 8. arr 배열 중에서 인덱스가 1인 곳의 값을 출력해보자.
		// int[] arr = { 10, 20, 30, 50, 3, 60, -3 };
//			arr[1] => 20
		
		
		
//		6. int[] num = { 94, 85, 95, 88, 90 }; //명시적 초기화
//		다음 배열에서 최대값,최소값을 출력하는 프로그램을 작성하시오
		
//		int max=num[0];
//		int min=num[0];
//		
//		for(int i:num)
//		{
//			if(max<i)
//				max=i;
//			if(min>i)
//				min=i;
//		}
//		System.out.println("최대값:"+max);
//		System.out.println("최소값:"+min);
		
		// 9.  arr 배열 중에서 값이 60인 곳의 인덱스를 출력해보자. 
		// int[] arr = { 10, 20, 30, 50, 3, 60, -3 }; 
		
//		int[] arr ={10,20,30,50,3,60,-3};
//		int index=0;   //지우고 int i=0;
//		for(int i=0;i<arr.length;i++) // int 삭제
//		{
//			if(arr[i]==60)
//			{
//				index=i;  // 지움
//				break;
//			}
//		}
//		System.out.println("인덱스 번호:"+index); //i int i 밖으로 빼두면 가능
		
		/*
		 *  지역변수 => 블럭변수 => 메모리에서 사라진다
		 *  {} => 메모리 자체에서 관리
		 *  	  -------- Stack: 지역변수/매개변수
		 */
//		{
//			int a=10;
//			{
//				int b=20;
//				{
//					int c=30;
//					//scope => 변수의 사용 범위
//				}
//				System.out.println(b);
//			}
//			System.out.println(a);
//		}
		//7. 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.
				//	예) 랜덤한 정수들 : 3 6 3 6 1 3 8 9 6 9 
				//	평균은 5.4
				// [Hint] 1에서 10까지 범위의 정수를 랜덤하게 생성할 때는 다음 코드를 이용하라
				// 		  int i  = (int)(Math.random()*10)+1;
		
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]  = (int)(Math.random()*10)+1;
		}
		System.out.println(Arrays.toString(arr));
		int sum=0;
		for(int i:arr)
		{
			sum+=i;
		}
		System.out.printf("평균:%.2f",sum/10.0);
		
		
	}

}
