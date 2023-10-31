package org.example;

import java.util.Arrays;
import java.util.Stack;
import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var input = "[({})](]";
        System.out.println(isBalanced(input));
    }

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : input.toCharArray()) {
            if (isOpeningBracket(bracket)) {
                stack.push(bracket);
            } else {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), bracket)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isOpeningBracket(char bracket) {
        return bracket == '(' || bracket == '{' || bracket == '[';
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}