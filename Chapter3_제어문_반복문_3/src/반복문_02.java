//1~10까지 난수 => 10를 발생 => 평균
public class 반복문_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double avg=0.0;
		int sum=0;
		int i=0;
		while(i<=10)
		{
			/////////////////   반복 //////////////////
			int num=(int)(Math.random()*10)+1;
			System.out.print(num+" ");
			sum+=num;
			//////////////////////////////////////////
			i++;
		}
		System.out.println("\n난수의 평균:"+(sum/10.0));
		

	}

}
