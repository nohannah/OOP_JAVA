package Question1;
import java.util.*;
public class Course {
    private String courseID;
    private String courseName;
    private String SeatLimit;
    private String currentSeats;
    public Course(String courseID, String courseName, String SeatLimit, String currentSeats) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.SeatLimit = SeatLimit;
        this.currentSeats = currentSeats;
    }
    public String getCourseID() {
        return courseID;
    }
    public String getCourseName() {
        return courseName;
    }
    public String getSeatLimit() {
        return SeatLimit;
    }
    public String getCurrentSeats() {
        return currentSeats;
    }
   // add methos boolean isfull()
    public boolean isFull() {
        return Integer.parseInt(currentSeats) >= Integer.parseInt(SeatLimit);
    }
    //store course using Hashmap
    HashMap<String, Course> courseMap = new HashMap<String, Course>();
    public void addCourse(Course course) {
        courseMap.put(course.getCourseID(), course);
    }
    //for duplicate course alreadexust is not add
    public void addUniqueCourse(Course course) {
        if (courseMap.containsKey(course.getCourseID())) {
            System.out.println("Course ID : " + course.getCourseID() + " already exists.");
        } else {
            courseMap.put(course.getCourseID(), course);
        }
    }

}
