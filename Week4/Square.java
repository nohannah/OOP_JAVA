package Week4;
public class Square extends Rectangle
{
    public Square()
    {
        this(0,0,0);
    } 

    public Square (double side)
    {
        this (0,0,side);
    }

    public Square (int x, int y, double side)
    {
        super(x,y,side,side);
    }

    public double getArea()
    {
        return super.getArea();
    }

    public double getPerimeter ()
    {
        return super.getPerimeter();
    }

    public String toString()
    {
        return super.toString() + "(square)";
    }
}

