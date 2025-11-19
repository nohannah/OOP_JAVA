package Project;

import java.util.*;

public class CourseManagementSystem {
    // Use the existing collection instances from previous parts
    private StudentManager studentManager;
    private CourseCatalog courseCatalog;
    private EnrollmentManager enrollmentManager;
    private GradeManager gradeManager;
    private WaitlistManager waitlistManager;
    
    // Constructor that takes existing instances
    public CourseManagementSystem(StudentManager studentManager, 
                                 CourseCatalog courseCatalog,
                                 EnrollmentManager enrollmentManager,
                                 GradeManager gradeManager,
                                 WaitlistManager waitlistManager) {
        this.studentManager = studentManager;
        this.courseCatalog = courseCatalog;
        this.enrollmentManager = enrollmentManager;
        this.gradeManager = gradeManager;
        this.waitlistManager = waitlistManager;
    }
    
    // Integration methods
    public void enrollStudentInCourse(String studentId, String courseCode) {
        try {
            Student student = studentManager.findStudentById(studentId);
            Course course = courseCatalog.findCourseByCode(courseCode);
            
            if (student == null) {
                System.out.println("Student not found: " + studentId);
                return;
            }
            if (course == null) {
                System.out.println("Course not found: " + courseCode);
                return;
            }
            
            // Check course capacity using enrollment manager
            if (enrollmentManager.isCourseFull(courseCode)) {
                System.out.println("Course " + courseCode + " is full. Adding to waitlist.");
                waitlistManager.addToWaitlist(student, 1); // Default priority
            } else {
                enrollmentManager.enrollStudentInCourse(student, course);
                System.out.println("Successfully enrolled " + student.getName() + " in " + course.getCourseName());
            }
        } catch (Exception e) {
            System.out.println("Error during enrollment: " + e.getMessage());
        }
    }
    
    public void assignGrade(String studentId, String courseCode, double grade) {
        try {
            gradeManager.assignGrade(studentId, courseCode, grade);
            System.out.println("Grade assigned successfully");
        } catch (Exception e) {
            System.out.println("Error assigning grade: " + e.getMessage());
        }
    }
    
    public void displayStudentTranscript(String studentId) {
        try {
            Student student = studentManager.findStudentById(studentId);
            if (student == null) {
                System.out.println("Student not found: " + studentId);
                return;
            }
            
            System.out.println("\n=== Student Transcript ===");
            System.out.println("Student: " + student.getName() + " (" + studentId + ")");
            System.out.println("Email: " + student.getEmail());
            System.out.println("Year: " + student.getYear());
            System.out.println("\nCourses and Grades:");
            System.out.println("-------------------");
            
            // Get all grades for the student
            Map<String, Double> studentGrades = gradeManager.getAllGradesForStudent(studentId);
            double totalGradePoints = 0;
            int totalCredits = 0;
            
            for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
                String courseCode = entry.getKey();
                Double grade = entry.getValue();
                Course course = courseCatalog.findCourseByCode(courseCode);
                
                if (course != null) {
                    System.out.printf("%s - %s: %.2f (Credits: %d)\n", 
                        courseCode, course.getCourseName(), grade, course.getCredits());
                    
                    totalGradePoints += grade * course.getCredits();
                    totalCredits += course.getCredits();
                }
            }
            
            if (totalCredits > 0) {
                double gpa = totalGradePoints / totalCredits;
                System.out.printf("\nGPA: %.2f (Total Credits: %d)\n", gpa, totalCredits);
            } else {
                System.out.println("\nNo courses with grades found.");
            }
            
        } catch (Exception e) {
            System.out.println("Error displaying transcript: " + e.getMessage());
        }
    }
    
    public void displayCourseRoster(String courseCode) {
        try {
            Course course = courseCatalog.findCourseByCode(courseCode);
            if (course == null) {
                System.out.println("Course not found: " + courseCode);
                return;
            }
            
            System.out.println("\n=== Course Roster ===");
            System.out.println("Course: " + course.getCourseName() + " (" + courseCode + ")");
            System.out.println("Credits: " + course.getCredits() + ", Capacity: " + course.getCapacity());
            
            // Get enrolled students
            List<Student> enrolledStudents = enrollmentManager.getStudentsInCourse(course);
            System.out.println("\nEnrolled Students (" + enrolledStudents.size() + "/" + course.getCapacity() + "):");
            System.out.println("------------------");
            for (Student student : enrolledStudents) {
                System.out.println("ID: " + student.getStudentId() + ", Name: " + student.getName());
            }
            
            // Get waitlisted students
            System.out.println("\nWaitlisted Students:");
            System.out.println("-------------------");
            waitlistManager.displayWaitlist();
            
        } catch (Exception e) {
            System.out.println("Error displaying roster: " + e.getMessage());
        }
    }
    
    public void processWaitlistForCourse(String courseCode) {
        try {
            Course course = courseCatalog.findCourseByCode(courseCode);
            if (course == null) {
                System.out.println("Course not found: " + courseCode);
                return;
            }
            
            int availableSpots = course.getCapacity() - enrollmentManager.getStudentsInCourse(course).size();
            
            System.out.println("Processing waitlist for " + courseCode + " - " + availableSpots + " spots available");
            
            for (int i = 0; i < availableSpots && !waitlistManager.isWaitlistEmpty(); i++) {
                Student nextStudent = waitlistManager.processNextStudent();
                if (nextStudent != null) {
                    enrollmentManager.enrollStudentInCourse(nextStudent, course);
                    System.out.println("Enrolled waitlisted student: " + nextStudent.getName());
                }
            }
            
            System.out.println("Waitlist processing completed");
            
        } catch (Exception e) {
            System.out.println("Error processing waitlist: " + e.getMessage());
        }
    }
    
    // Main menu-driven application
    public void runMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            System.out.println("\n=== Course Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Add Course");
            System.out.println("4. Remove Course");
            System.out.println("5. Enroll Student in Course");
            System.out.println("6. Assign Grade");
            System.out.println("7. Display Student Transcript");
            System.out.println("8. Display Course Roster");
            System.out.println("9. Add to Waitlist");
            System.out.println("10. Process Waitlist");
            System.out.println("11. Display All Students");
            System.out.println("12. Display All Courses");
            System.out.println("13. Exit");
            System.out.print("Choose an option: ");
            
            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                switch (choice) {
                    case 1:
                        addStudentMenu(scanner);
                        break;
                    case 2:
                        removeStudentMenu(scanner);
                        break;
                    case 3:
                        addCourseMenu(scanner);
                        break;
                    case 4:
                        removeCourseMenu(scanner);
                        break;
                    case 5:
                        enrollStudentMenu(scanner);
                        break;
                    case 6:
                        assignGradeMenu(scanner);
                        break;
                    case 7:
                        displayTranscriptMenu(scanner);
                        break;
                    case 8:
                        displayRosterMenu(scanner);
                        break;
                    case 9:
                        addToWaitlistMenu(scanner);
                        break;
                    case 10:
                        processWaitlistMenu(scanner);
                        break;
                    case 11:
                        studentManager.displayAllStudents();
                        break;
                    case 12:
                        courseCatalog.displayCoursesForward();
                        break;
                    case 13:
                        running = false;
                        System.out.println("Exiting Course Management System. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
        scanner.close();
    }
    
    // Menu helper methods
    private void addStudentMenu(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        
        Student student = new Student(studentId, name, email, year);
        studentManager.addStudent(student);
    }
    
    private void removeStudentMenu(Scanner scanner) {
        System.out.print("Enter Student ID to remove: ");
        String studentId = scanner.nextLine();
        studentManager.removeStudent(studentId);
    }
    
    private void addCourseMenu(Scanner scanner) {
        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine();
        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine();
        System.out.print("Enter Credits: ");
        int credits = scanner.nextInt();
        System.out.print("Enter Capacity: ");
        int capacity = scanner.nextInt();
        scanner.nextLine();
        
        Course course = new Course(courseCode, courseName, credits, capacity);
        courseCatalog.addCourseAtEnd(course);
    }
    
    private void removeCourseMenu(Scanner scanner) {
        System.out.print("Enter Course Code to remove: ");
        String courseCode = scanner.nextLine();
        courseCatalog.removeCourse(courseCode);
    }
    
    private void enrollStudentMenu(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine();
        enrollStudentInCourse(studentId, courseCode);
    }
    
    private void assignGradeMenu(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine();
        System.out.print("Enter Grade: ");
        double grade = scanner.nextDouble();
        scanner.nextLine();
        assignGrade(studentId, courseCode, grade);
    }
    
    private void displayTranscriptMenu(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        displayStudentTranscript(studentId);
    }
    
    private void displayRosterMenu(Scanner scanner) {
        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine();
        displayCourseRoster(courseCode);
    }
    
    private void addToWaitlistMenu(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter Priority (lower = higher priority): ");
        int priority = scanner.nextInt();
        scanner.nextLine();
        
        Student student = studentManager.findStudentById(studentId);
        if (student != null) {
            waitlistManager.addToWaitlist(student, priority);
        } else {
            System.out.println("Student not found!");
        }
    }
    
    private void processWaitlistMenu(Scanner scanner) {
        System.out.print("Enter Course Code to process waitlist: ");
        String courseCode = scanner.nextLine();
        processWaitlistForCourse(courseCode);
    }
    
    // Main method to run the complete system
    public static void main(String[] args) {
        // Create instances of all managers (assuming you have these from previous parts)
        StudentManager studentManager = new StudentManager();
        CourseCatalog courseCatalog = new CourseCatalog();
        EnrollmentManager enrollmentManager = new EnrollmentManager();
        GradeManager gradeManager = new GradeManager();
        WaitlistManager waitlistManager = new WaitlistManager();
        
        // Create the integrated system
        CourseManagementSystem system = new CourseManagementSystem(
            studentManager, courseCatalog, enrollmentManager, gradeManager, waitlistManager
        );
        
        // Run the menu system
        system.runMenu();
    }
}
