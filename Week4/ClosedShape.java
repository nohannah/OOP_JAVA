public class ClosedShape 
{
    private int X;
    private int Y;


    public ClosedShape()          // defulte constructor, 
    {
        this (0,0);           // if we do not input any value by defulte the value for x and y would be 0,0
    }

    public ClosedShape(int X, int Y)                 //TODO Auto-generated constructor stub (this is the general contructor)
    {
       this.X=X;
       this.Y=Y;
    }

    public int getX() 
    {
        return X;
    }

    public void setX(int x) 
    {
        X = x;
    }

    public int getY() 
    {
        return Y;
    }

    public void setY(int y) 
    {
        Y = y;
    }

    public double getArea ()          // the method for geting the area
    {
        return 0;
    }

    public double getPerimeter()      // the method for getting the perimeter
    {
        return 0;
    }


    @Override
    public String toString() 
    {
        return "ClosedShape [X=" + X + ", Y=" + Y + "]";
    }
    

}
