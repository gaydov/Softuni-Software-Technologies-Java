package LanguageSpecificsJava;

import java.util.Scanner;

public class IntegertoHexandBinary {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int decimalNum = Integer.parseInt(console.nextLine());
        String hex = Integer.toHexString(decimalNum);
        String binary = Integer.toBinaryString(decimalNum);

        System.out.println(hex.toUpperCase());
        System.out.println(binary);
    }
}
