package Practice2;

public class Bank {
    private String Bankname;
    private int Bankbalance;

    public Bank(String Bankname, int Bankbalance) {
        this.Bankname = Bankname;
        this.Bankbalance = Bankbalance;
    }
    public  String getBankname()
    {
        return Bankname;
    }
    public int getBankBalance()
    {
        return Bankbalance;
    }
    
    public void setBankname(String bankname)
    {
        Bankname=Bankname;
    }
    public void setBankBalance(double Bankbalance)
    {
        Bankbalance=Bankbalance;
    }

    public void deposite(double amount){
        Bankbalance += amount;
    }
    public void withdraw(double amount)
    {
        if(Bankbalance >= amount)
        {
            Bankbalance -= amount;
        }
        else 
        {
            System.out.println("Insufficient balance");
        }
    }
    void displayinfo()
    {
        System.out.println("Bank Name: " + Bankname);
        System.out.println("Bank Balance: " + Bankbalance);
    }

}
