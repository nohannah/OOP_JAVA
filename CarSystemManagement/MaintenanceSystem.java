package CarSystemManagement;

public class MaintenanceSystem {
    private double mileage;
    private double fuelEfficiency; // in km/l

    public MaintenanceSystem(double mileage, double fuelEfficiency) {
        this.mileage = 0;
        this.fuelEfficiency = 10;
    }
      // Getters and Setters
    public double getMileage() { return mileage; }
    public void setMileage(double mileage) { this.mileage = mileage; }
    
    public double getFuelEfficiency() { return fuelEfficiency; }
    public void setFuelEfficiency(double fuelEfficiency) { 
        this.fuelEfficiency = fuelEfficiency; 
    }
    public String serviceRequired(){
        if(mileage >= 10000){
            return "Service Required";
        }
        return "No service needed";
    }
    public double calculateRange(double fuelAmount)
    {
        return fuelAmount * fuelEfficiency;
    }
    public void displayRange(double fuelAmount){
        double range = calculateRange(fuelAmount);
        System.out.println("The car can travel approximately " + range + " km with " + fuelAmount + " liters of fuel.");
    }

}
