/* Scanner 사용 시 너무 오래걸림..
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while(scanner.hasNextInt()){
            int num = scanner.nextInt();
            if(num > 0){
                count++;
            }
        }
        System.out.print(count);
        scanner.close();
    }
}
*/

// BufferedReader 사용해보려 헀으나 시간초과 오류..
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        InputStream input = System.in;
        InputStreamReader reader = new InputStreamReader(input);
        BufferedReader buffer = new BufferedReader(reader);
        StringTokenizer tokenizer = new StringTokenizer(buffer.readLine());

        int i = 0;
        int size = 0;
        int cnt = 0;

        while(tokenizer.hasMoreTokens()){
            size++;
        }

        int[] arr = new int[size];

        for(i = 0; i < size; i++){
            arr[i] = Integer.parseInt(tokenizer.nextToken());
            if(arr[i] > 0)
            {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
