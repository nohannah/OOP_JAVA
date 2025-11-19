package Part3;

import java.util.HashSet;
import java.util.Arrays;
public class StudentManager {
    private HashSet<Student> activeStudents;
    
    public StudentManager() {
        this.activeStudents = new HashSet<>();
    }
    
    // 1. Implement enrollStudent(Student s) using add()
    public boolean enrollStudent(Student s) {
        return activeStudents.add(s);
    }
    
    // 2. Implement withdrawStudent(Student s) using remove()
    public boolean withdrawStudent(Student s) {
        return activeStudents.remove(s);
    }
    
    // 3. Implement isStudentActive(String studentId) using contains()
    public boolean isStudentActive(String studentId) {
        // Create a temporary student with the given ID for lookup
        Student tempStudent = new Student(studentId, "", "", 0);
        return activeStudents.contains(tempStudent);
    }
    
    // 4. Implement getActiveStudentCount() using size()
    public int getActiveStudentCount() {
        return activeStudents.size();
    }
    
    // 5. Implement clearAllEnrollments() using clear()
    public void clearAllEnrollments() {
        activeStudents.clear();
    }
    
    // 6. Implement convertToArray() to convert HashSet to Student array
    public Student[] convertToArray() {
        return activeStudents.toArray(new Student[0]);
    }
    
    // Additional method to display all active students
    public void displayActiveStudents() {
        System.out.println("=== Active Students ===");
        if (activeStudents.isEmpty()) {
            System.out.println("No active students.");
            return;
        }
        
        for (Student student : activeStudents) {
            System.out.println(student);
        }
        System.out.println("Total active students: " + getActiveStudentCount());
    }
}

