package BankAccountSystem;

public class BankAccount {
    protected String AccountNumber;
    protected double balance;
    
    public BankAccount(String AccountNumber , double balance){
        this.AccountNumber=AccountNumber;
        this.balance=balance;
    }
    void deposit(double balance)
    {
        balance+= amount ;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);

    }
    void withdraw( double amount){
    System.out.println("Withdrawal rules depend on account type.");
    }
    public double calculateInterst(){
        return 0,0;
    }
    public String toString(){
    return "Account: " + accountNumber + " | Balance: $" + balance;

    }
}

