package Question1;
import java.util.*;

public class Student extends User {
    private String department;
    public Student(String userID, String userName, String department) {
        super(userID, userName);
        this.department = department;

    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public void getRole() {
        System.out.println("Role: Student");
    }
    public void displayInfo() {
        System.out.println("User ID: " + getUserID());
        System.out.println("User Name: " + getUserName());
        System.out.println("Department: " + getDepartment());
    }
    ArrayList<String> StudentList = new ArrayList<String>();
    public void addStudent(String studentName) {
        StudentList.add(studentName);
    }
    HashSet<String> StudentSet = new HashSet<String>();
    public void addUniqueStudent(String studentName) {
        StudentSet.add(studentName);
    }
    //if ID already exist print ID
    public void addUniqueStudentWithCheck(String studentID) {
        if (StudentSet.contains(studentID)) {
            System.out.println("Student ID : " + studentID + " already exists.");
        } else {
            StudentSet.add(studentID);
        }
    }
    // duplicate ID! student not added
    public void displayStudents() {
        System.out.println("Student List:");
        for (String student : StudentList) {
            System.out.println(student);
        }
    }
  
}
