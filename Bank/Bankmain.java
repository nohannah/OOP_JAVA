package Bank;
public class Bankmain {
    public static void main (String[] args )
    {
        SavingAccount b1= new SavingAccount(1234555 ,"BOA" , 5000, 2,0.5);
        SavingAccount b2 = new SavingAccount(738202, "Chase", 1200, 3 ,0.5);
        b1.deposit(1300);
        b1.withdraw(200);
        b1.display();
        b1.addinterestRate();       
        System.out.println(b1);

        b2.deposit(2300);
        b2.withdraw(300);
        b2.display();
        b2.addinterestRate();
        System.out.println(b2);

    }
}