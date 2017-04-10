package LanguageSpecificsJava;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        System.out.println(Fib(n));
    }

    public static int Fib(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {

            int firstNum = 1;
            int secondNum = 1;
            int fibNum = 0;

            for (int i = 2; i <= n; i++) {

                fibNum = firstNum + secondNum;
                firstNum = secondNum;
                secondNum = fibNum;
            }
            return fibNum;
        }
    }
}
