package com.sisit.main;
import java.awt.GridLayout;

import javax.swing.*; // 윈도우 관련

/*
 * 		상속 => 기존의 클래스를 재사용 => 추가 , 변경해서 사용
 * 			   ---------
 * 				사용자 정의
 * 				라이브러리 => 변경해서 사용하는 상속이 많다
 * 				=> 코드의 재사용이 높다 => 최적화에 문제
 * 				   -------------- 개발 속도가 빠르다
 * 			    => 코드 관리가 용이하다
 * 				=> 코드가 간결해진다 => 코드를 볼 수 없다 (가독성)
 * 				=> 기존의 클래스 이미 검증된 상태 : 신뢰성이 높다
 * 			상속 : is-a => 변경후 사용
 * 			포함 : has-a => 있는 그대로 사용(***)
 * 		
 * 		  객체지향 => 권장(캡슐화 , 재사용(상속), 변경,추가가 쉽게)
 * 										  -------------
 * 										   오버라이딩, 오버로딩
 * 		   *** 상속의 문제점
 * 				= 결합성이 높다 (다른 클래스에 영향이 크다)
 * 				예) 상속받는 클래스 => 상속을 내리는 클래스 (변경)
 * 			 	= 제약조건이 많다
 * 				= 메모리 커진다 => 속도 늦다
 * 				= 윈도우 사용하지 않는 이유 => 속도가 느리다
 *			특징)
 *			  1. 단일 상속만 가능
 *			  2. 상속 기호 : extends : 클래스를 확장에서 사용
 *						   -------
 *				 예) class A extends B
 *					A클래스 B클래스를 확장해서 새로운 클래스 제작
 *					=> A클래스는 B클래스로부터 상속을 받는다
 *			  3. 상속 => 특별한 경우가 아니면 모든 변수,메소드 상속
 *										----------------
 *				=> 특별한 경우(예외)
 *				   static => 공유(여러개의 객체가 공동사용)
 *						  => 사용이 가능하게 만든다	   
 *					생성자   
 *				    초기화블록
 *					private : 상속은 내려간다 => 접근이 불가능
 *					----------> setter.getter
 *
 *			상속 내리는 클래스(super, 상위클래스, 부모 클래스)
 *			=> 상속을 받을 클래스의 변수, 메소드에 접근이 불가능
 *				------------
 *			    자신의 객체 =========> this
 *			    상위 클래스의 객체 ====> supper
 *		class A
 *		{ int a,b; //this
 *		}
 *		class B extendA a
 *		{
 *			// a,b
 *		public B()
 *		{
 *			this.a=10;
 *			this.b=20;
 *			super.a=100;
 *			super.b=200;
 *		}
 *		}
 *		
 *		class A
 *		Class B extends A A>B
 *		
 *		메모리 할당
 *		
 *		A a=new(A)
 *		  => A클ㄹ래스가 가지고 있는 변수, 메소드 사용
 *		B a=new(B)
 *		  => A클ㄹ래스가 가지고 있는 변수, 메소드 사용
 *		A c=new)
 *		  => A클ㄹ래스가 가지고 있는 변수, 메소드 사용
 *"
 *"
 */
//class A
//{	
//		int a=10;
//		void display()
//		{
//			System.out.println("A클래스가 가지고 있는 display()");
//		}
//}
//class B extends class A
//		void display()
//		{
//			System.out.println("A클래스가 가지고 있는 display(0)");
//		}
//}
// 가장 큰 클래스 상속 => 포함
// 윈도우는 중요하지 않다
public class 윈도우상속 extends JFrame{
	//윈도우 설정
	JButton b1=new JButton("North"); // 포함클래스
	JButton b2=new JButton("East");
	JButton b3=new JButton("west");
	JButton b4=new JButton("center");
	JButton b5=new JButton("south");
	public 윈도우상속()
	{	//setLayout(new FlowLayout());
		setLayout(new GridLayout(5,1));
		// BorderLayout => defaul
		add(b1);add(b2);add(b3);add(b4);add(b5);
		//레이아웃
//		add("North",b1);
//		add("South",b5);
//		add("Center",b4);
//		add("East",b2);
//		add("West",b3);
		//크기 설정
		setSize(640, 400);
		//윈도우 보여달라
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		윈도우상속 w =new 윈도우상속();
	}

}
