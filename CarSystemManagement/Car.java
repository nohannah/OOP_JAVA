// Car.java - Basic Car Class with Speed Tracking
public class Car {
    private String make;
    private String model;
    private String color;
    private double price;
    private double speed;
    private double speedLimit;

    public Car(String make, String model, String color, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
        this.speed = 0;
        this.speedLimit = 200; // default speed limit
    }

    // Part 1: Display details method
    public void displayDetails() {
        System.out.println("--- Car Details ---");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
    }

    // Part 2: Speed tracking methods
    public void accelerate(double amount) {
        double newSpeed = speed + amount;
        if (newSpeed > speedLimit) {
            System.out.println(make + " speed increased by " + amount + " km/h.");
            System.out.println("Speed limit reached! Current speed: " + speedLimit + " km/h");
            speed = speedLimit;
        } else {
            speed = newSpeed;
            System.out.println(make + " speed increased by " + amount + " km/h.");
        }
    }

    public void brake(double amount) {
        speed = Math.max(0, speed - amount);
        System.out.println(make + " speed decreased by " + amount + " km/h.");
    }

    // Overloaded methods with default values
    public void accelerate() {
        accelerate(10);
    }

    public void brake() {
        brake(5);
    }

    public void displaySpeed() {
        System.out.println("Current speed: " + speed + " km/h");
    }

    // Getters and Setters
    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public double getSpeed() { return speed; }
    public void setSpeed(double speed) { 
        if (speed >= 0 && speed <= speedLimit) {
            this.speed = speed;
        }
    }

    public double getSpeedLimit() { return speedLimit; }
    public void setSpeedLimit(double speedLimit) {
        if (speedLimit >= 0 && speedLimit <= 200) {
            this.speedLimit = speedLimit;
            System.out.println("Speed limit set to " + speedLimit + " km/h.");
        }
    }
}