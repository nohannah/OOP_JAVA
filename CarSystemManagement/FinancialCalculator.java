package CarSystemManagement;

public class FinancialCalculator {
    public double calculator(double price, double downPayment, double monthlyPayment , int months){
        return downPayment + (monthlyPayment * months);
    }
    public double calculateInterest(double baseRate, int carAge){
        if(carAge > 5)
        {
            return baseRate + 0.9 ;
        }
        return baseRate;
        
    }
    public void displayCost(double downPayment, double monthlyPayment, int months, double baseRate, int carAge)
    {
        double totalCost = calculator(0, downPayment, monthlyPayment, months);
        double interestRate = calculateInterest(baseRate, carAge);
        System.out.println("Total Cost of the Car: $" + totalCost);
        System.out.println("Applicable Interest Rate: " + interestRate + "%");
    }
    
}
