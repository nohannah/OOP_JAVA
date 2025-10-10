package Bank;
public class Bankmain {
    public static void main (String[] args )
    {
        Loan b1= new Loan(1234555 ,"BOA" , 5000, 2,15);
        Loan b2 = new Loan(738202, "Chase", 1200, 3 ,10);
        System.out.println("Account Holder name : " +  b1.AccountHolder + " || "  + " The account Balance is : " + b1.Balance);
        b1.deposit(1300);
        b1.withdraw(200) ;
        //b1.display();
        b1.addinterestRate();  
        b1.calculateCompoundInterest();     
        System.out.println(b1);

        b2.deposit(2300);
        b2.withdraw(300);
        //b2.display();
        b2.addinterestRate();
        System.out.println(b2);

    }
}