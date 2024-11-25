/*
 * 		선택문 : 다중조건문을 단순화 시킨 제어문
 * 			   => 한개만 수행이 가능
 * 			   => 게임 / 네트워크
 * 			   => ----------- 값을 한개만 선택(선택문), 범위(다중조건문)
 * 							  -------
 * 			   => 웹에서는 사용 빈도가 거의 없다
 * 			   		if / if~else / for / while /break
 * 					=================================
 * 	1. 형식)
 * 			switch(정수|문자|문자열)
 * 						   ----
 * 			1) 정수 => 메뉴
 * 				no = 0
 * 				   | 0 => 처리문장 0,1,2,3,4
 * 			switch(no) => 0,1,2
 * 			{
 * 			  case 0:
 * 				 처리문장 1
 * 				 break; => 종료 break는 반드시 주는 것은 아니다
 * 						   같은 내용을 실행할때가 있다
 * 			  case 1:
 * 				 처리문장 2
 * 			  case 2:
 * 				 처리문장 3
 * 			  default: ==> else => 해당번호가 없는 경우
 * 				 처리문장 4
 * 			}
 * 
 * 			예)
 * 				90~100 => A
 * 				
 */
public class 자바선택문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
