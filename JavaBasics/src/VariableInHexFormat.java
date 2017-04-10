import java.util.Scanner;

public class VariableInHexFormat {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String hexNum = console.nextLine();
        int decNum = Integer.parseInt(hexNum, 16);
        System.out.println(decNum);
    }
}
