import java.util.Scanner;

public class FitStringin20Chars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        if (input.length() < 20) {

            int starsCount = 20 - input.length();
            StringBuilder sb = new StringBuilder(input);

            for (int i = 0; i < starsCount; i++) {
                sb.append('*');
            }
            System.out.println(sb);

        } else {
            System.out.println(input.substring(0, 20));
        }
    }
}
