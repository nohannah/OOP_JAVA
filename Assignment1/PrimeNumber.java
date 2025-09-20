package Assignment1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = num.nextInt();
        boolean isPrime = true;

        // numbers less than 2 are not prime
        if (n < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) { 
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

        num.close();
    }
}
