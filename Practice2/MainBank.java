package Practice2;

public class MainBank {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount("F001", 1000);
        sa.deposite(500);
        sa.deposite(300, 50); // Depositing with bonus
        sa.withdraw(200);
        sa.displayinfo();
    }
    
}
