package Bank;


public class Bank  {
    int BankAccount;
    String AccountHolder;
    float Balance; 
    int Year;

    Bank (int BankAccount, String AccountHolder, float Balance,int Year)
    {
        this.BankAccount= BankAccount; 
        this.AccountHolder= AccountHolder; 
        this.Balance=Balance; 
        this.Year= Year; 
    }
    void deposit (float amount)
    {
        Balance += amount; 
        System.out.println("Your desopit amount is :" + amount);
    }
    void display()
    {
        System.out.println("This is your current balance :" + Balance);
    }
    void withdraw( double amount)
    {
        if (amount > Balance ){
            System.out.println("The amount is not enough");
        }
        else {
            Balance -= amount; 
            System.out.println("The amount withdrawn is : " + amount );
        }
    }
}
