// Write a Java program to create a class called "Person" with a name and age attribute.
//  Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.
package Practice;

import java.util.Scanner;

public class Person {
    private int age;
    private String name;
    
    public Person(int age, String name)
    {
        this.age=age;
        this.name=name;
    }
    public int getage()
    {
        return age;
    }
    public String getname()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter your name :");
        String namePerson1= n.nextLine();

        System.out.println("Enter your age :");
        int agePerson1 = n.nextInt();
        n.nextLine();
        Person p1= new Person( agePerson1 , namePerson1 );
        System.out.println("My name is " + p1.getname() + " my age is" + p1.getage());
        // Person p1=new Person (23 , "Hannah");
        // Person p2= new Person(35 , "john");
        System.out.println("Enter your new name :");
        String namePerson2= n.nextLine();
        
        System.out.println("Enter your New age :");
        int agePerson2 = n.nextInt();
        Person p2= new Person( agePerson2 , namePerson2 );
       
        System.out.println("My name now is " +  p2.getname() + "and my age is now " + p2.getage());
        n.close();
    }
}

