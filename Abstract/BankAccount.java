package Abstract;

import Bank.Bank;

public abstract class BankAccount implements AccountOperation {
    protected String accountNumber;
    protected double balance; 

    public BankAccount(String accountNumber, double balance)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public String getAccountNumber()
    {
        return accountNumber; 
    }
     public double getBalance()
    {
        return balance; 
    }
    protected void setBalance(double balance)
    {
        this.balance=balance;
    }
    
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
