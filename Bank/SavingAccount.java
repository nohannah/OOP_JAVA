package Bank;

public class SavingAccount extends Bank {
 
    public double InterestRate;
   

    public SavingAccount(int BankAccount, String AccountHolder, float Balance , int Year, double interestRate)
    {
        super(BankAccount,AccountHolder,Balance ,Year);
        this.InterestRate = interestRate;
    }
    //@Override
    public void addinterestRate()
    {    
        float BalanceAmount=(float)((super.Balance* InterestRate/100) *Year + super.Balance);
        System.out.println("The rate of this amount is : " + BalanceAmount + "in "+  super.Year + " Years" );
    }

}
