package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Type a number: ");
        int year = scan.nextInt();

        if (isCapicua(year))
            System.out.println("Capicua");
        else
            System.out.println("Not Capicua");
    }

    public static boolean isCapicua(int year) {
        int n = year;
        int factor = 1000;
        int r = 0;

        while(n > 0) {
            r += (n % 10) * factor;
            n /= 10;
            factor /= 10;
        }
        return year == r;
    }
}
