// 입력값을 받기 위해 Scanner 클래스 호출
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        // 별의 길이를 저장하기 위한 변수 length 선언 및 초기화
        int length = (2 * N) - 1;
        // 첫번째 줄의 별의 길이를 저장할 변수 initialLength 선언 및 초기화
        int initialLength = length;
        int i, j;

        // 감소 부분(첫번째 줄 ~ N번째 줄)
        for(i = 0; i < N; i++){
            // 공백 길이를 저장할 변수 differ 선언 및 초기화
            int differ = initialLength - length;
            // 공백이 있다면 출력
            if(differ > 0){
                for(int space = 0; space < differ/2; space++){
                    System.out.print(" ");
                }
            }
            for(j = length; j > 0; j--){
                System.out.print("*");
            }
            // 줄바꿈 처리
            System.out.print("\n");
            // 별 2개 감소
            if(length > 1){
            length -= 2;
            }
        }
        // 증가 부분(N번째 줄 ~ 마지막 줄)
        for(i = 1; i < N; i++){
            int differ = initialLength - length;
            if(differ > 0){
                for(int space = 1; space < differ/2; space++){
                    System.out.print(" ");
                }
            }
            // 별 2개 증가
            length += 2;
            for(j = length; j > 0; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}