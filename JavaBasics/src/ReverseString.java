import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        char[] input = console.nextLine().toCharArray();
        StringBuilder sb = new StringBuilder(new String(input)).reverse();
        System.out.println(sb);
    }
}
