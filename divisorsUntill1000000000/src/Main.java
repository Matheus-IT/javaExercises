import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int qtt = 1;

        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                qtt++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        qtt++;

        System.out.println(qtt);
    }
}
