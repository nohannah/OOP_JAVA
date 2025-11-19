package Part8;
import java.util.*;
public class StudentCourseKey implements Comparable<StudentCourseKey> {

    private String studentId;
    private String courseCode;

    public StudentCourseKey(String studentId, String courseCode) {
        this.studentId = studentId;
        this.courseCode = courseCode;
    }

    public String getStudentId() { return studentId; }
    public String getCourseCode() { return courseCode; }

    @Override
    public int compareTo(StudentCourseKey other) {
        int cmp = studentId.compareTo(other.studentId);
        if (cmp != 0) return cmp;
        return courseCode.compareTo(other.courseCode);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof StudentCourseKey)) return false;
        StudentCourseKey k = (StudentCourseKey) o;
        return studentId.equals(k.studentId) && courseCode.equals(k.courseCode);
    }

    @Override
    public int hashCode() {
        return (studentId + courseCode).hashCode();
    }

    @Override
    public String toString() {
        return studentId + "-" + courseCode;
    }
}
