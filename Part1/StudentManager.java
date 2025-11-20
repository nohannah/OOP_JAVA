package Part1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StudentManager {
    private final List<Student> studentList = new ArrayList<>();

    // Add student (returns false if student with same ID already exists)
    public boolean addStudent(Student s) {
        if (s == null) return false;
        if (findStudentById(s.getStudentId()) != null) return false;
        return studentList.add(s);
    }

    // Remove student by ID
    public boolean removeStudent(String studentId) {
        if (studentId == null) return false;
        Iterator<Student> it = studentList.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (studentId.equals(s.getStudentId())) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    // Find student by ID
    public Student findStudentById(String studentId) {
        if (studentId == null) return null;
        for (Student s : studentList) {
            if (studentId.equals(s.getStudentId())) return s;
        }
        return null;
    }

    // Display all students using Iterator
    public void displayAllStudents() {
        Iterator<Student> it = studentList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    // Get students by year
    public List<Student> getStudentsByYear(int year) {
        List<Student> result = new ArrayList<>();
        for (Student s : studentList) {
            if (s.getYear() == year) result.add(s);
        }
        return result;
    }

    // Sort students by name (case-insensitive)
    public void sortStudentsByName() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
    }
}
