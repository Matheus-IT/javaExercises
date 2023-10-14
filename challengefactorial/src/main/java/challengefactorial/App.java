package challengefactorial;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int result = calcFactorial(n);

        System.out.println(result);
        scan.close();
    }

    static int calcFactorial(int n) {
        if (n == 1)
            return 1;
        return n * calcFactorial(n - 1);
    }
}
