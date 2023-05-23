package week1;
// 입력값을 받기 위해 Scanner 클래스 호출
import java.util.Scanner;

public class boj10869 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);

        scanner.close();
    }
}