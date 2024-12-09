//클래스 제작 => 인스턴스와 정적변수 구분	

/*
 * 		클래스
 * 			= 사용자 정의 데이터형 : 데이터를 모아서 전송 목적, 데이터를 관리
 * 			  배열의 단점을 보완 => 구조체 => 클래스로 대체
 * 			  => 변수 여러개를 모아서 관리(관련된 변수를 모아서 저장)
 * 			  => 배열 => 고정적 , 같은 데이터형만 ..
 * 			  => 클래스 => 가변형 , 다른 데이터형을 모아서 관리
 * 			  => ~VO : Value Object => 값만 저장 => Spring
 * 			  => ~DTO : Data Trandsfor Object : 데이터를 모아서 전송
 * 									  => 브라우저 , 윈도우 , 서버에 전송
 * 			=> 액션 클래스 : 변수+기능(메소드) => 기능
 * 				=> 메소드를 중심
 * 				=> ~DAO : 데이터베이스
 * 
 *  
 *  	    => 변수
 *  			=> 데이터값을 따로 저장 => 인스턴스 변수
 *  			=> 한개의 메모리 공유 => 정적변수 , 공유 변수
 *  			-----------------------------------
 *  
 *  			class Card
 *  			{
 *  				char number : 'A', 'J', 'K','Q'
 * 
 */
class Card
{
	char number; // 2byte
	String type; // 4byte 
	// new를 이용해서 저장공간을 생성한후에 사용
	static int width; //  |__ 공유이기에 멤보포함이 안됨
	static int height;//  |
	
	// 컴파일시에 자동생성 => 저장공간이 한개만 사용 => 공유
}
public class 클래스_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1=new Card();
		// 객체 = 정적인 상태(데이터) => 명사형 => 변수
		// 객체 => 동적인 상태(메소드) => 동사형 => 메소드
		// 객체 => 변수+메소드
		// 객체 => 현실세계에 있는 모든 사물
		/*
		 * 		1.설계
		 * 			class Student
		 * 			{
		 * 				int hakbun;
		 * 				String name;
		 * 				String subject;
		 * 				int year;
		 * 			 }
		 * 		2.메모리 저장 => 설계된 데이터 저장
		 * 			Student s1=new Student()
		 * 		3.  활용 => 초기화 , 변경 , 읽기
		 * 			s1.hakbun=10;...
		 * 		4. 객체 소멸
		 * 			s1=null ==> GC 대상
		 * 			=> System.gc()
		 * 			   ----------- 멀티미디어 ,화상채팅
		 * 		
		 * 		int[] kor=new int[3]
		 * 		int[] eng=new int[3]
		 * 		int[] math=new int[3]
		 * 		int[] total=new int[3]
		 * 		double[] avg=new double[3]
		 * 		int[] rank=new int[3]
		 * 		char[] score=new char[3]
		 * 		---------------------------
		 * 		
		 * 		class Student
		 * 		{
		 * 			int kor,eng,math,total,rank;
		 * 			double avg;
		 * 			char score;
		 * 			===> 클래스 전체에 사용이 가능
		 * 			===> 전역변수
		 * 			===> 다른 클래스에서 사용이 가능
		 * 		}
		 * 
		 * 		학생 => 성적관리시스템
		 * 		--- actor
		 * 		
		 * 		사람 = 자판기
		 * 		사람 = 컴퓨터
		 * 		-------------------------> 대상
		 * 		사이트 = User
		 * 			 = Admin
		 * 		
		 * 		new Student() => 3번
		 * 
		 * 		산출물 : 반드시 프로젝트 제출
		 * 
		 */
		c1.number='A';
		c1.type="♡";
		c1.width=150;
		c1.height=180;
		System.out.println("c1안에 저장된 데이터 number:"+c1.number);
		System.out.println("c1안에 저장된 데이터 number:"+c1.type);
		System.out.println("c1안에 저장된 데이터 number:"+c1.width);
		System.out.println("c1안에 저장된 데이터 number:"+c1.height);
		
		Card c2=new Card();
		c2.number='2';
		c2.type="♧";
		//메모리가 따로 생성()
		c2.width=180;
		c2.height=200;
		// 한개 메모리만 사용
		
		System.out.println("c2안에 저장된 데이터 number:"+c2.number);
		System.out.println("c2안에 저장된 데이터 number:"+c2.type);
		System.out.println("c2안에 저장된 데이터 number:"+c2.width);
		System.out.println("c\2안에 저장된 데이터 number:"+c2.height);
		
		System.out.println("c1안에 저장된 데이터 number:"+c1.width);
		System.out.println("c1안에 저장된 데이터 number:"+c1.height);
		
		//static => 객체명.변수명
		// --------> 클래스명.변수명
		Card.width=300;
		Card.height=350;// 클래스 변수
		// c1,c2 Math.random()
		// 컴파일시에 메모리 생성
		// Card =>
		// System.out.println(c1);
		// c1 => number,type => 객체
		/*
		 * 		객체 => 사용자 정의 클래스의 변수 => 여러개를 제어할 수 있다
		 * 		---- 여러개 변수를 저장할 수 있는 메모리 공간의 이름
		 * 		---- 메모리 주소를 이용하는 프로그램 => 참조 변수
		 * 						  Card@4aa8f064
		 * 		---c1---		  -------------
		 * 		Card@4aa8f064			'\0'number
		 * 		--------		  -------------
		 * 								 null type
		 * 						  -------------
		 * 								   | 생성자 => 반드시 클래스명과 동일
		 * 			Card@4aa8f064안에 number라는 메모리에 접근
		 * 			------------- c1.number
		 * 						 객체명.변수명
		 * 						.은 메모리 주소 접근 연산자
		 * 						scan.nextInt()
		 * 			Card@4aa8f064안에 type이라는 메모리에 접근
		 * 						  c2.type
		 * 			***자신의 메모리주소에 있는 데이터만 접근이 가능하다
		 */

	}

}
