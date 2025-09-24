package Week2;

public class LoanAccount {

    private int accountNumber;
    private String accountHolder;
    private double principal;
    private double annualInterestRate;
    private int years;

    // Constructor
    public LoanAccount(int accountNumber, String accountHolder, double principal, double annualInterestRate, int years) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.years = years;
    }

    // Method to calculate EMI
    public double calculateEMI() {
        double monthlyRate = annualInterestRate / 12 / 100;
        int months = years * 12;
        return (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
               (Math.pow(1 + monthlyRate, months) - 1);
    }

    // Method to print account details
    public void printAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Principal: " + principal);
        System.out.println("Annual Interest Rate: " + annualInterestRate + "%");
        System.out.println("Loan Term: " + years + " years");
        System.out.printf("Monthly EMI: %.2f%n", calculateEMI());
    }

    // Main method for testing
    public static void main(String[] args) {
        LoanAccount loan1 = new LoanAccount(101, "Alice", 200000, 9.5, 10);
        loan1.printAccountDetails();

        System.out.println();

        LoanAccount loan2 = new LoanAccount(102, "Bob", 100000, 7.5, 5);
        loan2.printAccountDetails();
    }
}


