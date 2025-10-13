package Abstract;

public class Main {
    public static void main(String[] args) {
        SavingAccount save= new SavingAccount("S201", 100.00,5.0);
        save.deposit(500.00);
        save.withdraw(200.00);
        save.calculateInterest();
        System.out.println("Saving Account Balance" + save.getBalance());
        System.out.println();
    }
    
}
