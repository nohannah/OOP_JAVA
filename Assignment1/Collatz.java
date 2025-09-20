package Assignment1;

import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = num.nextInt(), count = 0;

        if (n == 0) {
            System.out.print("0 ");   
            n = 1;
            count = 1;
            System.out.print("1");
        } else if (n > 0) {
            System.out.print(n + " "); 
            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }
                count++;
                System.out.print(n + " ");
            }
        }

        System.out.print("\nSteps = " + count);
        num.close();
    }
}
