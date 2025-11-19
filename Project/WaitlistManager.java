package Part7;

import java.util.PriorityQueue;

public class WaitlistManager {
    private PriorityQueue<WaitlistEntry> courseWaitlist;
    
    public WaitlistManager() {
        courseWaitlist = new PriorityQueue<>();
    }
    
    // Add student to waitlist with given priority
    public void addToWaitlist(Student student, int priority) {
        WaitlistEntry entry = new WaitlistEntry(student, priority);
        courseWaitlist.offer(entry);
        System.out.println("Added " + student.getName() + " to waitlist with priority " + priority);
    }
    
    // Process and remove the next student from waitlist
    public Student processNextStudent() {
        WaitlistEntry entry = courseWaitlist.poll();
        if (entry != null) {
            System.out.println("Processed: " + entry.getStudent().getName() + 
                             " (Priority: " + entry.getPriority() + ")");
            return entry.getStudent();
        }
        System.out.println("Waitlist is empty");
        return null;
    }
    
    // Peek at next student without removing
    public Student peekNextStudent() {
        WaitlistEntry entry = courseWaitlist.peek();
        if (entry != null) {
            System.out.println("Next in waitlist: " + entry.getStudent().getName() + 
                             " (Priority: " + entry.getPriority() + ")");
            return entry.getStudent();
        }
        System.out.println("Waitlist is empty");
        return null;
    }
    
    // Get current waitlist size
    public int getWaitlistSize() {
        return courseWaitlist.size();
    }
    
    // Display all entries in waitlist (note: order may not match priority in display)
    public void displayWaitlist() {
        if (courseWaitlist.isEmpty()) {
            System.out.println("Waitlist is empty");
            return;
        }
        
        System.out.println("\n=== Course Waitlist ===");
        System.out.println("Current size: " + getWaitlistSize());
        System.out.println("Entries (display order may not reflect priority order):");
        
        // Create a copy to avoid modifying the original queue
        PriorityQueue<WaitlistEntry> copy = new PriorityQueue<>(courseWaitlist);
        int position = 1;
        
        while (!copy.isEmpty()) {
            WaitlistEntry entry = copy.poll();
            System.out.printf("Position %d: %s (Priority: %d, Timestamp: %d)%n",
                    position++, 
                    entry.getStudent().getName(),
                    entry.getPriority(),
                    entry.getTimestamp());
        }
    }
    
    // Additional method to display in actual priority order
    public void displayWaitlistInPriorityOrder() {
        if (courseWaitlist.isEmpty()) {
            System.out.println("Waitlist is empty");
            return;
        }
        
        System.out.println("\n=== Waitlist in Priority Order ===");
        
        // Convert to array and sort to display in correct order
        WaitlistEntry[] entries = courseWaitlist.toArray(new WaitlistEntry[0]);
        java.util.Arrays.sort(entries);
        
        int position = 1;
        for (WaitlistEntry entry : entries) {
            System.out.printf("Position %d: %s (Priority: %d)%n",
                    position++, 
                    entry.getStudent().getName(),
                    entry.getPriority());
        }
    }
}
