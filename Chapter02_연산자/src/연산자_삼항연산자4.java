import java.util.Scanner;
/*
 * 	(조건)?"값":"값"
 *  (조건)?1:2
 *  (조건)?'A':'B'
 *  
 *  ===> 진화 ===> 제어문
 */
public class 연산자_삼항연산자4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*3);
		// 0, 1, 2
		Scanner scan=new Scanner(System.in);
		System.out.println("가위(0),바위)(1),보(2):");
		
		int user=scan.nextInt();
		
		System.out.println("==== 결과값 ====");
		System.out.print("컴퓨터:");
		System.out.print(com==0?"가위":"");
		System.out.print(com==1?"바위":"");
		System.out.print(com==2?"보":"");
		
		System.out.println();
		System.out.print("사용자:");
		System.out.print(user==0?"가위":"");
		System.out.print(user==1?"바위":"");
		System.out.print(user==2?"보":"");
		
		System.out.println("결과...");
		int result=com-user;
		
		System.out.println(result==1 || result==-2?"컴퓨터 Win":"");
		System.out.println(result==-1 || result==2?"사용자 Win":"");
		System.out.println(result==0?"비겼다":"");
		
		/*
		 * 	com(0) => 가위
		 * 		user 가위(0) 0
		 * 			 바위(1) -1
		 * 			 보(2) -2
		 * com(1) => 바위
		 * 		user 가위(0) 1
		 * 			 바위(1) 0
		 * 			 보(2) -1
		 * com(2) => 보
		 * 		user 가위(0) 2
		 * 			 바위(1) 1
		 * 			 보(2) 0
		 */
	}

}
