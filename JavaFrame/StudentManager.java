package JavaFrame;

import java.util.*;

import Project.Student;

public class StudentManager {
    private List<Student> studentList;
    
    public StudentManager() {
        studentList = new ArrayList<>();
    }
    
    // Add student to list
    public void addStudent(Student s) {
        studentList.add(s);
        System.out.println("Student added: " + s.getName());
    }
    
    // Remove student by ID
    public boolean removeStudent(String studentId) {
        Student student = findStudentById(studentId);
        if (student != null) {
            studentList.remove(student);
            System.out.println("Student removed: " + studentId);
            return true;
        }
        System.out.println("Student not found: " + studentId);
        return false;
    }
    
    // Find student by ID
    public Student findStudentById(String studentId) {
        for (Student student : studentList) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }
    
    // Display all students using Iterator
    public void displayAllStudents() {
        System.out.println("\n=== Student List ===");
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    // Get students by specific year
    public List<Student> getStudentsByYear(int year) {
        List<Student> result = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getYear() == year) {
                result.add(student);
            }
        }
        return result;
    }
    
    // Sort students by name
    public void sortStudentsByName() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
    }
    
    // Test method
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        
        // Add 5 students with different years
        manager.addStudent(new Student("S001", "Alice Johnson", "alice@uni.edu", 2));
        manager.addStudent(new Student("S002", "Bob Smith", "bob@uni.edu", 3));
        manager.addStudent(new Student("S003", "Charlie Brown", "charlie@uni.edu", 1));
        manager.addStudent(new Student("S004", "Diana Prince", "diana@uni.edu", 4));
        manager.addStudent(new Student("S005", "Eve Wilson", "eve@uni.edu", 2));
        
        // Display all students
        manager.displayAllStudents();
        
        // Remove a student by ID
        manager.removeStudent("S003");
        
        // Find and display a specific student
        Student found = manager.findStudentById("S002");
        if (found != null) {
            System.out.println("\nFound student: " + found);
        }
        
        // Display all students in year 2
        System.out.println("\n=== Year 2 Students ===");
        List<Student> year2Students = manager.getStudentsByYear(2);
        for (Student s : year2Students) {
            System.out.println(s);
        }
        
        // Sort and display students alphabetically
        manager.sortStudentsByName();
        System.out.println("\n=== Students Sorted by Name ===");
        manager.displayAllStudents();
    }
}