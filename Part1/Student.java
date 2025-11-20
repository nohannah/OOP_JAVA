package Part1;

import java.util.Objects;

public class Student {
    private String studentId;
    private String name;
    private String email;
    private int year;

    public Student(String studentId, String name, String email, int year) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.year = year;
    }

    // Getters
    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public int getYear() { return year; }

    // Setters
    public void setStudentId(String studentId) { this.studentId = studentId; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setYear(int year) { this.year = year; }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}
