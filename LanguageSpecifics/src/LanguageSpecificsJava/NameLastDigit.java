package LanguageSpecificsJava;

import java.util.Scanner;

public class NameLastDigit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        long inputNum = Long.parseLong(console.nextLine());
        System.out.println(getLastDigitWord(inputNum));
    }

    public static String getLastDigitWord(long number) {

        long lastDigit = Math.abs(number) % 10;
        String lastDigitWord = "";

        switch ((int) lastDigit) {

            case 0:
                lastDigitWord = "zero";
                break;
            case 1:
                lastDigitWord = "one";
                break;
            case 2:
                lastDigitWord = "two";
                break;
            case 3:
                lastDigitWord = "three";
                break;
            case 4:
                lastDigitWord = "four";
                break;
            case 5:
                lastDigitWord = "five";
                break;
            case 6:
                lastDigitWord = "six";
                break;
            case 7:
                lastDigitWord = "seven";
                break;
            case 8:
                lastDigitWord = "eight";
                break;
            case 9:
                lastDigitWord = "nine";
                break;
        }

        return lastDigitWord;
    }
}
