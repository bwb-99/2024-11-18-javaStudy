import java.util.Scanner;

public class 변수_연산자_문제 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

		/*
		 * System.out.print("세개의 정수 입력(1 2 3) :");
		 * 
		 * int a=scan.nextInt(); int b=scan.nextInt(); int c=scan.nextInt();
		 * 
		 * 
		 * System.out.printf("%d * %d + %d = %d",a,b,c,(a*b+c) ); //출력 양식 => 서식 =>
		 * printf
		 * 
		 * // TODO Auto-generated method stub
		 */
		

			System.out.print("a b  입력 :");

			int a=scan.nextInt();
			int b=scan.nextInt();

			System.out.printf("%d %% %d = %d" ,a,b,a%b );
			// 서식을 했을때 printf로 무슨 값을 넣었는지 확인

		}

	}

