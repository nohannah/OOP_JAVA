package Part8;
import java.util.*;

public class WaitlistManager {
    private PriorityQueue<WaitlistEntry> waitlistQueue;

    public WaitlistManager() {
        this.waitlistQueue = new PriorityQueue<>();
    }

    public void addToWaitlist(Student student, String courseCode, int priority) {
        WaitlistEntry entry = new WaitlistEntry(student, courseCode, priority, System.currentTimeMillis());
        waitlistQueue.offer(entry);
        System.out.println("Added " + student.getName() + " to waitlist for " + courseCode + " with priority " + priority);
    }

    public WaitlistEntry getNextWaitlistEntry() {
        return waitlistQueue.poll();
    }

    public boolean isWaitlistEmpty(String courseCode) {
        for (WaitlistEntry entry : waitlistQueue) {
            if (entry.getCourseCode().equals(courseCode)) {
                return false;
            }
        }
        return true;
    }

    public void displayWaitlistForCourse(String courseCode) {
        System.out.println("\n=== Waitlist for " + courseCode + " ===");
        boolean found = false;
        
        // Create temporary list to maintain order
        List<WaitlistEntry> tempList = new ArrayList<>();
        
        for (WaitlistEntry entry : waitlistQueue) {
            if (entry.getCourseCode().equals(courseCode)) {
                tempList.add(entry);
                found = true;
            }
        }
        
        // Sort by priority and timestamp for display
        tempList.sort(Comparator.naturalOrder());
        
        for (WaitlistEntry entry : tempList) {
            System.out.println(entry.getStudent().getName() + 
                             " (Priority: " + entry.getPriority() + 
                             ", Timestamp: " + entry.getTimestamp() + ")");
        }
        
        if (!found) {
            System.out.println("No students in waitlist for this course.");
        }
    }

    public int getWaitlistSize() {
        return waitlistQueue.size();
    }

    public void clearWaitlist() {
        waitlistQueue.clear();
        System.out.println("Waitlist cleared.");
    }
}