// Employee Salary
// Class: Employee with private fields id, name, salary
// Provide getters & setters.
// Method: applyBonus(double percent) to increase salary 
// Use a static variable to count number of employees created.

package Practice;

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
        Employee emp1 = new Employee ( 1 , "Alice" , 50000);
        Employee emp2 = new Employee ( 2 , "Bob" , 60000);

        System.out.println("Employee 1: ID=" + emp1.getId() + ", Name=" + emp1.getName() + ", Salary=" + emp1.getSalary());
        System.out.println("Employee 2: ID=" + emp2.getId() + ", Name=" + emp2.getName() + ", Salary=" + emp2.getSalary());

        emp1.applyBonus(10); // 10% bonus
        emp2.applyBonus(5);  // 5% bonus

        System.out.println("After applying bonus:");
        System.out.println("Employee 1: ID=" + emp1.getId() + ", Name=" + emp1.getName() + ", Salary=" + emp1.getSalary());
        System.out.println("Employee 2: ID=" + emp2.getId() + ", Name=" + emp2.getName() + ", Salary=" + emp2.getSalary());

        System.out.println("Total number of employees: " + Employee.getNumberEmployees());
    }
}
