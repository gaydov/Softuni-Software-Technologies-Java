import java.util.Scanner;

public class BooleanVariable {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        boolean boolVar = Boolean.parseBoolean(input);

        if (boolVar) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
