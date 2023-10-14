import java.io.*;
import java.util.*;

public class Main {
    static Map<Character, Integer> returnDate = new HashMap<>();
    static Map<Character, Integer> dueDate = new HashMap<>();

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        returnDate.put('D', scan.nextInt());
        returnDate.put('M', scan.nextInt());
        returnDate.put('Y', scan.nextInt());

        dueDate.put('D', scan.nextInt());
        dueDate.put('M', scan.nextInt());
        dueDate.put('Y', scan.nextInt());

        int fine = 0;
        if (isYearDelayed())
            fine = 10000;
        else if (isMonthDelayed()) {
            if (isYearSameOrAfter())
                fine = 500 * (returnDate.get('M') - dueDate.get('M'));
        } else if (isDayDelayed())
            fine = 15 * (returnDate.get('D') - dueDate.get('D'));
        else if (!isDayDelayed() && !isMonthDelayed())
            /* Do nothing */;
        else
            throw new Exception("Something went wrong...");

        System.out.println(fine);
    }

    // Helper methods
    static boolean isYearDelayed() {
        return returnDate.get('Y') - dueDate.get('Y') > 0;
    }

    static boolean isMonthDelayed() {
        return returnDate.get('M') - dueDate.get('M') > 0;
    }

    static boolean isYearSameOrAfter() {
        return returnDate.get('Y') - dueDate.get('Y') >= 0;
    }

    static boolean isDayDelayed() {
        return returnDate.get('D') > dueDate.get('D');
    }
}