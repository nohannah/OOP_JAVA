package Week4;

public class Ractangle {
    private double Width;
    private double Height;
    public Ractangle()
    {
        this(0,0,0,0)
        
    }
    public Ractangle (double width , double Height)
    {
        this(0,0, Width, Height);
    }
    public Ractangle(int x, int y, double Width , double Height)
    {
        super(x,y);
        this.Height=Height;
        this.Width=Width;
    }
    public double getWidth()
    {
        return Width;
    }
    public double getHeight()
    {
        return Height;
    }
    public void setWidth(){this.Width= Width;}
    public void setWidth(){this.Height= Height;}

    public double getArea(){ return Width * Height ;}
    public double getPerimeter(){return 2*( Width + Height);}
    public String toString()
    {
        return super.toString() + "Width" + Width + " height " + Height ; 
    }

}
