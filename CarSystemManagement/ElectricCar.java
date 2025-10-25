package CarSystemManagement;

// ElectricCar.java - Electric Car specialization (extends Car)
public class ElectricCar extends Car {
    private double batteryCapacity;
    private double chargeLevel;

    public ElectricCar(String make, String model, String color, double price, 
                      double batteryCapacity, double chargeLevel) {
        super(make, model, color, price);
        this.batteryCapacity = batteryCapacity;
        this.chargeLevel = Math.min(chargeLevel, 100);
    }

    public void chargeBattery(double amount) {
        chargeLevel = Math.min(100, chargeLevel + amount);
        System.out.println("Battery charged by " + amount + "%. Current charge: " + chargeLevel + "%");
    }

    public double calculateRange() {
        return (batteryCapacity * chargeLevel / 100) * 5;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charge Level: " + chargeLevel + "%");
    }

    // Getters
    public double getBatteryCapacity() { return batteryCapacity; }
    public double getChargeLevel() { return chargeLevel; }
}
