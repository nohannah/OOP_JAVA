package Project ;

import java.util.Objects;

public class StudentCourseKey implements Comparable<StudentCourseKey> {
     private String studentId;
    private String courseCode;
    
    public StudentCourseKey(String studentId, String courseCode) {
        this.studentId = studentId;
        this.courseCode = courseCode;
    }
    
    // Getters
    public String getStudentId() { return studentId; }
    public String getCourseCode() { return courseCode; }
    
    // Setters
    public void setStudentId(String studentId) { this.studentId = studentId; }
    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentCourseKey that = (StudentCourseKey) o;
        return Objects.equals(studentId, that.studentId) && 
               Objects.equals(courseCode, that.courseCode);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(studentId, courseCode);
    }
    
    @Override
    public int compareTo(StudentCourseKey other) {
        // First compare by studentId, then by courseCode
        int studentCompare = this.studentId.compareTo(other.studentId);
        if (studentCompare != 0) {
            return studentCompare;
        }
        return this.courseCode.compareTo(other.courseCode);
    }
    
    @Override
    public String toString() {
        return studentId + "-" + courseCode;
    }
    
}
