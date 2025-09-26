package Bank;

public class Loan extends Bank {
    public double LoanRate; 

    public Loan(int BankAccount, String AccountHolder, float Balance , int Year, double LoanRate)
    {
        super(BankAccount,AccountHolder,Balance ,Year);
        this.LoanRate= LoanRate;
    }

    // // Simple Interest calculation
    // public void calculateSimpleInterest() {
    //     double SI = (super.Balance * LoanRate * super.Year) / 100;
    //     System.out.println(" Simple Interest for " + super.Year + " year(s): " + SI);
    //     System.out.println(" Total Repayment (P + I): " + (super.Balance + SI));
    // }

    // Compound Interest calculation (compounded yearly)
    public void calculateCompoundInterest() {
        double A = super.Balance * Math.pow((1 + LoanRate / 100), super.Year);
        double CI = A - super.Balance;
        System.out.println(" Compound Interest for " + super.Year + " year(s): " + CI);
        System.out.println(" Total Repayment (P + I): " + A);

    }
   
}
