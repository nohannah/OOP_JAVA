package Part8;
import java.util.*;
import java.util.Objects;

public class Course {
    private String courseCode;
    private String courseName;
    private int credits;
    private int capacity;
    
    public Course(String courseCode, String courseName, int credits, int capacity) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.capacity = capacity;
    }
    
    // Getters and Setters
    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }
    
    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }
    
    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }
    
    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
    
    @Override
    public String toString() {
        return "[" + courseCode + "] " + courseName + " (" + credits + " credits, Capacity: " + capacity + ")";
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseCode, course.courseCode);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(courseCode);
    }
}
