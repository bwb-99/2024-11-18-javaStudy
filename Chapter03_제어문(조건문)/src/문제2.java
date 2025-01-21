import java.util.Scanner;
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12) >>");
		int month = scan.nextInt();
		
		if(month>2 && month<6)

			System.out.print("월은 봄입니다.");

		if(month>5 && month<9)

			System.out.print("월은 여름입니다.");
		
		if(month>8 && month<12)
		
			System.out.print("월은 가을입니다.");
		
		if(month==12 || month==1 || month==2)
		
		System.out.print("월은 겨울입니다.");
		
	}

}


//12. 숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울, 그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라. 
// 
//결과)달을입력하세요(1~12) >> 9가을
