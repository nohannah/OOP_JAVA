package Bank;

public class Loan extends SavingAccount {
    //public double LoanRate; 

    public Loan(int BankAccount, String AccountHolder, float Balance , int Year, double interestRate)
    {
        super( BankAccount,  AccountHolder, Balance , Year, interestRate);
        //this.LoanRate= LoanRate;
    }


    // Compound Interest calculation (compounded yearly)
    public void calculateCompoundInterest() {
        double A = super.Balance * Math.pow((1 + super.InterestRate / 100), super.Year);
        double CI = A - super.Balance;
       // System.out.println(" Compound Interest for " + super.Year + " year(s): " + CI);
        System.out.println(" Total Repayment : " + A);

    }
   
}
