package Part4;

import java.util.SortedSet;
    public class Test {
    public static void main(String[] args) {
        // Create course manager
        SortedCourseManager courseManager = new SortedCourseManager();
        
        // Create test courses
        Course csc101 = new Course("CSC101", "Introduction to Programming", 3, 30);
        Course csc305 = new Course("CSC305", "Advanced Algorithms", 4, 25);
        Course csc201 = new Course("CSC201", "Data Structures", 4, 35);
        Course csc150 = new Course("CSC150", "Computer Fundamentals", 3, 40);
        
        System.out.println("=== Testing TreeSet Course Management ===");
        
        // Add courses (order doesn't matter - TreeSet will sort them)
        System.out.println("\n1. Adding courses...");
        courseManager.addCourse(csc101);
        courseManager.addCourse(csc305);
        courseManager.addCourse(csc201);
        courseManager.addCourse(csc150);
        
        // Display all courses (should be sorted by course code)
        System.out.println("\n2. Displaying all courses (sorted by course code):");
        courseManager.displayAllCourses();
        
        // Get first and last course
        System.out.println("\n3. First course: " + courseManager.getFirstCourse());
        System.out.println("   Last course: " + courseManager.getLastCourse());
        
        // Get courses in range
        System.out.println("\n4. Courses between CSC101 and CSC250:");
        SortedSet<Course> rangeCourses = courseManager.getCoursesInRange("CSC101", "CSC250");
        if (rangeCourses.isEmpty()) {
            System.out.println("   No courses in the specified range.");
        } else {
            int count = 1;
            for (Course course : rangeCourses) {
                System.out.println("   " + count + ". " + course);
                count++;
            }
        }
        
        // Remove a course
        System.out.println("\n5. Removing CSC201...");
        boolean removed = courseManager.removeCourse("CSC201");
        System.out.println("   Course removed: " + removed);
        
        // Display remaining courses
        System.out.println("\n6. Remaining courses after removal:");
        courseManager.displayAllCourses();
        
        // Test duplicate addition
        System.out.println("\n7. Trying to add duplicate course CSC101...");
        Course csc101Duplicate = new Course("CSC101", "Intro to Programming Duplicate", 3, 30);
        boolean added = courseManager.addCourse(csc101Duplicate);
        System.out.println("   Duplicate added: " + added + " (should be false - TreeSet maintains uniqueness)");
        
        // Final state
        System.out.println("\n8. Final course count: " + courseManager.getCourseCount());
        
        // Test edge cases
        System.out.println("\n9. Testing edge cases:");
        System.out.println("   Contains CSC999: " + courseManager.containsCourse("CSC999"));
        System.out.println("   Courses between AAA and ZZZ:");
        SortedSet<Course> allRange = courseManager.getCoursesInRange("AAA", "ZZZ");
        for (Course course : allRange) {
            System.out.println("   - " + course);
        }
    }
}

