package Week2;

public class BankAccount {
    String accountnumber;
    String holdername;
    double balance; 

    BankAccount ( String accountnumber , String holdername, double balance)
    {
        this.accountnumber= accountnumber; 
        this.holdername=holdername;
        this.balance=balance;
    }
    void deposit ( double amount)

    {
        balance += amount; 
        System.out.println("Amount deposited is : " + amount);
    }
    void withdraw( double amount)
    {
        if (amount > balance ){
            System.out.println("The amount is not enough");
        }
        else {
            balance -= amount; 
            System.out.println("The amount withdrawn is : " + amount );
        }
    }
    void display()
    {
        System.out.println("The current balance is :" + this.balance);
    }
    @Override
    public String toString()
    {
        return " Account number is " + this.accountnumber + " holder name is " + this.holdername + " balance is " + this.balance ;
    }
}
