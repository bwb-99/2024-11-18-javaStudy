//B,D,F,H,J,L,N을 출력하는 프로그램을 작성하라 (for 사용)
public class 제어문_문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0, num=0;
		
		for(i=5;i<=50;i+=5)
		{
			if(i>45)
				System.out.print(i);
			else //50뒤에는 콤마를 쓰지 않는다
				System.out.print(i+" ");
			
		}
		

	}

}
