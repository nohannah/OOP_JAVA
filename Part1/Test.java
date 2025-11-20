package Part1;
import java.util.*;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        StudentManager mgr = new StudentManager();

        // Add 5 students with different years (1-4)
        mgr.addStudent(new Student("S001", "Alice",   "alice@example.com",   1));
        mgr.addStudent(new Student("S002", "Bob",     "bob@example.com",     2));
        mgr.addStudent(new Student("S003", "Charlie", "charlie@example.com", 3));
        mgr.addStudent(new Student("S004", "Diana",   "diana@example.com",   4));
        mgr.addStudent(new Student("S005", "Eve",     "eve@example.com",     2));

        System.out.println("--- All students ---");
        mgr.displayAllStudents();

        // Remove a student by ID
        System.out.println("\nRemoving student S003 (Charlie)");
        boolean removed = mgr.removeStudent("S003");
        System.out.println("Removed: " + removed);

        // Find and display a specific student
        System.out.println("\nFinding student S002:");
        Student found = mgr.findStudentById("S002");
        System.out.println(found != null ? found : "Not found");

        // Display all students in year 2
        System.out.println("\nStudents in year 2:");
        List<Student> year2 = mgr.getStudentsByYear(2);
        for (Student s : year2) System.out.println(s);

        // Sort and display students alphabetically
        System.out.println("\nSorting students by name and displaying:");
        mgr.sortStudentsByName();
        mgr.displayAllStudents();
    }
}

