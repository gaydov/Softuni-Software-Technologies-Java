package LanguageSpecificsJava;

import java.util.Scanner;

public class SumReversedNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split(" ");
        int sum = 0;

        for (int i = 0; i < input.length; i++) {

            String numRevStr = new StringBuilder(input[i]).reverse().toString();
            int currentNum = Integer.parseInt(numRevStr);
            sum+= currentNum;
        }

        System.out.println(sum);
    }
}
