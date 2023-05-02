import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int cnt = 0;

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        while(N > 1){
            if((N%3) == 0){
                N /= 3;
                cnt++;
            } else if((N%2) == 0){
                N /= 2;
                cnt++;
            } else{
                N -= 1;
                cnt++;
            }
        }

        System.out.print(cnt);
        scanner.close();
    }
}
