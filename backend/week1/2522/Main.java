import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int length = 1; // 별의 길이
        int space; // 공백 개수
        
        // 첫째줄 ~ N번째줄
        for(int i = 0; i < N; i++){
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
            if(length < N){
                length++;
            }
        }

        // N번째줄 ~ 마지막줄
        for(int i = 1; i < N; i++){
            length--;
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