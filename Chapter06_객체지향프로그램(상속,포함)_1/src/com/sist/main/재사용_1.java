package com.sist.main;
/*
 * 		자바의 기본형식
 * 		package => 1번만 사용이 가능 => 첫줄에 사용
 * 		import  => 여러번 사용이 가능
 * 		public class ClassName
 * 		{
 * 			멤버변수 / 정적변수 => X, 여러개...
 * 			생성자 => 필요시에 사용
 * 			메소드 => 필요시에 사용
 * 			main(){} => 반드시 한개가 필요 => 프로그램 시작
 * 		}
 * 		
 * 		=> 제어어
 * 		   static : 공통적인
 * 		   final : 마지막인 => 상수 / 변경하지 않는 메소드
 * 		   abstract : 추상적인 => 공통기반
 * 		   sychronized : 동기적인 => 쓰레드 
 * 		   -----
 * 		   async // 비동기
 * 		   sync // 동기
 * 		   ----- 자바 스크립트 => Ajax => web2.0 => web3.0
 * 		   ----- jquerry(ajax)react => vue => react = next
 * 				 jquerry => 4,5
 * 		   --------------------
 * 			[접근지정어][제어어] => 메소드 , 멤버변수 , 생성자 , 클래스
 * 			
 * 			*** 객체의 생명주기
 * 			설계		     저장					  활용			   소멸
 * 			class Movie	 Movie m=new Movie()   m.메소드(),m.변수  m=null
 * 															   ------
 * 															   System.gc()
 * 			6장=> 194 page
 * 			
 * 			상속(웹, 스프링 => 사용빈도 거의 없다)
 * 			------------------------------
 * 			상속 : 목적 / 형식 / 메모리 구조
 * 			=> 목적
 * 			기존의 클래스(이미 만들어져 있는 클래스) => 신뢰성이 뛰어나다
 * 				=> 라이브러리 클래스
 * 				=> 사용자정의 클래스
 * 			재사용 할때 / 변경 사용, 추가 사용
 * 			=> 반복제거 / 소스를 줄이는 경우
 * 			=> 상속에서는 예외조건
 * 			1. 생성자 2. static 3. 초기화 블럭
 * 			** 상속은 된다 사용을 못하는 것 => private (protected)
 * 		    => 형식
 * 			   class A
 * 			   class B extends A
 * 					   ------  A클래스를 확장해서 사용
 * 			   => 상속을 내리는 클래스
 * 			   	  부모클래스, 슈퍼클래스, 베이스 클래스
 * 			   => 상속을 받는 클래스
 * 				  자식클래스, 서브클래스, 파생 클래스
 * 				
 * 			   => 클래스의 크기가 결정 => 형변환
 * 				  ---------
 * 				  상속내리는 클래스 => 상속받은 
 * 				
 * 				  }
 * 				  class B extend A
 * 				  {
 * 					// ★ ○ ▲
 * 
 * 
 * 					자바의 모든 라이브러리는 예외처리를 가지고 있다
 * 				=201page
 * 				 
 * 
 * 			상속을 받아서 메모리 할당
 * 			뮤직
 * 			  = 지니뮤직
 * 			  = 멜론
 * 			
 * 				사람 : 이름 / 나이 / 주소 
 * 
 * 
 */
class Sawon // extends object
{
	public Sawon() {
		System.out.println("Sawon 객체 생성!!");
		
	}
	public void display()
	{
		System.out.println("사원 객체 활용");
	}
	@Override
	protected void finalize() throws Throwable {
		//소멸자 함수
		System.out.println("객체 소멸!!");
	}
}
public class 재사용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Sawon sa=new Sawon();
	    sa.display();
	    sa=null;
	    System.gc(); // 메모리를 회수해라...
	}

}
