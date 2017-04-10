package LanguageSpecificsJava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String regex = "(?:^|\\s)([a-zA-Z0-9][\\-\\._a-zA-Z0-9]*)@[a-zA-Z\\-]+(\\.[a-z]+)+\\b";
        String input = console.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {

            System.out.println(matcher.group(0).trim());
        }
    }
}
