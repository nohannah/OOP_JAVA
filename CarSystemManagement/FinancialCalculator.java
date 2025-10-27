package CarSystemManagement;
// FinancialCalculator.java - Handles purchase and insurance calculations
public class FinancialCalculator {
    
    public double calculateTotalCost(double downPayment, double monthlyPayment, int months) {
        return downPayment + (monthlyPayment * months);
    }

    public double calculateInsurance(double baseRate, int carAge) {
        if (carAge > 5) {
            return baseRate * 0.9; // 10% discount
        }
        return baseRate;
    }

    public void displayCosts(double downPayment, double monthlyPayment, int months, double baseRate, int carAge) {
        double totalCost = calculateTotalCost(downPayment, monthlyPayment, months);
        double insuranceCost = calculateInsurance(baseRate, carAge);
        
        System.out.println("Total Cost: $" + totalCost);
        System.out.println("Insurance Cost: $" + insuranceCost);
    }
}