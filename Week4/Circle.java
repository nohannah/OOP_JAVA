package Week4;

public class Circle extends ClosedShape {
    private double myradius;
    
    public Circle()
    {
        this(0,0,0);
    }
    public Circle (double radius)
    {
    this(0,0,radius);
    }
    public Circle(int x, int y, double radius)
    {
        super(x,y);
        this.radius=radius;
    }
    public double getRadius(){return radius;}
    public double getArea(){this.radius=radius;}

    public String toString()
    {
        return super.toString() + "Radius" + radius; 
    }
}
