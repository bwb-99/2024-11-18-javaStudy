//정수 2개와 연산자(+,-,*,/)를 입력 받아 사칙 연산하는 
//프로그램을 만들어라 (switch~case 사용)
import java.util.Scanner;
public class 제어문_문제1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("점수 입력:");
		int score=scan.nextInt();

		switch(score/10) //최대한 => case 문장을 줄여서 사용
		{
		case 10: case 9:
			System.out.println(score+"점은 A입니다");
			break;// 수행후 종료
		case 8:
			System.out.println(score+"점은 B입니다");
			break;
		case 7:
			System.out.println(score+"점은 C입니다");
			break;
		case 6:
			System.out.println(score+"점은 D입니다");
			break;
		default: 
			System.out.println(score+"점은 F입니다");
		
	}
	}
}
