package LanguageSpecificsJava;

import java.util.Scanner;

public class VariableInHexFormat {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String input = console.nextLine().substring(2);
        int number = Integer.parseInt(input, 16);

        System.out.println(number);
    }
}
