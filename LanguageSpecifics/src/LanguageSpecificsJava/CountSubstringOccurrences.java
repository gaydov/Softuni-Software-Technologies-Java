package LanguageSpecificsJava;

import java.util.Scanner;

public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String text = console.nextLine().toLowerCase();
        String pattern = console.nextLine().toLowerCase();

        int counter = 0;
        int index = text.indexOf(pattern);

        while (index != - 1) {

            counter++;
            index = text.indexOf(pattern, index + 1);
        }

        System.out.println(counter);
    }
}
