import java.util.Scanner;

public class CensorEmailAdress {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String inputEmail = console.nextLine();
        String text = console.nextLine();

        String[] emailSplit = inputEmail.split("@");
        String username = emailSplit[0];
        String domain = emailSplit[1];
        username = username.replaceAll(".", "*");
        String censoredEmail = username + "@" + domain;

        String result = text.replaceAll(inputEmail, censoredEmail);
        System.out.println(result);
    }
}
