package Problem1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(500); // initial balance

        try {
            System.out.print("Enter withdrawal amount: ");
            String input = sc.nextLine();

            // may cause NumberFormatException
            double amount = Double.parseDouble(input);

            // may throw custom exception
            account.withdraw(amount);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number! Please enter a valid numeric amount.");

        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);

        } finally {
            System.out.println("Transaction process completed.");
        }

        sc.close();
    }
}

