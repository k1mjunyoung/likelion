// 입력값을 받기 위해 Scanner 클래스 호출
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        // 별의 길이를 저장할 변수 length를 선언하고 첫번째 줄은 항상 1이므로 1로 초기화
        int length = 1;
        // 공백 길이를 저장할 변수 space 선언
        int space;
        
        // 첫째줄 ~ N번째줄
        for(int i = 0; i < N; i++){
            // N에서 length값을 빼서 구한 공백 길이를 space 변수에 저장
            space = N - length;
            // 공백이 있다면 별보다 먼저 출력
            if(space > 0){
                for(int s = 0; s < space; s++){
                    System.out.print(" ");
                }
            }
            // length에 저장된 별의 길이만큼 별 출력
            for(int j = 0; j < length; j++){
                System.out.print("*");
            }
            // 줄바꿈 처리
            System.out.print("\n");
            // 다음줄을 위해 별의 길이에 +1
            if(length < N){
                length++;
            }
        }

        // N번째줄 ~ 마지막줄
        for(int i = 1; i < N; i++){
            // 별의 길이 -1
            length--;
            // 공백 길이는 반복문이 실행될 때마다 변하므로 for문 안에서 초기화
            space = N - length;
            if(space > 0){
                for(int s = 0; s < space; s++){
                    System.out.print(" ");
                }
            }
            for(int j = 0; j < length; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}