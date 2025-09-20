package Week2;

import java.util.Scanner;

public class People {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); 

        System.out.println("Enter your Address: ");
        String Address = input.nextLine();

        
        Person p = new Person(name, age, Address);
        p.introduce();

        input.close();
    }
}
