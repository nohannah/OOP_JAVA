package Abstract;

public class SavingAccount extends BankAccount{
    private double interestRate;

    private static final double INTEREST_RATE = 0.03; // 3%

 public SavingAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
}
public void deposit(double amount)
{
    if(amount>0)
    {
        balance+= amount;
        System.out.println("Saving deposit amount $ " + amount + "Sussessful");
    }
    else 
        {
            System.out.println("Deposit amount must be positive");
        }
    
}
public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Savings withdrawal of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient balance in Savings Account!");
        }
    }

    
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }
}
