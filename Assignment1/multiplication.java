package Assignment1;

import java.util.Scanner;

public class multiplication
{
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n =num.nextInt();
        for (int i =1; i<=10 ; i++)
        {
            System.out.println(n+" * " + i + "=" + n*i);
        }
        num.close();
   }
    
}
