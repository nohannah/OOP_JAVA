package Abstract;

public class CurrentAccount extends BankAccount {
    protected double overdraftlimit; 

    public CurrentAccount(String accountNumber, double balance, double overdraftlimit){
        super(accountNumber, balance);
        this.overdraftlimit=overdraftlimit;

    }
    @Override
    public void deposit(double amount)
    {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    @Override 
    public void withdraw(double amount)
    {
        if(amount> 0 && balance - amount >= -overdraftlimit)
        {
            balance-= amount;
            System.out.println("Withdraw: " + amount);

        }
        else {
            System.out.println("Overdraft limit the exceeded or  invalid amount.");
        }
    }
    

}
