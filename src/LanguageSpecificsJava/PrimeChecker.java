package LanguageSpecificsJava;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        long number = Long.parseLong(console.next());
        boolean isPrime = isPrime(number);

        if (isPrime == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean isPrime(long n) {

        boolean isPrime = true;
        if (n == 0 || n == 1) {
            isPrime = false;
        } else {
            for (int divisor = 2; divisor <= Math.sqrt(n); divisor++) {
                if (n % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        return isPrime;
    }
}
