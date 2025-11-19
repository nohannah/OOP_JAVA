package Project;

import java.util.*;

public class GradeManager {
    private TreeMap<StudentCourseKey, Double> gradeBook;
    
    public GradeManager() {
        this.gradeBook = new TreeMap<>();
    }
    
    /**
     * Task 6.1.4: Assign grade for a student in a course
     */
    public void assignGrade(String studentId, String courseCode, double grade) {
        StudentCourseKey key = new StudentCourseKey(studentId, courseCode);
        if (grade < 0.0 || grade > 4.0) {
            System.out.println("Error: Grade must be between 0.0 and 4.0");
            return;
        }
        gradeBook.put(key, grade);
        System.out.println("Grade " + grade + " assigned to student " + 
                          studentId + " for course " + courseCode);
    }
    
    /**
     * Task 6.1.5: Get grade for a specific student and course
     */
    public double getGrade(String studentId, String courseCode) {
        StudentCourseKey key = new StudentCourseKey(studentId, courseCode);
        return gradeBook.getOrDefault(key, -1.0);
    }
    
    /**
     * Task 6.1.6: Calculate GPA for a student
     */
    public double getStudentGPA(String studentId) {
        double sum = 0.0;
        int count = 0;
        
        for (Map.Entry<StudentCourseKey, Double> entry : gradeBook.entrySet()) {
            if (entry.getKey().getStudentId().equals(studentId)) {
                sum += entry.getValue();
                count++;
            }
        }
        
        return count > 0 ? sum / count : 0.0;
    }
    
    /**
     * Task 6.1.7: Get all grades for a specific student
     */
    public Map<String, Double> getAllGradesForStudent(String studentId) {
        Map<String, Double> studentGrades = new TreeMap<>();
        
        // Using subMap approach for efficient range query
        StudentCourseKey fromKey = new StudentCourseKey(studentId, "");
        StudentCourseKey toKey = new StudentCourseKey(studentId + "zzz", "");
        
        SortedMap<StudentCourseKey, Double> studentEntries = gradeBook.subMap(fromKey, toKey);
        
        for (Map.Entry<StudentCourseKey, Double> entry : studentEntries.entrySet()) {
            studentGrades.put(entry.getKey().getCourseCode(), entry.getValue());
        }
        
        return studentGrades;
    }
    
    /**
     * Task 6.1.8: Find the highest grade across all records
     */
    public double getHighestGrade() {
        if (gradeBook.isEmpty()) {
            return -1.0;
        }
        
        double highest = 0.0;
        for (double grade : gradeBook.values()) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }
    
    /**
     * Task 6.1.9: Display all grades in sorted order
     */
    public void displayGradesSorted() {
        System.out.println("\n=== Grade Book ===");
        if (gradeBook.isEmpty()) {
            System.out.println("No grades recorded.");
            return;
        }
        
        for (Map.Entry<StudentCourseKey, Double> entry : gradeBook.entrySet()) {
            StudentCourseKey key = entry.getKey();
            System.out.printf("%s-%s: %.1f%n", 
                key.getStudentId(), key.getCourseCode(), entry.getValue());
        }
    }
    
    /**
     * Additional helper method to display student transcript
     */
    public void displayStudentTranscript(String studentId, Map<String, String> courseNames) {
        Map<String, Double> grades = getAllGradesForStudent(studentId);
        
        System.out.println("\n=== Transcript for Student " + studentId + " ===");
        if (grades.isEmpty()) {
            System.out.println("No courses found.");
            return;
        }
        
        double totalPoints = 0.0;
        int courseCount = 0;
        
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            String courseCode = entry.getKey();
            double grade = entry.getValue();
            String courseName = courseNames.getOrDefault(courseCode, "Unknown Course");
            
            System.out.printf("%s - %s: %.1f%n", courseCode, courseName, grade);
            totalPoints += grade;
            courseCount++;
        }
        
        double gpa = courseCount > 0 ? totalPoints / courseCount : 0.0;
        System.out.printf("GPA: %.2f%n", gpa);
    }
    
    // Getter for testing
    public TreeMap<StudentCourseKey, Double> getGradeBook() {
        return gradeBook;
    }
}
