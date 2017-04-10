import java.util.Scanner;

public class IndexOfLetters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        char[] alphabet = new char[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('a' + i);
        }

        char[] input = console.nextLine().toCharArray();
        String newLine = System.getProperty("line.separator");

        for (int i = 0; i < input.length; i++) {
            int alphabetIndex = 0;

            for (int j = 0; j < alphabet.length; j++) {
                if (input[i] == alphabet[j]) {
                    alphabetIndex = j;
                    break;
                }
            }
            System.out.printf("%s -> %s%s", input[i], alphabetIndex, newLine);
        }
    }
}
