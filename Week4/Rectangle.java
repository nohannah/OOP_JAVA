package Week4;

public class Rectangle extends ClosedShape {
    private double width;
    private double height;

    // Default constructor
    public Rectangle() {
        this(0, 0, 0, 0);
    }

    // Constructor with width + height
    public Rectangle(double width, double height) {
        this(0, 0, width, height);
    }

    // Constructor with position + width + height
    public Rectangle(int x, int y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public double getWidth() { return width; }
    public double getHeight() { return height; }

    public void setWidth(double width) { this.width = width; }
    public void setHeight(double height) { this.height = height; }

    public double getArea() { return width * height; }
    public double getPerimeter() { return 2 * (width + height); }

    @Override
    public String toString() 
    {
        return super.toString() + "Width: " + width + "height: " + height;
    }
}
