
package Part8;
import java.util.*;
public class WaitlistEntry implements Comparable<WaitlistEntry> {
    private Student student;
    private String courseCode;
    private int priority;   // lower number = higher priority
    private long timestamp; // used to break ties

    public WaitlistEntry(Student student, String courseCode, int priority, long timestamp) {
        this.student = student;
        this.courseCode = courseCode;
        this.priority = priority;
        this.timestamp = timestamp;
    }

    public Student getStudent() {
        return student;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getPriority() {
        return priority;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public int compareTo(WaitlistEntry other) {
        // FIRST compare by priority
        if (this.priority != other.priority) {
            return Integer.compare(this.priority, other.priority);
        }

        // If priority same → compare by timestamp (earlier timestamp = higher priority)
        return Long.compare(this.timestamp, other.timestamp);
    }

    @Override
    public String toString() {
        return student.getName() + " (Course: " + courseCode + ", Priority: " + priority + ")";
    }
}
