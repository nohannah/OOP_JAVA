// Student Class
// Class: Student with fields: id, name, gpa
// Method: displayInfo()
// In main(), create an array of 5 students and print their details.

package Practice;
import java.util.Scanner;

public class Student {
    int id; 
    String name; 
    double gpa;

    Student (int id, String name, double gpa)
    {
        this.id=id; 
        this.name=name;
        this.gpa=gpa;
    }
    void displayInfo()
    {
        System.out.println("Student ID: " +  id  + "Student Name: " +  name   + "Student GPA: " + gpa);
    }

    public static void main( String [] args)
    {
        Scanner stu= new Scanner( System.in);
        Student list[]= new Student[2]; 
        for (int i=0 ; i<2 ; i++)
        {
            System.out.println("Enter your ID : "); 
            int id = stu.nextInt();
            stu.nextLine(); // buffer when enter the ID 

            System.out.println("Enter your Name : ");
            String name= stu.nextLine(); 

            System.out.println("Enter your GPA : ");
            int gpa= stu.nextInt();

            list [i] = new Student (id, name, gpa);

        }
        for (int i=0 ; i<2 ; i++)
        {
            list[i].displayInfo();
        }
        stu.close();
    }
}
