package BankAccountSystem;

public class BankSystemTest {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[2];
        accounts[0]= new SavingAccount ("H-003" , 6000);
        accounts[1]= new SavingAccount ("H-005" , 89000);

        for(BankAccount acc : accounts)
        {
            System.out.println(acc.toString());
            System.out.println("Interst: $" + acc.calculateInterest());
            acc.withdraw(200);
            System.err.println();
        }
    }
}
