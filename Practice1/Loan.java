package Practice1;

public class Loan {

    private static final double MIN_INTEREST_RATE = 0.05; // constant
    private double interestRate;
    private double principle;
    private int years;

    // Constructor
    public Loan(double interestRate, double principle, int years) {
        if (interestRate < MIN_INTEREST_RATE) {
            this.interestRate = MIN_INTEREST_RATE;
        } else {
            this.interestRate = interestRate;
        }
        this.principle = principle;
        this.years = years;
    }

    // Method to display loan details
    public void printLoanDetails() {
        System.out.println("Principle: " + principle);
        System.out.println("Years: " + years);
        System.out.println("Interest Rate: " + interestRate);
    }

    // Main method to test
    public static void main(String[] args) {
        Loan loan1 = new Loan(0.03, 10000, 5); // interest < 0.05 → will use 0.05
        loan1.printLoanDetails();

        Loan loan2 = new Loan(0.07, 20000, 10); // interest >= 0.05
        loan2.printLoanDetails();
    }
}
