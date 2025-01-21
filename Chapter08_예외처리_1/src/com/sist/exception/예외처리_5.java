package com.sist.exception;
/*
 * 		예외처리 => try~catch
 * 		=> IO / SQL
 * 		=> try : 정상 수행하는 문장
 * 				 => 입력값, 실수 => 오류발생
 * 			=> 오류발생 => 찾아서 => 오류복구
 * 			   ------------------------
 * 				catch
 * 		  	try => if
 * 			catch => else
 * 			=> if~else if...
 * 			catch => 한개만 수행
 * 		    catch => 클래스 크기에 따라 작은 순서에 제작
 * 				    ----------------------------
 * 				    1. 계층구조
 * 					   Object : 최상위 클랫
 * 					     |
 * 					   Throwable
 * 						 |
 * 				-------------------
 * 				 |				  |
 * 			 	Error			Exception
 * 			=> 처리불가능한 에러       => 처리가 가능한 에러
 * 			
 * 			Exception
 * 		Check	 |     UnCheck
 * 		=> 컴파일시에
 * 		   예외처리가
 * 		   되었는지 확인
 * 		-------------------------
 * 		|			            |
 * 	 						  실행시 => 입력값확인
 * 	  IOException		      RuntimeException
 * 	 SQLException			  NumberFormatException
 * 	 ClassNotFoundException	  ArrayIndexOfBoundsException
 * 							  ClassCastExcepion
 * 							   ...
 * 							  NullPointException
 * 
 * 	예외를 잡을 수 있는 능력은 상위 클래스일수록 크다
 * 	=> catch(Exception e)
 * 	=> 예외처리 전체 / 부분
 *  => 예제
 */								
public class 예외처리_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
