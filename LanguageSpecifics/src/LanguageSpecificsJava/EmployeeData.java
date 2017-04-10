package LanguageSpecificsJava;

import java.util.Scanner;

public class EmployeeData {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String firstName = console.nextLine();
        String lastName = console.nextLine();
        int age = Integer.parseInt(console.nextLine());
        char gender = console.nextLine().charAt(0);
        long personalID = Long.parseLong(console.nextLine());
        int employeeID = Integer.parseInt(console.nextLine());

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Personal ID: " + personalID);
        System.out.println("Unique Employee number: " + employeeID);
    }
}
