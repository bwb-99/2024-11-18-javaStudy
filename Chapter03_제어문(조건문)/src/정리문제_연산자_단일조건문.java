/*
 * 		산술연산자
 * 		======= 형변환
 * 			    => 연산 규칙 : 같은 데이터형만 연산처리가 가능
 * 				=> 큰 데이터형으로 변경해서 연산
 * 					int + int = int
 * 					long + int
 * 						   ===
 * 						   long => 자동 (자동형변환)
 * 				=> long+long=long
 * 			=> int이하 데이터형 (byte, short, char)
 * 				=> 계산 결과가 int
 * 					byte+byte = int
 * 					char+char = int
 * 				=> 작은데이터형 => 큰데이터형
 * 				-----------------------자동
 * 			    => 큰데이터형 => 작은데이터형  변경
 *  			-----------------------강제 (int)
 *  			(int)Math.random()*100 => 0~0 으로 나온다 // (int)(Math.random()*100) 0.0~0.99가 나온다 
 *  				()=> 최우선 연산자
 *  			데이터형 크기
 *  			byte < char < int < long < float < double
 *  				   short
 */
public class 정리문제_연산자_단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
