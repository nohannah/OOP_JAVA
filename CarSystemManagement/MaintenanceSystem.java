// MaintenanceSystem.java - Handles maintenance and fuel calculations
public class MaintenanceSystem {
    private double mileage;
    private double fuelEfficiency;

    public MaintenanceSystem() {
        this.mileage = 0;
        this.fuelEfficiency = 10; // default km per liter
    }

    public String serviceRequired() {
        if (mileage > 10000) {
            return "Service required!";
        }
        return "No service needed.";
    }

    public double calculateRange(double fuelAmount) {
        return fuelAmount * fuelEfficiency;
    }

    public void displayRange(double fuelAmount) {
        double range = calculateRange(fuelAmount);
        System.out.println("Range: " + range + " km");
    }

    // Getters and Setters
    public double getMileage() { return mileage; }
    public void setMileage(double mileage) { this.mileage = mileage; }
    
    public double getFuelEfficiency() { return fuelEfficiency; }
    public void setFuelEfficiency(double fuelEfficiency) { 
        this.fuelEfficiency = fuelEfficiency; 
    }
}