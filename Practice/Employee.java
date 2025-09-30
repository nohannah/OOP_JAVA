// Employee Salary
// Class: Employee with private fields id, name, salary
// Provide getters & setters.
// Method: applyBonus(double percent) to increase salary 
// Use a static variable to count number of employees created.

package Practice;

import java.util.Scanner;

public class Employee {
    private int id; 
    private String name; 
    private double salary; 
    static int NumberEmployees= 0; 
    Employee (int id, String name, double salary)

    {
        this.id = id; 
        this.name = name; 
        this.salary = salary;
        NumberEmployees++; 
    }
    // Getters
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    
    // Setters 
    public void setId ( int id)
    {
        this.id = id; 
    }
    public void setName ( String name)
    {
        this.name = name; 
    }

    public void setSalary ( double salary)
    {
        this.salary = salary; 
    }
    
    public void applyBonus( double percent)
    {
        salary +=salary * percent / 100;
    }
    public static int getNumberEmployees()
    {
        return NumberEmployees;
    }
    public static void main ( String [] args)
    {
        Scanner emp= new Scanner(System.in);
        System.out.println("Enter the ID employee :");
        int id1 = emp.nextInt();
        System.out.println("Enter the name employee :");
        String name1 = emp.nextLine();
        emp.nextLine();
        System.out.println("Enter the employee salary :");
        int salary1 = emp.nextInt();
        Employee employee1=new Employee(id1, name1, salary1); 

        System.out.println("Enter the ID employee :");
        int id2 = emp.nextInt();
        System.out.println("Enter the name employee :");
        String name2 = emp.nextLine();
        emp.nextLine();
        System.out.println("Enter the salary:");
        int salary2 = emp.nextInt();
        Employee employee2=new Employee(id2, name2, salary2); 
        System.out.println("Employee 1: ID=" + employee1.getId() + ", Name=" + employee1.getName() + ", Salary=" + employee1.getSalary());
        System.out.println("Employee 2: ID=" + employee2.getId() + ", Name=" + employee2.getName() + ", Salary=" + employee2.getSalary());

        employee1.applyBonus(10); // 10% bonus
        employee2.applyBonus(5);  // 5% bonus

        System.out.println("After applying bonus:");
        System.out.println("Employee 1: ID=" + employee1.getId() + ", Name=" + employee1.getName() + ", Salary=" + employee1.getSalary());
        System.out.println("Employee 2: ID=" + employee2.getId() + ", Name=" + employee2.getName() + ", Salary=" + employee2.getSalary());

        System.out.println("Total number of employees: " + Employee.getNumberEmployees());
        emp.close();
    }
}
