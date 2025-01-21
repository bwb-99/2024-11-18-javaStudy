/*
 * 		1.출력
 * 		  System.outprintln()
 * 						 == new Line 
 * 		  System.outprint()
 * 						 == 가로 출력
 * 		  System.outprintf() => jdk 1.8 이상 가능
 * 						  == 출력 서식을 만들어 출력
 * 						  == C언어에서 도입
 * 
 * 		  국어점수 : 90
 * 		  영어점수 : 90
 * 		  수학점수 : 90
 * 
 * 		  국어 : 90, 영어: 90, 수학 : 90
 * 
 * 		  국어  영어	수학	총점	평균	  학점  ==> 출력 형식
 * 		  90   90	90	270	90.0   'A'
 * 		
 * 		2. 입역
 * 		3. 임의의수 충돌
 */
public class 연산자_이항연산자_산술연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kor=90;
		int eng=80;
		int math=80;
		
		System.out.println("국어:"+kor); // 국어:90
		System.out.println("영어:"+eng); // 영어:80
		System.out.println("수학:"+math); // 수학:80
		
		System.out.print("국어:"+kor+",영어:"+eng+",수학:"+math);
		System.out.println();
		System.out.printf("국어:%d, 영어:%d, 수학:%d",kor,eng,math);
		/*
		 * 		%d ==> 정수값
		 * 		%f ==> 실수값
		 * 		%s ==> 문자열 대입
		 * 		%c ==> 문자 입력
		 */
		System.out.println();// => 확인, 에러 출력에 쓰인다.
		System.out.println(5/3.0);
		System.out.printf("%.2f",5/2.0); //소수점 출력 필요할때
		// .2 ==> 소수점이하 2자리 출력
		
		
	}

}
