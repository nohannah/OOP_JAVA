package Week4;

package Week5;

import java.util.ArrayList;

public class CourseMain {
    public static void main(String[] args) {
        ArrayList<Course> courses = new ArrayList<>();

        courses.add(new LectureCourse("OOP", "CS101", 45));
        courses.add(new LabCourse("Physics Lab", "PH102", 30));
        courses.add(new SeminarCourse("AI Ethics", "CS303", 20, "Dr. Smith"));

        System.out.println("=== Course Details ===");
        for (Course c : courses) {
            System.out.println(c);
            System.out.println("Total Hours: " + c.getTotalHours());
            System.out.println("---------------------------");
        }
    }
}

