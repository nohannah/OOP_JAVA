package Week2;
 public class Car{
    String make ; 
    String model; 
    int year ; 
    String color; 

    Car (String make , String model , int year , String color)
    {
        this.make= make;
        this.model=model;
        this.year=year;
        this.color=color;
    }
    void startCar()
    {
        System.out.println( this.make + "" + this.model + " Car is starting" );
    }
    @Override //learn in future
    public String toString()
    {
        return " Car make is " + this.make + " model is " + this.model + " year is " + this.year + " color is " + this.color ;
    }
 }