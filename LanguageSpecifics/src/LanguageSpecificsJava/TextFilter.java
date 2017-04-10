package LanguageSpecificsJava;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] bannedWords = console.nextLine().split(", ");
        String text = console.nextLine();


        for (String word:bannedWords) {

            if(text.contains(word)){

                text = text.replace(word, new String(new char[word.length()]).replace("\0", "*") );
            }
        }

        System.out.println(text);
    }
}
