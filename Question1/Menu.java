package Question1;
import java.util.*;
import Question1.Exception.CourseAlreadyExistsException;
import Question1.Exception.CourseFullException;
import Question1.Exception.CourseNotFoundException;
import Question1.Exception.StudentAlreadyExistsException;
import Question1.Exception.StudentNotFoundException;
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Student> studentMap = new HashMap<>();
        HashMap<String, Course> courseMap = new HashMap<>();
        RegistrationManagement regManager = new RegistrationManagement();
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Register Course");
            System.out.println("4. Drop Course");
            System.out.println("5. Search Course");
            System.out.println("6.View all Students and Courses");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            if (choice == 7) {
                System.out.println("Exiting...");
                break;
            }
            try{
                switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String studentID = scanner.nextLine();
                    System.out.print("Enter Student Name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();
                    Student student = new Student(studentID, studentName, department);
                    studentMap.put(studentID, student);
                    System.out.println("Student added successfully.");
                    break;
                case 2:
                    System.out.print("Enter Course ID: ");
                    String courseID = scanner.nextLine();
                    System.out.print("Enter Course Name: ");
                    String courseName = scanner.nextLine();
                    System.out.print("Enter Seat Limit: ");
                    String seatLimit = scanner.nextLine();
                    Course course = new Course(courseID, courseName, seatLimit, "0");
                    courseMap.put(courseID, course);
                    System.out.println("Course added successfully.");
                    break;
                case 3:
                    System.out.print("Enter Student ID: ");
                    String regStudentID = scanner.nextLine();
                    System.out.print("Enter Course Code: ");
                    String regCourseCode = scanner.nextLine();
                    regManager.registerCourseWithChecks(regStudentID, regCourseCode, studentMap, courseMap);
                    break;
                case 4:
                    System.out.print("Enter Student ID: ");
                    String dropStudentID = scanner.nextLine();
                    System.out.print("Enter Course Code: ");
                    String dropCourseCode = scanner.nextLine();
                    regManager.dropCourse(dropStudentID, dropCourseCode, studentMap, courseMap);
                    break;
                case 5:
                    System.out.print("Enter Course ID to search: ");
                    String searchCourseID = scanner.nextLine();
                    if (courseMap.containsKey(searchCourseID)) {
                        Course foundCourse = courseMap.get(searchCourseID);
                        System.out.println("Course ID: " + foundCourse.getCourseID());
                        System.out.println("Course Name: " + foundCourse.getCourseName());
                        System.out.println("Seat Limit: " + foundCourse.getSeatLimit());
                        System.out.println("Current Seats: " + foundCourse.getCurrentSeats());
                    } else {
                        System.out.println("Course ID : " + searchCourseID + " not found.");
                    }
                case 6:
                    System.out.println("Students:");
                    for (Student s : studentMap.values()) {
                        s.displayInfo();
                        System.out.println();
                    }
                    System.out.println("Courses:");
                    for (Course c : courseMap.values()) {
                        System.out.println("Course ID: " + c.getCourseID());
                        System.out.println("Course Name: " + c.getCourseName());
                        System.out.println("Seat Limit: " + c.getSeatLimit());
                        //id the in put is character it give not valid 
                        try {
                            Integer.parseInt(c.getSeatLimit());
                        } catch (NumberFormatException e) {
                            System.out.println("Seat Limit is not a valid number.");
                        }
                        System.out.println("Current Seats: " + c.getCurrentSeats());
                        System.out.println();
                    }
                    case 7:
                        System.out.println("Exiting...");
                    break;
                }
            }
            } catch (StudentAlreadyExistsException | CourseAlreadyExistsException e) {
                System.out.println("Add error: " + e.getMessage());
            } catch (StudentNotFoundException e) {
                System.out.println("Registration error (1): " + e.getMessage());
            } catch (CourseNotFoundException e) {
                System.out.println("Registration error (2): " + e.getMessage());
            } catch (CourseFullException e) {
                System.out.println("Registration error (3): " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
            finally {
                System.out.println("Operation completed."); 
            }
            
        }
    }

