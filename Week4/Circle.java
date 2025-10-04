package Week4;

public class Circle extends ClosedShape {
    private double radius;
    
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
    
    public class getArea(){return Math.PI * radius * radius ;}
    public class getPerimeter(){return 2*Math.PI * radius;}

    public String toString()
    {
        return super.toString() + "Radius" + radius; 
    }

}
