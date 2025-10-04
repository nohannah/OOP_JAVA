package Week4;

public class ClosedShape {
    private int y;
    private int x;
    //default value
    public ClosedShape()
    {
        this(0,0);
    }
    public ClosedShape(int x , int y)
    {
        this.x= x;
        this.y=y;
    }
    public int gety()
    {
        return y;
    }
    public void setx()
    {
        return x;
    }
    public void sety()
    {
        return y;
    }
    @Override
    public String toString()
    {
        return "ClosedShape[X=" + x + "y=" + y "]";
    }
}
