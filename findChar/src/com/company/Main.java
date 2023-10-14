package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

	    System.out.print("Type a word: ");
	    String userInput = scan.nextLine();

	    System.out.print("Type a character to search: ");
	    char ch = scan.next().charAt(0);

	    System.out.printf("The letter '%c' appears %d times in \"%s\"\n", ch, numOfTimes(userInput, ch), userInput);

    }

    static int numOfTimes(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == ch)
                count++;
        return count;
    }
}
