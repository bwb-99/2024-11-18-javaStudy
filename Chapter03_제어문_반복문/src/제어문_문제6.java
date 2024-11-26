//1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라
public class 제어문_문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0, num=0;
		for(i=1;i<=30;i++)
		{
			if(i%2==0)
			{	//02, 04, 06 출력
				System.out.printf("%02d\t",i); // 2d 는 오른쪽 정렬로 2자리로 정렬 / -2d는 2자리로 왼쪽 정렬
				if(i%3==0) // 3개를 출력하고 다음줄에 출력하라
					System.out.println();
			}
		}

	}

}
