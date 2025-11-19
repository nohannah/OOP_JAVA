package Part7;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        // Create test students
        Student student1 = new Student("S001", "Alice Johnson", "alice@uni.edu", 2);
        Student student2 = new Student("S002", "Bob Smith", "bob@uni.edu", 3);
        Student student3 = new Student("S003", "Charlie Brown", "charlie@uni.edu", 1);
        Student student4 = new Student("S004", "David Lee", "david@uni.edu", 4);
        Student student5 = new Student("S005", "Eva Garcia", "eva@uni.edu", 2);
        
        // Create waitlist manager
        WaitlistManager waitlistManager = new WaitlistManager();
        
        System.out.println("=== Testing Priority-Based Waitlist ===\n");
        
        // Test Case 1: Add students with different priorities
        System.out.println("1. Adding students to waitlist:");
        waitlistManager.addToWaitlist(student1, 3);
        
        // Small delay to ensure different timestamps
        try { Thread.sleep(10); } catch (InterruptedException e) {}
        
        waitlistManager.addToWaitlist(student2, 1);
        
        try { Thread.sleep(10); } catch (InterruptedException e) {}
        
        waitlistManager.addToWaitlist(student3, 4);
        
        try { Thread.sleep(10); } catch (InterruptedException e) {}
        
        waitlistManager.addToWaitlist(student4, 2);
        
        try { Thread.sleep(10); } catch (InterruptedException e) {}
        
        waitlistManager.addToWaitlist(student5, 1); // Same priority as student2, but later
        
        // Display current waitlist
        waitlistManager.displayWaitlist();
        waitlistManager.displayWaitlistInPriorityOrder();
        
        // Test Case 2: Peek at next student without removing
        System.out.println("\n2. Peeking at next student:");
        waitlistManager.peekNextStudent();
        
        // Test Case 3: Process next 3 students
        System.out.println("\n3. Processing next 3 students:");
        waitlistManager.processNextStudent(); // Should be Bob (priority 1, earliest)
        waitlistManager.processNextStudent(); // Should be Eva (priority 1, later)
        waitlistManager.processNextStudent(); // Should be David (priority 2)
        
        // Test Case 4: Display remaining waitlist
        System.out.println("\n4. Remaining waitlist:");
        waitlistManager.displayWaitlist();
        waitlistManager.displayWaitlistInPriorityOrder();
        
        // Test Case 5: Display waitlist size
        System.out.println("\n5. Current waitlist size: " + waitlistManager.getWaitlistSize());
        
        // Test Case 6: Process remaining students
        System.out.println("\n6. Processing remaining students:");
        while (waitlistManager.getWaitlistSize() > 0) {
            waitlistManager.processNextStudent();
        }
        
        // Test Case 7: Try to process from empty waitlist
        System.out.println("\n7. Processing from empty waitlist:");
        waitlistManager.processNextStudent();
    }
}
