/* => 변수 => 배열
 * => 연산처리 / 제어문 처리 => 사용자 요청 => 메소드
 * ----------------------------------------- 클래스 구성요소
 * 객체지향 언어 => 자바시작 (5장)
 * 사용자 정의 데이터형
 * 1. 정수를 입력을 받아서 => 2진법 출력  10 ==> 0000 0000 0000 1010
 * 16bit => 2byte => 32767
 */
import java.util.Scanner;
public class 배열_생성_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int INDEX = 15;
		Scanner scan=new Scanner(System.in);
		System.out.print("0~32767사이 정수 입력:");
		int num=scan.nextInt();
		//System.out.println(Integer.toBinaryString(num));
		// 저장 공간 0,1 => 16개
		int[] binary=new int[16];
		// 앞에서 => index=0, 뒤에서부터 => index=15
		//index=0 ==> 0부터 출력 FIFO => Queue
		//index=15 ==> 15부터 출력 LIFO => Stack
		int index=INDEX;
		
		//요청처리 => 제어문 /연산자
		while(true)
		{
			binary[index]=num%2;
			num/=2;
			
			if(num==0)
			
				break;
				
			index--;
		} // 출력
			for(int i=0;i<binary.length;i++)
			{
				//          배열의 갯수
				if (i%4==0 && i!=0)
						System.out.print(" ");
					System.out.print(binary[i]);
				
			}
		}
		
	}


