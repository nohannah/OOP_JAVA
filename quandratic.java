public class quandratic {
    public static void main (String[] args)
    {
        double a=1; 
        double b=3;
        double c=2;
        try {
            if(a==0){
                throw new ArithmeticException("Coefficient 'a' cannot be zero in a quadratic equation.");
            }
            double d= b*b - 4*a*c;
            if(d < 0){
                throw new ArithmeticException("No a quandric root exist");

            }
            double root1=(-b + Math.sqrt(d)) / (2*a);
            double root2=(-b - Math.sqrt(d)) / (2*a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        }
    
    catch (ArithmeticException e) {
        System.out.println("Error: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("An unexpected error occurred: ");
    }
    finally {
        System.out.println("Execution completed.");
    }
}
}
