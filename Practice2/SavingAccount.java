package Practice2;

public class SavingAccount extends Bank 
{
    private final String accountType = "Saving Account";

    public SavingAccount(String Bankname, int Bankbalance) {
        super(Bankname, Bankbalance);
    }
    public void deposite ( double amount)
    {
        super.deposite(amount);
    }
    public void deposite(double amount , double bonus)
    {
        super.deposite(amount + bonus);
    }
    @Override
    void displayinfo()
    {
        super.displayinfo();
        System.out.println("Account Type: " + accountType);
    }

    
}
