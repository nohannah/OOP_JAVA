package Project;
import java.util.TreeSet;

import Part2.Course;

import java.util.SortedSet;

public class SortedCourseManager {
    private TreeSet<Course> sortedCourses;
    
    public SortedCourseManager() {
        this.sortedCourses = new TreeSet<>();
    }
    
    // Add course to the sorted set
    public boolean addCourse(Course c) {
        return sortedCourses.add(c);
    }
    
    // Get the first course (lowest course code)
    public Course getFirstCourse() {
        if (sortedCourses.isEmpty()) {
            return null;
        }
        return sortedCourses.first();
    }
    
    // Get the last course (highest course code)
    public Course getLastCourse() {
        if (sortedCourses.isEmpty()) {
            return null;
        }
        return sortedCourses.last();
    }
    
    // Get courses in a specific range
    public SortedSet<Course> getCoursesInRange(String fromCode, String toCode) {
        Course fromCourse = new Course(fromCode, "", 0, 0);
        Course toCourse = new Course(toCode, "", 0, 0);
        
        return sortedCourses.subSet(fromCourse, toCourse);
    }
    
    // Remove course by course code
    public boolean removeCourse(String courseCode) {
        Course courseToRemove = new Course(courseCode, "", 0, 0);
        return sortedCourses.remove(courseToRemove);
    }
    
    // Display all courses in sorted order
    public void displayAllCourses() {
        if (sortedCourses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }
        
        System.out.println("=== Sorted Course Catalog ===");
        int position = 1;
        for (Course course : sortedCourses) {
            System.out.println(position + ". " + course);
            position++;
        }
    }
    
    // Get the number of courses
    public int getCourseCount() {
        return sortedCourses.size();
    }
    
    // Check if course exists
    public boolean containsCourse(String courseCode) {
        Course searchCourse = new Course(courseCode, "", 0, 0);
        return sortedCourses.contains(searchCourse);
    }
}