// Class: Rectangle with length and width
// Methods: getArea(), getPerimeter()
// In main(), create 2 rectangles and compare their areas.

package Practice;
import java.util.Scanner;

public class Ractangle {
    private float length ; 
    private float width ; 
    Ractangle ( float length , float width )
    {
        this.length = length ; 
        this.width = width; 
    }
    public float getLength()
    {
        return length;
    }
    public float getwidth()
    {
        return width;
    }

    public void setLength(float length)
    {
        this.length=length;
    }
    public void setWidth(float width)
    {
        this.width=width;
    }
    float getArea()
    {
        return length * width ; 
    }
    float getPerimenter ()
    {
        return (length + width) *2;
    }
    public static void main ( String [] args)
    {
        Scanner Rec = new Scanner ( System.in);
        Ractangle list [] = new Ractangle [2];
        for ( int i=0 ; i <2 ; i++)
        {
            System.out.println("Enter the length"+ (i+1) +": "); 
            float length = Rec.nextFloat();

            System.out.println("Enter the width" + (i+1) + ": "); 
            float width = Rec.nextFloat();

            list [i] = new Ractangle( length , width);
        }
        if ( list[0].getArea() > list[1].getArea())
        {
            System.out.println("The Area of ractangle 1: " + list[0].getArea() + "is larger than rectangle 2: " + list[1].getArea() );
        }
        else 
        {
            System.out.println("The Area of ractangle 2: " + list[1].getArea() +  "is larger than rectangle 1: " + list[0].getArea());
        }
         Rec.close();
    }

}
