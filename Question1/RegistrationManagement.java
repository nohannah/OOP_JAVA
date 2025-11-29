package Question1;
import java.util.ArrayList;
import java.util.HashMap;

public class RegistrationManagement {
    //hashmap with arraylist 
    HashMap<String, ArrayList<String>> registrationMap = new HashMap<>();
    //sudentid -> list of registered course codes
    public void registerCourse(String studentID, String courseCode) {
        registrationMap.putIfAbsent(studentID, new ArrayList<>());
        registrationMap.get(studentID).add(courseCode);
    }
    public void registerCourseWithChecks(String studentID, String courseCode, HashMap<String, Student> studentMap, HashMap<String, Course> courseMap) {
        if (!studentMap.containsKey(studentID)) {
            System.out.println("Student ID : " + studentID + " not found.");
            return;
        }
        if (!courseMap.containsKey(courseCode)) {
            System.out.println("Course Code : " + courseCode + " not found.");
            return;
        }
        Course course = courseMap.get(courseCode);
        if (course.isFull()) {
            System.out.println("Course Code : " + courseCode + " is full.");
            return;
        }
        registrationMap.putIfAbsent(studentID, new ArrayList<>());
        ArrayList<String> registeredCourses = registrationMap.get(studentID);
        if (registeredCourses.contains(courseCode)) {
            System.out.println("Student ID : " + studentID + " is already registered for Course Code : " + courseCode + ".");
            return;
        }
        registeredCourses.add(courseCode);
        //update seat count
        int currentSeats = Integer.parseInt(course.getCurrentSeats());
        courseMap.put(courseCode, new Course(course.getCourseID(), course.getCourseName(), course.getSeatLimit(), Integer.toString(currentSeats + 1)));
        System.out.println("Student ID : " + studentID + " successfully registered for Course Code : " + courseCode + ".");
    }
    //dropping rule  
    //if student / course not found -> print not found
    // if student not enrolled in course -> print not registered in this course 
    // else drop + update seat count 
    public void dropCourse(String studentID, String courseCode, HashMap<String, Student> studentMap, HashMap<String, Course> courseMap) {
        if (!studentMap.containsKey(studentID)) {
            System.out.println("Student ID : " + studentID + " not found.");
            return;
        }
        if (!courseMap.containsKey(courseCode)) {
            System.out.println("Course Code : " + courseCode + " not found.");
            return;
        }
        ArrayList<String> registeredCourses = registrationMap.get(studentID);
        if (registeredCourses == null || !registeredCourses.contains(courseCode)) {
            System.out.println("Student ID : " + studentID + " is not registered for Course Code : " + courseCode + ".");
            return;
        }
        registeredCourses.remove(courseCode);
        //update seat count
        Course course = courseMap.get(courseCode);
        int currentSeats = Integer.parseInt(course.getCurrentSeats());
        courseMap.put(courseCode, new Course(course.getCourseID(), course.getCourseName(), course.getSeatLimit(), Integer.toString(currentSeats - 1)));
        System.out.println("Student ID : " + studentID + " successfully dropped Course Code : " + courseCode + ".");
    }


    
}
