public class Circle extends ClosedShape 
{
    private double myRadius;    // name of attribute 
    
    public Circle()
    {
        this (0,0,0);
    }

    public Circle (double radius)        // name of parameter 
    {
        this (0,0,radius);
    }

    public Circle (int x,int y , double myRadius)
    {
        super(x,y);                    // when we call the base class or supper class we use the supper 
        this.myRadius = myRadius;
    }

    public double getMyRadius() 
    {
        return myRadius;
    }

    public void setMyRadius(double myRadius) 
    {
        this.myRadius = myRadius;
    }

    public double getArea ()               // method for getting the area of the circle
    {
        return Math.PI *myRadius * myRadius;
    }


    public double getPerimeter ()               // method for getting the perimeter of the circle 
    {
        return 2 * Math.PI * myRadius;
    }


    
    public String toString()
    {
        return super.toString() + "radius: " + myRadius;
    }
}
