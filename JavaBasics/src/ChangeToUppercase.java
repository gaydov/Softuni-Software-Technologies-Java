import java.util.Scanner;

public class ChangeToUppercase {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String text = console.nextLine();
        StringBuilder sb = new StringBuilder(text);

        int startIndex = sb.indexOf("<upcase>");

        while (startIndex != -1) {

            int endIndex = sb.indexOf("</upcase>");
            String lowerCase = sb.substring(startIndex + 8, endIndex);
            String upperCase = lowerCase.toUpperCase();
            sb.replace(startIndex, endIndex + 9, upperCase);

            startIndex = sb.indexOf("<upcase>");
        }

        System.out.println(sb);
    }
}
