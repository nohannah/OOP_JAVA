//  Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, 
//  set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.

package Practice;

import java.util.Scanner;

public class Dog {
    private String Name ; 
    private String Breed;

    public Dog( String Name , String Breed)
    {
        this.Name=Name;
        this.Breed=Breed;
    }
    
    public String getName()
    {
        return Name;
    }
    public String getBreed()
    {
        return Breed;
    }

    public void setName(String Name)
    {
        this.Name=Name;
    }
    public void setBreed(String Breed)
    {
        this.Breed=Breed;
    }
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter dog name :");
        String nameDog1= n.nextLine();
        System.out.println("Enter dog greed :");
        String BreedDog1 = n.nextLine();
        n.nextLine();
        Dog d1= new Dog( nameDog1 , BreedDog1 );
        System.out.println("My dog name is " + d1.getName() + " it is" + d1.getBreed());
        
        System.out.println("Enter your new dog name :");
        String nameDog2= n.nextLine();
        System.out.println("Enter your New dog breed :");
        String nameBreed2 = n.nextLine();
        Dog d2= new Dog( nameDog2 , nameBreed2 );
       
        System.out.println("My name now is " +  d2.getName() + "and my dog breed  now  is" + d2.getBreed());
        n.close();
    }
}
