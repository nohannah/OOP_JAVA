package Week4;

import Week4.ClosedShape;
import Week4.Rectangle;
import Week4.Square;

public class ShapeTest
{
    public static void main (String [] args)
    {
       ClosedShape [] shapes = new ClosedShape[4];

        shapes[0] = new ClosedShape(1,2);
        shapes[1] = new Rectangle(2,3,4,5);
        shapes[2] = new Circle(4,5,10);
        shapes[3] = new Square(6,7,8);

        for (ClosedShape s: shapes)
        {
            System.out.println(s.toString( ));
            System.out.println(s.getArea( ));
            System.out.println(s.getPerimeter( ));
            System.out.println( );
        }
    
    }
}

