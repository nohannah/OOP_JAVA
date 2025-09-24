package Week2;

// CurrentAccount.java
public class CurrentAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance; 
    private double overdraftLimit;
    
    public CurrentAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.overdraftLimit = 1000; // $1000 overdraft
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }
    
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Cannot withdraw - overdraft limit exceeded");
        }
    }
    
    public void displayInfo() {
        System.out.println("Current Account: " + accountNumber);
        System.out.println("Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
        System.out.println("Available: $" + (balance + overdraftLimit));
    }
    
    public double getBalance() {
        return balance;
    }
}