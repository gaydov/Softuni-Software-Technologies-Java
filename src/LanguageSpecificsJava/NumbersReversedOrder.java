package LanguageSpecificsJava;

import java.util.Scanner;

public class NumbersReversedOrder {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        System.out.println(reverseDigits(input));

    }

    public static String reverseDigits(String input) {

        String reversed = new StringBuilder(input).reverse().toString();
        return reversed;
    }
}
