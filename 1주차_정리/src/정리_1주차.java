/*
 * 		1장 : 자바 특징 / 자바 서맃 / 주의점
 * 			  ====== 호환성 , 메모리 자동 회수 (가비지컬렉션) , 멀티쓰레드
 * 						jdk.java.net/17
 * 						classpath: .;C:\jdk - 17.0.2\lib
 * 						path : c:\jdk-17.0.2\bin
 * 
 * 						=>대소문자 구분
 * 						=> 들여쓰기
 * 						=> 주석 : 프로그램 분석
 * 						=> ctrl + shift +/ 여러줄 주석
 * 						   ctrl + shift+\  주석 해제
 *						
 *						  ctrl + /  한줄 주석
 *						  ctrl + \  헤제
 *						=> ctrl + space => 자동 완성기
 *			  ========  호환성, 메모리 자동 회수(가비지 컬렉션), 멀티쓰레드
 * 		2장 : 변수 / 연산자
 * 			 ===
 * 			  1) 한개의 데이터를 저장하는 메모리 공간의 별칭
 * 									==== 주소
 * 				=> 역할 : 쓰기(메모리 저장=대입), 읽기, 수정
 * 				   int a=10                 a    a=100
 * 				   변경이 가능한 값 / 변경이 안되는 값 (상수)
 * 				   변수)
 * 						데이터형 변수명;
 * 				   상수)
 * 						final 데이터형 변수명=10; => 오류발생
 * 						=> 배열의 갯수 => 상수
 * 						=> 상수 : 데이터형의 최대값, 최소값
 *
 *			  2) 메모리 크기 결정
 *				  => 기본형 / 참조형
 *					 ====   ===== |사용자 정의 => class
 *					  |자비에서 지원
 *					   정수형
 *					 	 byte : 1byte , 네트워크 전송, 파일읽기
 *								-128~127
 *								**8bit - 1byte
 *								  ---- 0,1을 채우는 공간
 * 		
 * 							(0) 1  1  1  1  1 1 1
 * 								64 32 16 8  4 2 1
 * 								=================  + 127
 * 							== 부호 (음수 : 1, 양수 : 0)
 * 						int : 4byte => 컴퓨터의 모든 정수는 int다.
 * 							   -21억 4천 21억 4천
 * 						long : 8byte => 소수점 15자리
 * 	
 * 						문자형
 * 						 char : 2byte => 0~65535 => 멀티바이트(unicode)
 * 								=> 표기법 ' ' => 한글자 설정	
 * 										----
 * 					     => 한글자만이 저장이 간ㅇ => 불편 => 여러개 동시에 저장
 * 													 	-------------
 * 														|String : 문자열 " "
 *
 * 						실수형
 * 							double : 8byte => 소수점 15자리
 * 						논리형
 * 							booblean : 1byte => true/false
 * 						
 * 						byte<char/int/long/double
 * 						-------------------------- 암기
 * 					=> 식별자 => 26page 참조
 * 					   1. 알파벳, 한글로 시작
 * 						  => 알파벳 => 대소문자 구분
 * 						  => 한글(자바), 웹에서는 알파벳
 * 					   2. 변수의 길이 => 제한은 없다 (3~10)
 * 					   3. 숫자는 사용이 가능 (단 앞에 사용이 불가능)
 * 					   4. 특수문자 (_ , $)
 * 					  	 _ : 임시변수 , 임시 클래스 , 단어 여러개인 경우 구분자
 * 					   5. 공백을 사용할 수 없다.
 * 					   6. 키워드는 사용이 금지
 * 					   7. 약속 사항
 * 						  변수, 메소드 => 소문자 시작
 * 						  클래스 , 인터페이스 => 대문자 시작
 * 						  상수 : 대문자 사용
 * 
 * 					   => 변수 / 상수 / 메소드 / 클래스 / 
 * 						  인터페이스 / 추상클래스
 * 						 =========================================== > 
 * 						
 * 						  식별자 적용
 * 					=> 변수 선언
 * 					   데이터형 변수명;
 * 					   (정수,문자,실수,논리)
 * 
 * 					=> 변수의 초기화
 * 					  1. 정수형
 * 						byte b=10; => 127
 * 							   --  일반 숫자
 * 					  	int i=10; => 21억 4천
 * 						char c='A' ==> 한글도 가능
 * 								' '==> null (값이 없는 상태) '공백'
 * 						long l=10L;
 * 						=> 대입하는 수가 21억 4천 ==> L
 * 					 
 * 					  2. 실수형
 * 						 double d=10.9D => D생략이 가능
 * 								  -----
 * 					  3. 논리형
 * 						 boolean b=true/false
 * 						 
 * 						*** main()
 * 							{ 
 * 								변수 => 지역변수
 * 										** 자동초기화가 안된다
 * 										   반드시 초기값을 설정후에 사용
 * 							}
 * 						변수		  => 변수가 없으면 프로그램 제어가 어렵다
 * 						 = 지역변수
 * 						 = 멤버변수  => 자동초기화 됨
 * 							 인스턴스변수 int a; => 0
 * 							 공유변수
 * 					자바 / 자바스크립트 .... => 데이터 관리 프로그램
 * 										   =========
 * 										   1. 변수 : 한개 저장
 * 										   2. 배열 : 여러개 저장
 * 											  => 같은 데이터형만
 * 										   3. 클래스 : 여러개 저장
 * 											  => 다른 데이터형
 * 										   4. 파일
 * 										   5. RDBMS => 오라클
 * 											  오라클 / MySQL / MariaDB
 * 
 * 						=> 연산자
 * 						   단항연산자
 * 							 ++ , -- (증감연산자) 1증가 1감소
 * 							 ------- 상세보기, 찜하기, 좋아요
 * 							int a=10;
 * 							a++; => 후치연산자
 * 							 --- 다른 연산을 먼저 수행 => 증가
 * 							++a; => 전치연산자	
 * 							 --- 먼저 증가하고 나중에 다른연산 수행
 * 							
 * 							 int a=10;
 * 							 int b=a++;
 * 							  1)다른 연산 수행
 * 								 b=a => b=10
 * 							  2) a값 1증가
 * 								 a=a+1 => a=11
 * 					
 * 							 int a=10;
 * 							 int b=++a;
 * 							   1) a값을 증가
 * 									a=a+1 ==> a=11
 * 							   1) b값을 증가
 * 									b=a   ==> b=11
 * 							! (부정연산자) => boolean만 사용
 * 								 boolean b=false;
 * 								 !b => true
 * 								 => 조건문에서 사용 if,for,while (제어문에서 주로 사용)
 * 
 * 							형변환 연산자
 * 								=> 데이터 크기 확인         | 명시적 형변환      | 묵시적 형변환 : 50Page
 * 									  <= DownCasting: 강제변환 UpCasting: 자동형변환 =>
 * 								byte < char < int < float < double
 * 										**boolean은 형변환이 안된다.
 * 
 * 								long l=10
 * 									   == int ==> 자동으로 10L
 * 								int a='A'
 * 									  === char ==> 자동으로 int 65
 * 								int a=10.5 => (int)10.5
 * 									  ----
 * 						 
 * 						   이항연산자 : 가장 많이 사용되는 연산자
 * 							1. 산술연산자 (+, -, *, /, %)
 * 								+ : 문자열 결합
 * 									"6"+7 => "67"
 * 									7+"6" => "76"
 * 									7+7+"77"
 * 									---
 * 									14+"77" => 77
 * 									** 산술규칙
 * 									1) 같은 데이터형만 연산되다
 * 										10+10.5
 * 										--
 * 										10.0+10.5 => 20.5 => 큰데이터형으로 통일
 * 
 * 										'A' + 10
 * 										---   --
 * 										char int
 * 										'A' = 65
 *                                       65+10 => 75
 *                                   2) int 이하 데이터형(byte, char) => 결과값은 int
 *                                   	char + char = int
 *                                   	byte + byte = int
 *                                   	char + byte = int
 * 								/ :
 * 									 1) 0으로 나눌 수 없다 => 나누는 값이 0인지 여부 확인
 * 														=> 오류
 * 									 2) 정수/정수=정수
 * 										10/3 = 3, 5/2 =2
 * 										=> 실수로 나눈다 (소수점)
 *  							% : 나머지 => 남는 값이 왼쪽 부호를 따라간다
 *  								5%2 = 1
 *  								-5%2 =-1
 *  								5%-2 = 1
 *  								-5%-2=-1
 *  						2. 비교연산자 => 모든 결과값이 boolean => 조건문
 *  						   == 같다	(오라클<>, 자바스크립트 ===)
 *  						   != 같지않다 (오라클 <>, 자바스크립트 !==)
 *  						-------------boolean포함
 *  						   < 	작다
 *  						   >    크다
 *  						   <= 작거나 같다 => < || ==
 *    						   >= 크거나 같다 => > || ==
 *    							====================== 적용되는 데이터형 숫자, 문자만 가능
 *    						3. 논리연산자 => 결과값 boolean => 조건문 , 반복문
 *    						  =========
 *    							&& , ||  => 병렬연산 => true가 한개 이상
 *    							==직렬연산 => 모든 데이터가 ture일때 처리
 *    
 *								(조건) && (조건)
 *								-----	 ----
 *								  |       |
 *								-------------
 *									  |
 *									결과값
 *							 조건  조건    &&   ||
 *							---------------------
 *							true  true  true true
 *    						---------------------
 *							true  false  false true    
 *        				    ---------------------
 *							false  true  false true
 *    						-----------------------
 *							false  false  false false
 *        				    ------------------------
 *        						효율적인 연산
 *        					** && => 앞에 조건이 false 뒤에 조건을 처리하지 않는다
 *        					** || => 앞에 조건이 true 뒤에 조건을 처리하지 않는다
 *        
 *        					int x=10;
 *        					int y=9;
 *        
 *        					x<y && x==++y
 *  						---		------ 실행하지 않는다
 *  						false====> 종료
 *  						
 *  						x>y || x==++y
 *  						----   ------  연산이 되지 않는다
 *  						true
 *        					** && => 범위 포함
 *        					   if(score>=0 && score<=100)
 *        					** || => 범위에 없는 경우 => 잘못된 입력
 *        					   if(score<0 || score>100)
 *        
 *        					4. 대입연산자
 *        						= : 대입 		int a=10; 10을 a에 대입한다
 *        									int b=20;
 *        									int c=a+b; a와b값을 더한 값을 c에 대입
 *        										  ---
 *        										   1
 *        										---
 *        										 2
 *        									왼쪽 => 오른쪽
 *        									오른쪽 => 왼쪽 => 대입연산자
 *        									=> 대입연산자는 연산자 마지막 순
 *        					
 *        									** 산술연산자 : * , / , % => +,-
 *        									   비교연산자
 *        									   논리연산자 : && => ||
 *        									   대입연산자
 *        									===> () : 최우선 순위 연산자
 *        						=================== 복합대입 연산자
 *        						+= => 여러개 증가
 *        						-= => 여러개 감소가 가능
 *        						
 *        						int a=10;
 *        						=> 5개증가
 *        						a++;
 *       						a++;
 *       						a++;
 *       						a++;
 *       						a++;
 *       							==> a+=5; => a=a+5
 *       
 *			                    int a=10;
 *        						=> 5개감소
 *        						a--;
 *       						a--;
 *       						a--;
 *       						a--;
 *       						a--;
 *       							==> a-=5; => a=a-5
 *       						  	==> 데이터베이스 연결시에 주로 사용
 *       			
 *       							==> 자바에서만 사용하는 것이 아니다
 *       								웹에서도 사용
 *       						==================
 *        					삼항연산자 :
 *        						=> if ~ else => true/false를 나눠서 처리
 *        						? :
 *        					    => (조건)?값1:값2
 *        							true => 값1
 *        							false => 값2
 *        							=> 복잡한 소스가 있는 경우에 간결하게 만든다
 *        							   웹 (HTML+Java)
 *        								  ==========
 *        							   게임
 * 						=> 사용자 요청 맞게 출력 , 데이터 전송 => 제어문
 *   
 * 		3장 : 제어문
 *			조건문
 *	  		= 단일조건문
 *			  1) 형식 => 흐름(동작순서) => 문법적용
 *					 | 조건문 사용 연산자 => 부정연산자, 논리연산자, 비교연산자
 *				 if(조건문=>결과값 : true/false => 건너뛴다)
 *				 {
 *					조건문이 true일때만 수행하는 문장
 *				 } 
 *				 => 상세보기 / 페이징
 *	  		= 선택조건문
 *			  2) 형식
 *				if(조건문)  => 조건문 사용하는 방법
 *				{
 *					조건문이 true면 처리문장
 *				}
 *				else
 *				{
 *					조건문이 false면 처리문장
 *				}
 *				=> 로그인 처리 / 아이디 중복체크 / 우편번호 검색...
 *				=> 찜하기, 좋아요, 예약하기
 *	  		= 다중조건문  ==> 단순하게 => switch~case
 *			   프로그램
 *				= 가독성
 *				= 최적화(실행속도)
 *				= 재사용성
 * 				  => 메뉴 / 버튼...
 * 			 형식) => 조건에 맞는 문장만 실행
 * 				  if(조건문)
 * 				  {
 * 					문장 => true => 종료
 *                }			| false
 *                else if(조건문)
 *                {
 *                	문장 => true => 종료
 *                }			| false
 *				  else if(조건문)
 *                {
 *                	문장 => true => 종료
 *                }			| false
 *                else 
 *                {
 *                	문장 => 종료
 *                }
 *                
 *			선택문
 *			= switch~case => 다중조건문 : 가독성 
 *			반복문
 *			= do~while : 무조건 한번이상 수행
 *						=> 조건을 나중에 처리
 *			  do
 *			  {
 *				 실행문장
 *			  }while(조건문) ==> 자바에서는 사용빈도가 낮다
 *				
 *			= while : 반복횟수가 지정이 없는 경우, 무한루프
 *					  => 데이터베이스, 파일읽기
 *			= for : 가장 많이 사용되는 반복문
 *				    => 가장 많이 사용되는 반복문
 *					=> 이중 for
 *					  ======== 알고리즘 : 정렬 / 빈도구하기 / 등수구하기
 *					  ======== 정보처리 실기, 코딩테스트
 *			반복제어문 : 
 *	
 * 		4장 : 배열
 * 		5장 : 객체지향 프로그램
 * 		6장 : 상속
 * 		7장 : 추상클래스 / 인터페이스
 * 		8장 : 예외처리
 * 		9장 : 라이브러리 ex) ***java.util / java.lang / ***java.io / java.net / ***java.sql
 * 		
 */
import java.util.*;






public class 정리_1주차 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   //Scanner scan=new Scanner(System.in);
	  //모든 데이터형에 대한 정보를 가지고 있는 클래스 => Wrapper
	  //System.out.println(Byte.MAX_VALUE);
//		int[] arr= {30,40,20,50,10};
//		Arrays.sort(arr);//정의
//		System.out.println(Arrays.toString(arr));
//		for(int i=0;i<arr.length-1;i++)
//		{
//				for(int j=i+1;i<arr.length;j++)
//				{
//					if(arr[i]>arr[j])
//					{
//						int temp=arr[i];
//						arr[i]=arr[j];
//						arr[j]=temp;
//						
//					}
//				}
//		}
//		System.out.println(Arrays.toString(arr));

	}
}
		
	


