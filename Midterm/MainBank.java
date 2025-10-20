package Midterm;

public class MainBank {
    public static void main(String[] args) {
        SavingAccount save = new SavingAccount("SAVE123", 1000);

        save.deposit(500);          // deposit normally
        save.deposit(500, 50);      // deposit with bonus
        save.withdraw(300);         // withdraw some amount

        System.out.println("Balance: " + save.getBalance());
        System.out.println("Account Type: " + save.getAccountType());
        save.displayInfo();
    }
}
