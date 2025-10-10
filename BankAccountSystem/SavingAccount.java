package BankAccountSystem;

public class SavingAccount extends BankAccount {

private static final double INTEREST_RATE = 0.03; // 3%

 public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
}
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Savings withdrawal of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient balance in Savings Account!");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }
}

