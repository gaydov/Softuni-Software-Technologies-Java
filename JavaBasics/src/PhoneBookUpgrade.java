import java.util.*;

public class PhoneBookUpgrade {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Map<String, String> phonebook = new TreeMap<String, String>();
        String[] input = console.nextLine().split(" ");

        while (!input[0].equals("END")) {

            String command = input[0];

            switch (command) {

                case "A":
                    String name = input[1];
                    String number = input[2];

                    if (!phonebook.containsKey(name)) {

                        phonebook.put(name, number);
                    } else {
                        phonebook.remove(name);
                        phonebook.put(name, number);
                    }
                    break;

                case "S":
                    name = input[1];
                    String newLine = System.getProperty("line.separator");

                    if (!phonebook.containsKey(name)) {

                        System.out.printf("Contact %s does not exist.%s", name, newLine);
                    } else {
                        System.out.printf("%s -> %s%s", name, phonebook.get(name), newLine);
                    }
                    break;
                case "ListAll":
                    for (Map.Entry<String, String> entry : phonebook.entrySet()) {
                        System.out.println(entry.getKey() + " -> " + entry.getValue());
                    }
                    break;
            }

            input = console.nextLine().split(" ");
        }
    }
}
