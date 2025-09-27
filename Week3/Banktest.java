package Week3;

public class Banktest {
     public static void main (String[] args )
    {
        BankAccount b1= new BankAccount("1234555" ,"Hannah" , 90000);
        BankAccount b2 = new BankAccount("12893747474", "Sana", 11200);
        b1.deposite(1300);
        b1.withdraw(200);
        b1.display();
        System.out.println(b1);

        b2.deposite(2300);
        b2.withdraw(300);
        b2.display();
        System.out.println(b2);

    }
}
