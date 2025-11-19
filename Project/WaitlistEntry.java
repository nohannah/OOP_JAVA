package Project;

import java.time.Instant;

public class WaitlistEntry implements Comparable<WaitlistEntry> {
    private Student student;
    private int priority; // lower number = higher priority
    private long timestamp;
    
    public WaitlistEntry(Student student, int priority) {
        this.student = student;
        this.priority = priority;
        this.timestamp = Instant.now().toEpochMilli(); // Current time in milliseconds
    }
    
    // Getters
    public Student getStudent() { return student; }
    public int getPriority() { return priority; }
    public long getTimestamp() { return timestamp; }
    
    @Override
    public int compareTo(WaitlistEntry other) {
        // First compare by priority (lower number = higher priority)
        if (this.priority != other.priority) {
            return Integer.compare(this.priority, other.priority);
        }
        // If priorities are equal, compare by timestamp (earlier = higher priority)
        return Long.compare(this.timestamp, other.timestamp);
    }
    
    @Override
    public String toString() {
        return String.format("Student: %s, Priority: %d, Timestamp: %d", 
                           student.getName(), priority, timestamp);
    }
}