package Assignment1;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the Number of pattern:");
        int n=num.nextInt();
        for(int i=1 ; i<=n ; i++)
        {
            for (int j=1 ; j<=i ; j++ )
            {
                 System.out.print(j+ " " );
            }
            System.out.println( );
        }
        num.close();
    }
}
