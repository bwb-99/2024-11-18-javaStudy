/*
 * 선택문 : switch~case
 * 		  다중 조건문과 유사
 * 		=========== 범위를 지정, 값을 한개만 선택(게임, 어플)
 * 		형식)
 * 			1. case 안에 중복된 값이 있으면 안된다
 * 			2. default는 생략
 * 			3. 문자 => ''
 * 			4. 문자열 => ""
 * 			switch(문자/정수/문자열)
 * 			{
 * 				case 값1:
 * 				 실행문장
 * 	반복문 : **for / **while / do~while
 * 			for : 반복 횟수가 지정된 경우 => 웹(반복횟수)
 * 			=> 화면 UI => 목록 / 슬라이드
 * 			=>Front
 * 			while : 반복횟수가 없는 경우
 * 					=> 데이터베이스 / 파일 읽기
 * 					=>Back
 * 			do~while : 후조건=>먼저 반복문장을 1번 수행
 * 						=> 반드시 한번 이상 수행
 * 		   형식)
 * 				for 		| false => 반복종료
 * 						1 	2	4
 * 				 for(초기식:조건식;증감식)
 * 				  {		   |true
 * 						반복 수행문장 3
 * 				  }
 * 				  초기식은 한번 수행
 *				  조건식 => false까지
 *				  증가식은 조건식에 있는 변수를 변경=> false가 되게 만든다
 *				  => 무한루프 : for(;;)
 *				  => for(여기부터시작;여기까지 도달; 증가/감소)
 *											  =======
 *											  ++,--
 *											  +=,-=
 *				-------------------------------------
 *				68page =>  중첩 for(이중 for)
 *				형식)		  1    2
 *					for(초기식;조건식;증감식)	 => 세로 => 줄수
 *					{		   | true
 *							1	 2 |false면 1차 for증가식이동
 *					   for(초기식;조건식;증감식) => 가로
 *						{		  |true
 *							반복 	 수행문장3
 *						}
 *					}
 *
 *		반복제어문
 *					
 */ 
<<<<<<< HEAD
<<<<<<< HEAD
/* 
 * 				 
 */
public class 반복문_1 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) // 줄수
		{
			//2차  for문 종료되면 일차 증가식으로 이동
			for(int j=1;j<=5;j++) //화면출력
			{
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 * 		i=1 => j=1~j=5
		 * 		i=2 => j=1~j=5
		 * 		i=3 => j=1~j=5
		 * 		i=4 => j=1~j=5
		 * 
		 */

	} 
=======
/*
=======
/* 
>>>>>>> refs/remotes/origin/master
 * 				 
 */
public class 반복문_1 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) // 줄수
		{
			//2차  for문 종료되면 일차 증가식으로 이동
			for(int j=1;j<=5;j++) //화면출력
			{
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 * 		i=1 => j=1~j=5
		 * 		i=2 => j=1~j=5
		 * 		i=3 => j=1~j=5
		 * 		i=4 => j=1~j=5
		 * 
		 */

<<<<<<< HEAD
	}
>>>>>>> refs/remotes/origin/master_0
=======
	} 
>>>>>>> refs/remotes/origin/master

}
