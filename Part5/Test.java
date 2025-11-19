package Part5;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        // Create Enrollment Manager
        EnrollmentManager enrollmentManager = new EnrollmentManager();
        
        // Create Students
        Student studentA = new Student("S001", "Alice Johnson", "alice@university.edu", 2);
        Student studentB = new Student("S002", "Bob Smith", "bob@university.edu", 3);
        Student studentC = new Student("S003", "Charlie Brown", "charlie@university.edu", 1);
        
        // Create Courses
        Course course1 = new Course("CSC101", "Introduction to Programming", 3, 30);
        Course course2 = new Course("CSC201", "Data Structures", 4, 25);
        Course course3 = new Course("CSC301", "Algorithms", 4, 20);
        Course course4 = new Course("MAT101", "Calculus I", 4, 35);
        Course course5 = new Course("PHY101", "Physics I", 4, 30);
        
        System.out.println("=== Part 5: Student-Course Mapping with HashMap ===\n");
        
        // Test Case 1: Enroll 3 students in various courses
        System.out.println("1. Enrolling students in courses:");
        
        // Student A: 4 courses
        enrollmentManager.enrollStudentInCourse(studentA, course1);
        enrollmentManager.enrollStudentInCourse(studentA, course2);
        enrollmentManager.enrollStudentInCourse(studentA, course3);
        enrollmentManager.enrollStudentInCourse(studentA, course4);
        
        // Student B: 3 courses
        enrollmentManager.enrollStudentInCourse(studentB, course1);
        enrollmentManager.enrollStudentInCourse(studentB, course3);
        enrollmentManager.enrollStudentInCourse(studentB, course5);
        
        // Student C: 2 courses
        enrollmentManager.enrollStudentInCourse(studentC, course1);
        enrollmentManager.enrollStudentInCourse(studentC, course4);
        
        // Test Case 2: Display all enrollments
        enrollmentManager.displayAllEnrollments();
        
        // Test Case 3: Drop one course for Student A
        System.out.println("\n2. Dropping a course for Student A:");
        enrollmentManager.dropCourse(studentA, course3);
        
        // Display enrollments after dropping
        enrollmentManager.displayAllEnrollments();
        
        // Test Case 4: Get and display courses for Student B
        System.out.println("\n3. Courses for Student B:");
        List<Course> studentBCourses = enrollmentManager.getStudentCourses(studentB);
        System.out.println("Student: " + studentB.getName());
        System.out.print("Courses: ");
        for (Course course : studentBCourses) {
            System.out.print(course.getCourseCode() + " ");
        }
        System.out.println();
        
        // Test Case 5: Find all students enrolled in specific course
        System.out.println("\n4. Students enrolled in CSC101:");
        List<Student> studentsInCSC101 = enrollmentManager.getStudentsInCourse(course1);
        for (Student student : studentsInCSC101) {
            System.out.println("- " + student.getName() + " (ID: " + student.getStudentId() + ")");
        }
        
        // Test Case 6: Display total enrollments
        System.out.println("\n5. Total enrollments: " + enrollmentManager.getTotalEnrollments());
        
        // Additional test: Try enrolling duplicate
        System.out.println("\n6. Testing duplicate enrollment:");
        enrollmentManager.enrollStudentInCourse(studentA, course1);
    }
}