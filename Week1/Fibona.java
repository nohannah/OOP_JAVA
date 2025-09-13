import java.util.Scanner;
public class Fibona {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci series up to " + n + " terms:");
        int a = 1, b = 2 ;
        for (int i = 0; i < n; i++) {
            if(i==0)
            {
                System.out.println(a);
            }
            if(i==1)
            {
                System.out.println(b);
            }
            else 
            {
                int c=a+b; 
                System.err.println(c);
                a=b;
                b=c;
            }
        }
        System.out.println();

        scanner.close();
    }
}

    