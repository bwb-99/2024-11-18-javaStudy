/*
 *   ABCD
 *   EFGH
 *   IJKL
 *   MNOP
 *   
 *   ABCD
 *   ABCD
 *   ABCD
 *   ABCD
 *   
 *   AAAA
 *   BBBB
 *   CCCC
 *   DDDD
 *   
 *   #123
 *   1#23
 *   12#3
 *   123#
 *   
 *   => 정렬, 빈도수 구하기 => 알고리즘
 *   
 *   ★
 *   ★★
 *   ★★★
 *   ★★★★
 *   
 *   i	 j => 줄=별표
 *   1	 1
 *   2   2
 *   3   3
 *   4   4
 *   
 *   ★★★★
 *   ★★★
 *   ★★
 *   ★
 *   i	 j => 역순 => 더하기
 *   1	 4    i+j=5 
 *   2   3
 *   3   2
 *   4   1
 */
public class 반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char c='A';
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=4;j++)
//			{
//				System.out.print(c++);
//			}
//			System.out.println();
//		for(int i=1;i<=4;i++)
//		{
//			char c='A';
//			for(int j=1;j<=4;j++)
//			{
//				System.out.print(c++);
//			}
//			System.out.println();
//		char c='A';
//		for(int i=1;i<=4;i++)
//		{
//
//			for(int j=1;j<=4;j++)
//			{
//
//				System.out.print(c);
//			
//			}
//			c++;
//
//		for(int i=1;i<=4;i++)
//		{
//
//			for(int j=1;j<=4;j++)
//			{
//				if(i==j)
//					System.out.print("#");
//				else
//					System.out.print(j);
//			
//			}
//
//			System.out.println();
//		}

//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1; j<=i;j++)
//			{
//				System.out.print("★");
//			}
//			System.out.println();
//		}
		for(int i=1;i<=4;i++)
			{
//				for(int j=4; j>=i;j--)
				for(int j=1; j<=5-i;j++)
				{
					System.out.print("★");
				}
				System.out.println();
			}

	}

}
