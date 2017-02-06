package LanguageSpecificsJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ExtractSentencesbyKeyword {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String keyword = console.nextLine();
        String[] sentences = console.nextLine().split("\\.|!|\\?");
        String regex = "\\W";

        ArrayList<String> results = new ArrayList<>();

        for (String sentence : sentences) {

            String[] words = sentence.split(regex);

            for (int i = 0; i < words.length; i++) {

                if (words[i].equals(keyword)) {

                    results.add(sentence);
                    break;
                }
            }
        }

        for (String keySentence : results) {

            System.out.println(keySentence.trim());
        }
    }
}
