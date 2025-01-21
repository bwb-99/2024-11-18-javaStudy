import java.util.Arrays;
import java.util.Scanner;

public class 배열_문제_01{
    public static void main(String[] args) {
        // 컴퓨터가 중복없는 난수 3자리 발생
        int[] com = new int[3]; // 0 0 0
        // 사용자 입력
        int[] user = new int[3]; // 0 0 0
        
        // 초기화
        for (int i = 0; i < com.length; i++) {
            com[i] = (int) (Math.random() * 9) + 1; // 1부터 9까지의 난수 발생
            for (int j = 0; j < i; j++) { // 이전에 나온 숫자들과 중복 체크
                if (com[i] == com[j]) {
                    i--; // 중복이 있으면 다시 난수 생성
                    break;
                }
            }
        }
        
        // System.out.println(Arrays.toString(com)); // 컴퓨터의 숫자 확인 (디버깅 용)
        
        // 난수와 사용자 입력 비교
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("세자리 정수를 입력하세요: ");
            int input = scan.nextInt();
            
            if (input < 100 || input > 999) {
                System.out.println("잘못된 입력입니다!!");
                continue; // 처음부터 다시 실행
            }
            
            // 세자리 정수가 입력 => 356/100 =>3
            user[0] = input / 100;
            user[1] = (input % 100) / 10;
            user[2] = input % 10;
            
            if (user[0] == user[1] || 
                user[1] == user[2] || 
                user[0] == user[2]) {
                System.out.println("중복된 수는 사용할 수 없습니다.");
                continue; // 처음부터 다시입력
            }
            
            // 0은 사용할 수 없음
            if (user[0] == 0 || user[1] == 0 || user[2] == 0) {
                System.out.println("0은 사용할 수 없습니다.");
                continue;
            }
            
            // 스트라이크와 볼 계산
            int s = 0, b = 0;
            for (int i = 0; i < 3; i++) { // com
                for (int j = 0; j < 3; j++) { // user
                    if (com[i] == user[j]) { // 같은 숫자가 있으면
                        if (i == j) // 같은 자리수인지
                            s++;
                        else
                            b++;
                    }
                }
            }
            
            System.out.printf("Number:%d, Result:%dS-%dB\n", input, s, b);
            
            if (s == 3) { // 3 스트라이크면 게임 종료
                System.out.println("GameOver");
                break;
            }
        }
    }
}
