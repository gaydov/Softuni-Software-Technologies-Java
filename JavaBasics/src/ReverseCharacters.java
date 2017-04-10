import java.util.Scanner;

public class ReverseCharacters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            String input = console.nextLine();
            sb.append(input);
        }
        System.out.println(sb.reverse());
    }
}
