package Part6;
import java.util.* ;

public class GradeManagementTest {
    public static void main(String[] args) {
        GradeManager gradeManager = new GradeManager();
        
        // Create a map for course names (for transcript display)
        Map<String, String> courseNames = new HashMap<>();
        courseNames.put("CSC101", "Introduction to Programming");
        courseNames.put("CSC201", "Data Structures");
        courseNames.put("CSC301", "Algorithms");
        courseNames.put("MAT101", "Calculus I");
        
        System.out.println("=== Testing Grade Management with TreeMap ===\n");
        
        // Test Case: Assign grades for 3 students across 4 courses each
        System.out.println("1. Assigning grades for students...");
        
        // Student S001
        gradeManager.assignGrade("S001", "CSC101", 3.7);
        gradeManager.assignGrade("S001", "CSC201", 4.0);
        gradeManager.assignGrade("S001", "CSC301", 3.3);
        gradeManager.assignGrade("S001", "MAT101", 3.0);
        
        // Student S002
        gradeManager.assignGrade("S002", "CSC101", 2.7);
        gradeManager.assignGrade("S002", "CSC201", 3.0);
        gradeManager.assignGrade("S002", "CSC301", 3.7);
        gradeManager.assignGrade("S002", "MAT101", 2.3);
        
        // Student S003
        gradeManager.assignGrade("S003", "CSC101", 4.0);
        gradeManager.assignGrade("S003", "CSC201", 3.3);
        gradeManager.assignGrade("S003", "CSC301", 3.0);
        gradeManager.assignGrade("S003", "MAT101", 3.7);
        
        // Test invalid grade
        gradeManager.assignGrade("S001", "CSC101", 5.0); // Should show error
        
        // Test Case: Display all grades in sorted order
        System.out.println("\n2. Displaying all grades in sorted order:");
        gradeManager.displayGradesSorted();
        
        // Test Case: Calculate GPA for one student
        System.out.println("\n3. Calculating GPA for students:");
        double gpaS001 = gradeManager.getStudentGPA("S001");
        double gpaS002 = gradeManager.getStudentGPA("S002");
        double gpaS003 = gradeManager.getStudentGPA("S003");
        
        System.out.printf("Student S001 GPA: %.2f%n", gpaS001);
        System.out.printf("Student S002 GPA: %.2f%n", gpaS002);
        System.out.printf("Student S003 GPA: %.2f%n", gpaS003);
        
        // Test Case: Find highest grade across all records
        System.out.println("\n4. Finding highest grade:");
        double highestGrade = gradeManager.getHighestGrade();
        System.out.printf("Highest grade: %.1f%n", highestGrade);
        
        // Test Case: Get all grades for specific student
        System.out.println("\n5. All grades for Student S002:");
        Map<String, Double> s002Grades = gradeManager.getAllGradesForStudent("S002");
        for (Map.Entry<String, Double> entry : s002Grades.entrySet()) {
            System.out.printf("%s: %.1f%n", entry.getKey(), entry.getValue());
        }
        
        // Test Case: Display student transcript
        System.out.println("\n6. Student Transcript for S001:");
        gradeManager.displayStudentTranscript("S001", courseNames);
        
        // Test getting specific grade
        System.out.println("\n7. Getting specific grade:");
        double grade = gradeManager.getGrade("S001", "CSC201");
        System.out.printf("S001-CSC201 grade: %.1f%n", grade);
        
        // Test non-existent grade
        double nonExistentGrade = gradeManager.getGrade("S999", "CSC999");
        System.out.printf("Non-existent grade: %.1f%n", nonExistentGrade);
    }
}