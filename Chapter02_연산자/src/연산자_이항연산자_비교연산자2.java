
public class 연산자_이항연산자_비교연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a=(char)((int)(Math.random()*26)+65);
		//                        0~25 0+65 => 'A' ==> Math.random()*정수 0~n까지 랜덤일때 +n1은 시작점 n1~n
		char b=(char)((int)(Math.random()*26)+65);
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);
		
		// ==
		System.out.println(a==b);
		// !=
		System.out.println(a!=b);
		// <
		System.out.println(a>b);
		// >
		System.out.println(a<b);
		// <=
		System.out.println(a<=b);
		// >=
		System.out.println(a>=b);

	}

}
