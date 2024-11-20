/*
 *		형변환연산자
 *		====  long => int, char => int, byte => int
 *			  int => double, double => int
 * 
 * 		숫자/문자(정수인식) => boolean은 제외
 *		
 *		데이터형의 크기
 *			<=======		=========>
 *			DownCasting		Upcasting
 *			:데이터형을 작게	:데이터형을 크게
 *			=> 강제			=> 자동
 *		byte < short < int < long < float < double
 *				char
 *
 *		byte b=10;
 *		int i=b; ==> 크기가 작은 byte에서 int로 값이 변경되었다.
 *			  -- int로 변경	
 *
 *		int a=10;
 *		double d=a;  //a값은 double로 a ==> 10.0
 *
 *		int a=10;
 *		double d=a; ==> 10.0
 *
 *		  10 + 10.5 ==> 20.5 => 연산은 같은 데이터형만 처리가 가능
 *		  int  double
 *		   |	 |
 *		  10.0 + 10.5
 *
 *		*** 가장 큰 데이터형으로 변경
 *		*** int이하 데이터형(byte,char,short)은 연산 결과는 int
 *			ex) byte + byte
 *				100		50	=>150=> int
 *				char + char = int
 *				short + byte + char = int
 *				byte + int = int
 *				double + float = double
 *		*** 필요시에는 강제로 변환
 *					======== 형변환 연산자
 *
 *			(int)10.5 + (int)20.3
 *			=========	=========
 *				10			20	===> 30
 *
 * 			(int)(10.5 + 20.5) => 31
 * 				  -----------
 * 				(int)31.0
 * 				---------
 * 					31
 * 
 * 		=> 연산자 => (최우선순위 연산자)
 * 		=> (3+5)*2 = 13
 * 
 * 		(데이터형)변수
 * 		
 * 		=> 10/(double)3 => 3 (정수/정수=정수)
 * 
 * 
 * 
 */

public class 연산자_단항연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a=10; 
		 * double d=a; 
		 * System.out.println(d);
		 * 
		 * char c='A'; 
		 * int e=c; 
		 * System.out.println(e);
		 */
		/*
		 * byte b1=100; 
		 * byte b2=27; 
		 * int b3=b1+b2; //byte b3=b1+b2; 오류
		 */
		/*
		 * int a=10; 
		 * int b=3; 
		 * System.out.println(a/b); 
		 * System.out.println(a/(double)b);
		 */
		int a = 123456;
		float d = 123456.78f;
		int res = (int) ((d - a) * 100);// 부동소수점 double 일시 소수점이 123456.77777에서 78로 반올림 => 부동소수점으로 값이 달라질 수 있기에 같은 크기 필수
		System.out.println(res);
	}

}
