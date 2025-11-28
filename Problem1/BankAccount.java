package Problem1;

public class BankAccount {
    
    private double balance ;
    
    public BankAccount( double balance)
    {
        this.balance = balance;
    }
    public void withdraw(double amount) throws InsufficientBalanceException {
        if(amount> balance){
            throw new InsufficientBalanceException("Insufficient balance for withdrawal of " );
        }  
            this.balance -= amount;
            System.out.println("Withdrew successful new balance " + balance);
        }
    }
    

