// Write a Java program to create a class called "Circle" with a radius attribute.
//  You can access and modify this attribute. Calculate the area and circumference of the circle.
package Practice;
import static java.lang.Math.PI;

import java.util.Scanner;
public class Circle {
    private double radius ; 

    public Circle(double radius)
    {
        this.radius=radius;
    }
    public double gettRadius()
    {
        return radius; 
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public double getArea()
    {
        return PI * Math.pow(radius, 2);
    }
    public double getCircumference()
    {
        return PI*2*radius;
    }

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the radius of this circle: ");
        //assign the input to the main class
        double r=n.nextDouble();
        Circle c = new Circle(r);

        // Print out the method 
        System.out.println("The Area of this circle is : " +  c.getArea());
        System.out.println("The Area of this circle is : " +  c.getCircumference());
        n.close();
    }
   
}
