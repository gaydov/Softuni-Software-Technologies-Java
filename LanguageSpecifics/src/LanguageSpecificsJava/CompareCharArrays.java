package LanguageSpecificsJava;

import java.util.Scanner;

public class CompareCharArrays {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] firstInput = console.nextLine().split(" ");
        String[] secondInput = console.nextLine().split(" ");
        char[] firstCharArr = new char[firstInput.length];
        char[] secondCharArr = new char[secondInput.length];

        for (int i = 0; i < firstInput.length; i++) {
            firstCharArr[i] = firstInput[i].charAt(0);
        }

        for (int i = 0; i < secondInput.length; i++) {
            secondCharArr[i] = secondInput[i].charAt(0);
        }

        int shorterArr = Math.min(firstCharArr.length, secondCharArr.length);

        String firstStr = new String(firstCharArr);
        String secondStr = new String(secondCharArr);

        for (int i = 0; i < shorterArr; i++) {

            if (firstCharArr[i] < secondCharArr[i]) {

                System.out.println(firstStr);
                System.out.println(secondStr);
                return;

            } else if (firstCharArr[i] > secondCharArr[i]) {

                System.out.println(secondStr);
                System.out.println(firstStr);
                return;
            }
        }

        if (firstCharArr.length < secondCharArr.length) {

            System.out.println(firstStr);
            System.out.println(secondStr);

        } else {

            System.out.println(secondStr);
            System.out.println(firstStr);
        }

    }
}
