package CarSystemManagement;
// CarManagementDemo.java - Main class to test all components
public class CarManagementDemo {
    public static void main(String[] args) {
        System.out.println("=== Testing Car with Speed Tracking ===");
        
        // Test Car with speed tracking (Part 1 + Part 2)
        Car myCar = new Car("Toyota", "Corolla", "Blue", 25000);
        myCar.displayDetails();
        System.out.println();

        // Test speed tracking methods
        myCar.accelerate(30);
        myCar.displaySpeed();
        myCar.brake(10);
        myCar.displaySpeed();
        myCar.accelerate();
        myCar.brake();
        myCar.displaySpeed();
        System.out.println();

        // Test speed limiter
        myCar.setSpeedLimit(100);
        myCar.accelerate(150);
        myCar.displaySpeed();
        System.out.println();

        // Test other components
        MaintenanceSystem maintenance = new MaintenanceSystem();
        FinancialCalculator finance = new FinancialCalculator();
        CustomFeaturesManager features = new CustomFeaturesManager();

        // Test Maintenance
        maintenance.setMileage(12000);
        System.out.println(maintenance.serviceRequired());
        maintenance.displayRange(15);
        System.out.println();

        // Test Financial Calculator
        finance.displayCosts(5000, 400, 48, 2000, 6);
        System.out.println();

        // Test Custom Features
        features.addFeature("Sunroof");
        features.addFeature("Bluetooth", "Rear Camera", "Heated Seats");
        features.displayFeatures();
        System.out.println();

        // Test Electric Car
        System.out.println("=== Testing Electric Car ===");
        ElectricCar tesla = new ElectricCar("Tesla", "Model 3", "Red", 55000, 75, 80);
        tesla.displayDetails();
        tesla.chargeBattery(10);
        System.out.println("Updated Range: " + tesla.calculateRange() + " km");
        System.out.println();

        // Test Fuel Car
        System.out.println("=== Testing Fuel Car ===");
        FuelCar honda = new FuelCar("Honda", "Civic", "White", 28000, 50);
        honda.displayDetails();
        honda.refuel(30);
        System.out.println("Range: " + honda.calculateRange(18) + " km");
        System.out.println();

        // Test Dealership
        System.out.println("=== Testing Dealership ===");
        CarDealership dealership = new CarDealership();
        dealership.addCar(myCar);
        dealership.addCar(tesla);
        dealership.addCar(honda);
        dealership.listInventory();
    }
}