import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int length = (2 * N) - 1;
        int initialLength = length;
        int i, j;

        // 감소 부분
        for(i = 0; i < N; i++){
            int differ = initialLength - length;
            if(differ > 0){
                for(int space = 0; space < differ/2; space++){
                    System.out.print(" ");
                }
            }
            for(j = length; j > 0; j--){
                System.out.print("*");
            }
            System.out.print("\n");
            if(length > 1){
            length -= 2;
            }
        }
        // 증가 부분
        for(i = 1; i < N; i++){
            int differ = initialLength - length;
            if(differ > 0){
                for(int space = 1; space < differ/2; space++){
                    System.out.print(" ");
                }
            }
            length += 2;
            for(j = length; j > 0; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}