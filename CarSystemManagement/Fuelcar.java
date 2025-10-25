package CarSystemManagement;

public class Fuelcar {
    // FuelCar.java - Fuel Car specialization (extends Car)
public class FuelCar extends Car {
    private double fuelTankCapacity;
    private double currentFuel;

    public FuelCar(String make, String model, String color, double price, 
                  double fuelTankCapacity) {
        super(make, model, color, price);
        this.fuelTankCapacity = fuelTankCapacity;
        this.currentFuel = 0;
    }

    public void refuel(double amount) {
        if (currentFuel + amount <= fuelTankCapacity) {
            currentFuel += amount;
            System.out.println("Refueled " + amount + "L successfully.");
        } else {
            double refuelAmount = fuelTankCapacity - currentFuel;
            currentFuel = fuelTankCapacity;
            System.out.println("Refueled " + refuelAmount + "L. Tank is now full.");
        }
    }

    public double calculateRange(double fuelEfficiency) {
        return currentFuel * fuelEfficiency;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " L");
        System.out.println("Current Fuel: " + currentFuel + " L");
    }

    // Getters
    public double getFuelTankCapacity() { return fuelTankCapacity; }
    public double getCurrentFuel() { return currentFuel; }
}
    
}
