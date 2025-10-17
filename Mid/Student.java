//Question 8 (5 marks). Write a Java program to store student names using ArrayList
//and print them.
package Mid;
import java.util.ArrayList;

public class Student {
    ArrayList<String> names = new ArrayList<>();

    public Student() {
        names.add("Tara");
        names.add("Menu");
        names.add("Hannah");
        names.add("Tea");
        names.add("Amy");
    }

    public void displayNames() {
        for (String n : names) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.displayNames();
    }
}


