package Part2;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class CourseCatalog {
 private LinkedList<Course> courseCatalog;
    
    public CourseCatalog() {
        this.courseCatalog = new LinkedList<>();
    }
    
    // Add course at the beginning of the list
    public void addCourseAtBeginning(Course course) {
        courseCatalog.addFirst(course);
        System.out.println("Added course at beginning: " + course.getCourseCode());
    }
    
    // Add course at the end of the list
    public void addCourseAtEnd(Course course) {
        courseCatalog.addLast(course);
        System.out.println("Added course at end: " + course.getCourseCode());
    }
    
    // Remove course by course code
    public boolean removeCourse(String courseCode) {
        Iterator<Course> iterator = courseCatalog.iterator();
        while (iterator.hasNext()) {
            Course course = iterator.next();
            if (course.getCourseCode().equals(courseCode)) {
                iterator.remove();
                System.out.println("Removed course: " + courseCode);
                return true;
            }
        }
        System.out.println("Course not found: " + courseCode);
        return false;
    }
    
    // Display courses in forward direction using for-each loop
    public void displayCoursesForward() {
        System.out.println("\nCourse Catalog (Forward) ");
        if (courseCatalog.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }
        
        for (Course course : courseCatalog) {
            System.out.println(course);
        }
    }
    
    // Display courses in backward direction using descending iterator
    public void displayCoursesBackward() {
        System.out.println("\n Course Catalog (Backward) ");
        if (courseCatalog.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }
        
        Iterator<Course> descendingIterator = courseCatalog.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }
    }
    
    // Search for a course by course code
    public Course searchCourse(String courseCode) {
        for (Course course : courseCatalog) {
            if (course.getCourseCode().equals(courseCode)) {
                return course;
            }
        }
        return null;
    }
    
    // Get the size of the catalog
    public int getCatalogSize() {
        return courseCatalog.size();
    }
    
    // Check if catalog is empty
    public boolean isEmpty() {
        return courseCatalog.isEmpty();
    }
      public static void main(String[] args) {
        // Create CourseCatalog instance
        CourseCatalog catalog = new CourseCatalog();
        
        // Create test courses
        Course course1 = new Course("CSC101", "Introduction to Programming", 3, 30);
        Course course2 = new Course("CSC201", "Data Structures", 4, 25);
        Course course3 = new Course("CSC301", "Algorithms", 4, 20);
        Course course4 = new Course("MAT101", "Calculus I", 4, 40);
        Course course5 = new Course("PHY101", "Physics I", 4, 35);
        
        System.out.println("=== PART 2: COURSE CATALOG WITH LINKEDLIST ===");
        
        // Test Case 1: Add 3 courses at the end
        System.out.println("\nAdding 3 courses at the end");
        catalog.addCourseAtEnd(course1);
        catalog.addCourseAtEnd(course2);
        catalog.addCourseAtEnd(course3);
        
        // Display courses forward
        catalog.displayCoursesForward();
        
        // Test Case 2: Add 2 courses at the beginning
        System.out.println("\n Adding 2 courses at the beginning ");
        catalog.addCourseAtBeginning(course4);
        catalog.addCourseAtBeginning(course5);
        
        // Display courses forward and backward
        catalog.displayCoursesForward();
        catalog.displayCoursesBackward();
        
        // Test Case 3: Remove a course from the middle
        System.out.println("\n Removing course from the middle (CSC201) ");
        catalog.removeCourse("CSC201");
        catalog.displayCoursesForward();
        
        // Test Case 4: Search for existing and non-existing courses
        System.out.println("\nSearching for courses ");
        Course foundCourse = catalog.searchCourse("CSC101");
        if (foundCourse != null) {
            System.out.println("Found course: " + foundCourse);
        } else {
            System.out.println("Course CSC101 not found");
        }
        
        Course notFoundCourse = catalog.searchCourse("CSC999");
        if (notFoundCourse != null) {
            System.out.println("Found course: " + notFoundCourse);
        } else {
            System.out.println("Course CSC999 not found");
        }
        
        // Test Case 5: Display final catalog size
        System.out.println("\nFinal Catalog Status ");
        System.out.println("Total courses in catalog: " + catalog.getCatalogSize());
        catalog.displayCoursesForward();
    }
    
}
