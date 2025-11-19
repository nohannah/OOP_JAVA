package Part5;
import java.util.*;

public class EnrollmentManager {
    private HashMap<Student, List<Course>> enrollmentMap;
    
    public EnrollmentManager() {
        this.enrollmentMap = new HashMap<>();
    }
    
    /**
     * Enroll a student in a course
     */
    public void enrollStudentInCourse(Student student, Course course) {
        // Check if student exists in map
        if (!enrollmentMap.containsKey(student)) {
            // If not, create new ArrayList and put in map
            enrollmentMap.put(student, new ArrayList<>());
        }
        
        // Add course to student's list
        List<Course> studentCourses = enrollmentMap.get(student);
        if (!studentCourses.contains(course)) {
            studentCourses.add(course);
            System.out.println("Successfully enrolled " + student.getName() + " in " + course.getCourseCode());
        } else {
            System.out.println(student.getName() + " is already enrolled in " + course.getCourseCode());
        }
    }
    
    /**
     * Get all courses for a specific student
     */
    public List<Course> getStudentCourses(Student student) {
        return enrollmentMap.getOrDefault(student, new ArrayList<>());
    }
    
    /**
     * Drop a specific course for a student
     */
    public boolean dropCourse(Student student, Course course) {
        if (enrollmentMap.containsKey(student)) {
            List<Course> studentCourses = enrollmentMap.get(student);
            boolean removed = studentCourses.remove(course);
            if (removed) {
                System.out.println("Successfully dropped " + course.getCourseCode() + " for " + student.getName());
                
                // Remove student from map if no courses left
                if (studentCourses.isEmpty()) {
                    enrollmentMap.remove(student);
                }
            } else {
                System.out.println(student.getName() + " is not enrolled in " + course.getCourseCode());
            }
            return removed;
        } else {
            System.out.println("Student " + student.getName() + " not found in enrollment records");
            return false;
        }
    }
    
    /**
     * Get total number of enrollments across all students
     */
    public int getTotalEnrollments() {
        int total = 0;
        for (List<Course> courses : enrollmentMap.values()) {
            total += courses.size();
        }
        return total;
    }
    
    /**
     * Display all enrollments
     */
    public void displayAllEnrollments() {
        System.out.println("\n=== Enrollment Map ===");
        if (enrollmentMap.isEmpty()) {
            System.out.println("No enrollments found.");
            return;
        }
        
        for (Map.Entry<Student, List<Course>> entry : enrollmentMap.entrySet()) {
            Student student = entry.getKey();
            List<Course> courses = entry.getValue();
            
            System.out.println("Student: " + student.getName() + " (ID: " + student.getStudentId() + ")");
            System.out.print("Courses: ");
            if (courses.isEmpty()) {
                System.out.println("None");
            } else {
                for (int i = 0; i < courses.size(); i++) {
                    System.out.print(courses.get(i).getCourseCode());
                    if (i < courses.size() - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
            System.out.println("---");
        }
    }
    
    /**
     * Get all students enrolled in a specific course
     */
    public List<Student> getStudentsInCourse(Course course) {
        List<Student> studentsInCourse = new ArrayList<>();
        
        for (Map.Entry<Student, List<Course>> entry : enrollmentMap.entrySet()) {
            Student student = entry.getKey();
            List<Course> studentCourses = entry.getValue();
            
            if (studentCourses.contains(course)) {
                studentsInCourse.add(student);
            }
        }
        
        return studentsInCourse;
    }
    
    /**
     * Get the enrollment map (for testing purposes)
     */
    public HashMap<Student, List<Course>> getEnrollmentMap() {
        return enrollmentMap;
    }
}