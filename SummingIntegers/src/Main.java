import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();

        int N;
        do {
            N = scan.nextInt();
        } while(N <= 0);

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A + i;
        }

        System.out.println(sum);
    }
}
