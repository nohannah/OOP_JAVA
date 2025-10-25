package CarSystemManagement;

public class Car {
    private String make; 
    Private String model;
    Private String color;
    private double price;
    private double speed;
    private double speedLimit;
    public car(String make, String model, String color, double price){
        this.make=make; 
        this.model=model; 
        this.color=color;
        this.price=price;
        this.speed=0;
        this.speedLimit=200; // default speed limit

    }
    public  String getmake(){
        return make;
    }
    public String getString(){
        return model;
    }
    public String getcolor(){
        return color;

    }
    public double getprice(){
        retrun price;
    }
    public double getspeed(){
        return speed;
    }
    public double getspeedLimit(){
        return speedLimit;
    }
    public void setcolor(String color){
        this.color=color;
    }
    public void setprice(double price){
        this.price=price;
    }
    public void setmodel(String model){
        this.model=model;
    }
    public void setspeed(double speed){
        if(speed >= 0 && speed <= speedLimit){
            this.speed=speed;
        }

    }
    public void setspeedLimit(double speedLimit){
        if(speedLimit >0 && speedLimit <=200){
            this.speedLimit=speedLimit;
            System.out.println("Speed limit set to " + speedLimit + "km/h");
        }
    }
    
    public void displayDetails(){
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Price: $" + price);
    }

public class accelerate(double amount){
    double newSpeed = speed + amount ;
    if(newSpeed > speedLimit){
        System.out.println(make + "Speec increased to " + amount+ "km/h");
        System.out.println("speed limit exceeded! Current speed:" + speedLimit + "km/h");
        speed = speedLimit;
    }   
    else {
        speed= newSpeed;
        System.out.println(make + "Speed increased to " + speed + "km/h");
    }
}
public  void brake (double amount){
    speed= Math.max(0,speed - amount);
    System.out.println(make + "Speed decreased to " + speed + "km/h");
}
public void accelerate(){
    accelerate(10);
}
public void brake(){
    brake(5);
}
public void displaySpeed(){
    System.out.println(make + "Current speed: " + speed + "km/h");
}
}