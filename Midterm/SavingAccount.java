package Midterm;

public class SavingAccount extends BankAccount {

    private final String accountType = "SAVINGS"; // fixed account type

    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // Method 1: deposit (normal)
    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    // Method 2: deposit with bonus (overloading)
    public double deposit(double amount, double bonus) {
        balance += amount + bonus;
        return balance;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Account Type: " + accountType);
        super.displayInfo();
    }

    public String getAccountType() {
        return accountType;
    }
}
