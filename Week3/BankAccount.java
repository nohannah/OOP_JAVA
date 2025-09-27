package Week3;

public class BankAccount {
    private String accountnumber;
    private String holdername;
    private double balance;

    //constructor
    public BankAccount(String accountnumber, String holdername, double balance)
    {
        this.accountnumber= accountnumber ; 
        this.holdername =  holdername;
        this.balance=balance; 
    }
    //getter 
    public String getaccountnumber()
    {
        return accountnumber;
    }
    public String getholdername()
    {
        return holdername;
    }
    public double getbalance()
    {
        return balance;
    }
    //scatter 
    public void setaccountnumber(String accountnumber)
    {
        this.accountnumber= accountnumber;
    }
    public void setholdername(String holdername)
    {
        this.holdername= holdername;
    }
    public void setbalance(double balance)
    {
        this.balance= balance;
    }
    void deposite (double amount)
    {
        balance += amount;
        System.out.println("Amount deposited is : " + amount);
    }
    void withdraw(double amount)
    {
        if(amount > balance)
        {
            System.out.println("The amount is not enough");
        }
        else 
        {
            balance-= amount ;
            System.out.println("Your amount of withdraw is : " + amount);
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
