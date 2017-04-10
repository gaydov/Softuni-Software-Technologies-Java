
import java.util.LinkedHashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        LinkedHashMap<String, String> phonebook = new LinkedHashMap<String, String>();
        String[] input = console.nextLine().split(" ");

        while (!input[0].equals("END")) {

            String command = input[0];
            String name = input[1];


            switch (command) {

                case "A":

                    String number = input[2];

                    if (!phonebook.containsKey(name)) {

                        phonebook.put(name, number);
                    } else {
                        phonebook.remove(name);
                        phonebook.put(name, number);
                    }
                    break;

                case "S":

                    String newLine = System.getProperty("line.separator");

                    if (!phonebook.containsKey(name)) {

                        System.out.printf("Contact %s does not exist.%s", name, newLine);
                    } else {

                        System.out.printf("%s -> %s%s", name, phonebook.get(name), newLine);
                    }
                    break;
            }

            input = console.nextLine().split(" ");
        }
    }
}
