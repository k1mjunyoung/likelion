package week1.boj10757;

// 입력 예시 값이 long 자료형이 표현할 수 있는 값을 넘어섬
// long 자료형보다 큰 값을 처리하기 위해 BigInteger 클래스 호출
import java.math.BigInteger;
import java.util.Scanner;

public class boj10757{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();

        // BigInteger는 일반적인 연산자를 사용할 수 없으므로 add 메소드를 이용하여 계산
        System.out.println(A.add(B));
        scanner.close();
    }
}