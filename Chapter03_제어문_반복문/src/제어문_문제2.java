//2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
public class 제어문_문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,num=0;
		
		for(i=2;i<=100;i+=2)
		{
				num+=i;
		}
		System.out.println("정수의 합:"+num);

	}

}
