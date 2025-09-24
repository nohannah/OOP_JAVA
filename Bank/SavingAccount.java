package Bank;

public class SavingAccount extends Bank {
 
    public double InterestRate;
   

    public SavingAccount(int BankAccount, String AccountHolder, int Balance , int Year, double interestRate)
    {
        super(BankAccount,AccountHolder,Balance ,Year);
        this.InterestRate= 0.5;
    }

    public void addinterestRate()
    {
        float rate=(float)((Balance* InterestRate/100) *Year);
        
        System.out.println("The rate of this amount is : " + rate + "in a year" );
    }

}
