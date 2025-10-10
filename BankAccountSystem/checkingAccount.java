package BankAccountSystem;

public class checkingAccount {

    private static final double TRANSACTION_FEE = 1.50;

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        double total = amount + TRANSACTION_FEE;
        if (total <= balance) {
            balance -= total;
            System.out.println("Checking withdrawal of $" + amount + " (fee $" + TRANSACTION_FEE + ") successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient balance in Checking Account!");
        }
    }

    @Override
    public double calculateInterest() {
        return 0.0; // no interest for checking accounts
    }
}
