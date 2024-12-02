import java.util.*; // 두개이상 사용 => Scanner / Calender
public class 배열응용_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		
		System.out.print("월 입력:");
		int month=scan.nextInt();
		
		System.out.print("일 입력:");
		int day=scan.nextInt();
		
		Calendar cal=Calendar.getInstance(); // 객체 생성
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1); // 0부터 시작으로 안주면 다음 달로 넘어간다
		cal.set(Calendar.DATE, year);
		
		char[] strWeek= {' ','일','월','화','수','목','금','토'};
		// week0, week=1 => week=1부터
		int week=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(year+"년도 "+month+"월 "+day+"일은 "+strWeek[week]+"요일입니다.");
		int lastday=cal.getActualMaximum(Calendar.DATE);
		System.out.println("마지막 날:"+lastday);
		
	}

}
