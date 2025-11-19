package Part8;
import java.util.*;

public class CourseManagementSystem {
    private ArrayList<Student> studentList = new ArrayList<>();
    private LinkedList<Course> courseCatalog = new LinkedList<>();
    private HashMap<Student, List<Course>> enrollmentMap = new HashMap<>();
    private TreeMap<StudentCourseKey, Double> gradeBook = new TreeMap<>();
    private PriorityQueue<WaitlistEntry> waitlist = new PriorityQueue<>();

    private Scanner sc = new Scanner(System.in);

    // ---------------- MENU SYSTEM -------------------

    public void start() {
        while (true) {
            System.out.println("\n===== COURSE MANAGEMENT SYSTEM =====");
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
            System.out.println("11. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: removeStudent(); break;
                case 3: addCourse(); break;
                case 4: removeCourse(); break;
                case 5: enrollStudentInCourse(); break;
                case 6: assignGrade(); break;
                case 7: displayStudentTranscript(); break;
                case 8: displayCourseRoster(); break;
                case 9: addToWaitlist(); break;
                case 10: processWaitlist(); break;
                case 11: return;
                default: System.out.println("Invalid choice.");
            }
        }
    }

    // ---------------- STUDENT FUNCTIONS -------------------

    private void addStudent() {
        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        sc.nextLine();

        Student s = new Student(id, name, email, year);
        studentList.add(s);

        System.out.println("Student added successfully.");
    }

    private void removeStudent() {
        System.out.print("Enter Student ID to remove: ");
        String id = sc.nextLine();

        studentList.removeIf(s -> s.getStudentId().equals(id));

        System.out.println("Student removed.");
    }

    private Student findStudent(String id) {
        for (Student s : studentList) {
            if (s.getStudentId().equals(id)) return s;
        }
        return null;
    }

    // ---------------- COURSE FUNCTIONS -------------------

    private void addCourse() {
        System.out.print("Course Code: ");
        String code = sc.nextLine();

        System.out.print("Course Name: ");
        String name = sc.nextLine();

        System.out.print("Credits: ");
        int credits = sc.nextInt();

        System.out.print("Capacity: ");
        int capacity = sc.nextInt();
        sc.nextLine();

        Course c = new Course(code, name, credits, capacity);
        courseCatalog.add(c);

        System.out.println("Course added successfully.");
    }

    private void removeCourse() {
        System.out.print("Enter Course Code to remove: ");
        String code = sc.nextLine();

        courseCatalog.removeIf(c -> c.getCourseCode().equals(code));

        System.out.println("Course removed.");
    }

    private Course findCourse(String code) {
        for (Course c : courseCatalog) {
            if (c.getCourseCode().equals(code)) return c;
        }
        return null;
    }

    // ---------------- ENROLLMENT FUNCTIONS -------------------

    private void enrollStudentInCourse() {
        System.out.print("Enter Student ID: ");
        String studentId = sc.nextLine();
        Student s = findStudent(studentId);

        if (s == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter Course Code: ");
        String code = sc.nextLine();
        Course c = findCourse(code);

        if (c == null) {
            System.out.println("Course not found.");
            return;
        }

        // Check if course is full
        int enrolledCount = 0;
        for (List<Course> courses : enrollmentMap.values()) {
            if (courses.contains(c)) {
                enrolledCount++;
            }
        }
        
        if (enrolledCount >= c.getCapacity()) {
            System.out.println("Course full! Adding student to waitlist.");
            addToWaitlist(s, c.getCourseCode(), 1); // Default priority 1
            return;
        }

        enrollmentMap.computeIfAbsent(s, k -> new ArrayList<>()).add(c);
        System.out.println("Student enrolled successfully.");
    }

    // ---------------- GRADE FUNCTIONS -------------------

    private void assignGrade() {
        System.out.print("Enter Student ID: ");
        String studentId = sc.nextLine();

        System.out.print("Enter Course Code: ");
        String courseCode = sc.nextLine();

        System.out.print("Enter Grade: ");
        double grade = sc.nextDouble();
        sc.nextLine();

        StudentCourseKey key = new StudentCourseKey(studentId, courseCode);
        gradeBook.put(key, grade);

        System.out.println("Grade assigned.");
    }

    private void displayStudentTranscript() {
        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();

        Student s = findStudent(id);
        if (s == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.println("\n=== Transcript for " + s.getName() + " ===");

        double total = 0;
        int count = 0;

        for (Map.Entry<StudentCourseKey, Double> entry : gradeBook.entrySet()) {
            if (entry.getKey().getStudentId().equals(id)) {
                System.out.println(entry.getKey().getCourseCode() + ": " + entry.getValue());
                total += entry.getValue();
                count++;
            }
        }

        if (count > 0) {
            System.out.println("GPA = " + (total / count));
        } else {
            System.out.println("No grades assigned yet.");
        }
    }

    // ---------------- ROSTER FUNCTIONS -------------------

    private void displayCourseRoster() {
        System.out.print("Enter Course Code: ");
        String code = sc.nextLine();

        Course c = findCourse(code);
        if (c == null) {
            System.out.println("Course not found.");
            return;
        }

        System.out.println("\n=== Roster for " + code + " ===");

        for (Map.Entry<Student, List<Course>> entry : enrollmentMap.entrySet()) {
            if (entry.getValue().contains(c)) {
                System.out.println(entry.getKey());
            }
        }

        System.out.println("\n--- Waitlist ---");
        for (WaitlistEntry w : waitlist) {
            if (w.getCourseCode().equals(code)) {
                System.out.println(w.getStudent() + " (Priority " + w.getPriority() + ")");
            }
        }
    }

    // ---------------- WAITLIST FUNCTIONS -------------------

    private void addToWaitlist() {
        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();
        Student s = findStudent(id);

        if (s == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter Course Code: ");
        String courseCode = sc.nextLine();

        System.out.print("Enter Priority (lower = faster): ");
        int priority = sc.nextInt();
        sc.nextLine();

        addToWaitlist(s, courseCode, priority);
        System.out.println("Added to waitlist.");
    }

    private void addToWaitlist(Student s, String courseCode, int priority) {
        waitlist.offer(new WaitlistEntry(s, courseCode, priority, System.currentTimeMillis()));
    }

    private void processWaitlist() {
        if (waitlist.isEmpty()) {
            System.out.println("Waitlist empty.");
            return;
        }

        WaitlistEntry next = waitlist.poll();
        Student s = next.getStudent();
        Course c = findCourse(next.getCourseCode());

        if (c != null) {
            enrollmentMap.computeIfAbsent(s, k -> new ArrayList<>()).add(c);
            System.out.println("Processed waitlist: Enrolled " + s.getName() + " in " + c.getCourseCode());
        } else {
            System.out.println("Course not found for waitlist entry: " + next.getCourseCode());
        }
    }

    // ---------------- MAIN FUNCTION -------------------

    public static void main(String[] args) {
        new CourseManagementSystem().start();
    }
}