package week2.boj1463;
/* 처음 푼 방식 -> 실패(최소값을 찾지 못함)
/*
public class Main {
    public static void main(String[] args){
        int cnt = 0;

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while(num > 1){
            if((num%3) == 0){
                num /= 3;
                cnt++;
            } else if((num%2) == 0){
                num /= 2;
                cnt++;
            } else{
                num -= 1;
                cnt++;
            }
        }

        System.out.print(cnt);
        scanner.close();
    }
}
*/

// DP 사용
import java.util.Scanner;

public class boj1463 {
	static Integer[] dp;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		dp = new Integer[num + 1];
		dp[0] = 0;
		dp[1] = 0;

		System.out.println(recur(num));
		scanner.close();
	}

	static int recur(int num) {
		if (dp[num] == null) {
			// 6으로 나눠지는 경우
			if (num % 6 == 0) {
				dp[num] = Math.min(recur(num - 1), Math.min(recur(num / 3), recur(num / 2))) + 1;
			}
			// 3으로만 나눠지는 경우
			else if (num % 3 == 0) {
				dp[num] = Math.min(recur(num / 3), recur(num - 1)) + 1;
			}
			// 2로만 나눠지는 경우
			else if (num % 2 == 0) {
				dp[num] = Math.min(recur(num / 2), recur(num - 1)) + 1;
			}
			// 2와 3으로 나누어지지 않는 경우
			else {
				dp[num] = recur(num - 1) + 1;
			}
		}
		return dp[num];
	}
}