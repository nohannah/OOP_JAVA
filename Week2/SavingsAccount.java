package Week2;

public class SavingsAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance; 
    private double interestRate;
    
    public SavingsAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.interestRate = 0.05; // 5% interest rate
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }
    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }
    
    public void applyInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest applied: $" + interest);
    }
    
    public void displayInfo() {
        System.out.println("Savings Account: " + accountNumber);
        System.out.println("Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
    }
    
    public double getBalance() {
        return balance;
    }
    
}
