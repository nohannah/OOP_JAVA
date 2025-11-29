package Question1;

import java.util.*;

public class Menu2 {

    public static void main(String[] args) {
        Menu2 app = new Menu2();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1:Add Student  2:Add Course  3:Register  4:Unregister  5:List  6:Exit");
            System.out.print("Choose: ");
            int opt = -1;
            try {
                option = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid option.");
                continue;
            }
            try {
                switch (option) {
                    case 1  {
                        System.out.print("Student id: "); 
                        int id = Integer.parseInt(sc.nextLine().trim());
                        System.out.print("Student name: ");
                        String name = sc.nextLine();
                        app.addStudent(id, name);
                        System.out.println("Student added.");
                    }
                    case 2{
                        System.out.print("Course code: "); 
                        String code = sc.nextLine().trim();
                        System.out.print("Course title: ");
                         String title = sc.nextLine();
                        System.out.print("Capacity: "); 
                        int cap = Integer.parseInt(sc.nextLine().trim());
                        app.addCourse(code, title, cap);
                        System.out.println("Course added.");
                    }
                    case 3  {
                        System.out.print("Student id: "); 
                        int sid = Integer.parseInt(sc.nextLine().trim());
                        System.out.print("Course code: "); 
                        String cc = sc.nextLine().trim();
                        app.register(sid, cc); // exceptions thrown handled by catch below
                    }
                    case 4 {
                        System.out.print("Student id: "); 
                        int sid = Integer.parseInt(sc.nextLine().trim());
                        System.out.print("Course code: "); 
                        String cc = sc.nextLine().trim();
                        app.unregister(sid, cc);
                    }
                    case 5 -> {
                        System.out.println("Students: " + app.students.values());
                        app.courses.forEach((k,v) 
                        System.out.println(k + " enrolled: " + v.enrolled + " / " + v.capacity));
                    }
                    case 6 -> { sc.close(); return; }
                    default -> System.out.println("Unknown option.");
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
        }
    }
}