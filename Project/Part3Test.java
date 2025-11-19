package Project;


    public class Part3Test {
    public static void main(String[] args) {
        // Create StudentManager instance
        StudentManager manager = new StudentManager();
        
        // Create test students
        Student student1 = new Student("S001", "Alice Johnson", "alice@uni.edu", 2);
        Student student2 = new Student("S002", "Bob Smith", "bob@uni.edu", 3);
        Student student3 = new Student("S003", "Carol Davis", "carol@uni.edu", 1);
        Student student4 = new Student("S004", "David Wilson", "david@uni.edu", 4);
        Student student5 = new Student("S005", "Eva Brown", "eva@uni.edu", 2);
        
        System.out.println("=== Test Case 1: Enroll 5 Students ===");
        // Enroll 5 students
        System.out.println("Enrolling Alice: " + manager.enrollStudent(student1));
        System.out.println("Enrolling Bob: " + manager.enrollStudent(student2));
        System.out.println("Enrolling Carol: " + manager.enrollStudent(student3));
        System.out.println("Enrolling David: " + manager.enrollStudent(student4));
        System.out.println("Enrolling Eva: " + manager.enrollStudent(student5));
        
        manager.displayActiveStudents();
        System.out.println();
        
        System.out.println("=== Test Case 2: Try Enrolling Duplicate Student ===");
        // Try to enroll duplicate student (same studentId)
        Student duplicateStudent = new Student("S001", "Alice Johnson", "alice@uni.edu", 2);
        System.out.println("Enrolling duplicate Alice: " + manager.enrollStudent(duplicateStudent));
        System.out.println("Active student count: " + manager.getActiveStudentCount());
        System.out.println();
        
        System.out.println("=== Test Case 3: Check if Specific Student is Active ===");
        // Check if specific students are active
        System.out.println("Is student S001 active? " + manager.isStudentActive("S001"));
        System.out.println("Is student S999 active? " + manager.isStudentActive("S999"));
        System.out.println();
        
        System.out.println("=== Test Case 4: Withdraw 2 Students ===");
        // Withdraw 2 students
        System.out.println("Withdrawing Bob: " + manager.withdrawStudent(student2));
        System.out.println("Withdrawing David: " + manager.withdrawStudent(student4));
        
        manager.displayActiveStudents();
        System.out.println();
        
        System.out.println("=== Test Case 5: Display Count of Active Students ===");
        System.out.println("Active student count: " + manager.getActiveStudentCount());
        System.out.println();
        
        System.out.println("=== Test Case 6: Convert to Array and Display ===");
        Student[] studentArray = manager.convertToArray();
        System.out.println("Converted to array - Length: " + studentArray.length);
        System.out.println("Array contents:");
        for (Student student : studentArray) {
            System.out.println("  " + student);
        }
        System.out.println();
        
        System.out.println("=== Test Case 7: Clear All Enrollments ===");
        manager.clearAllEnrollments();
        System.out.println("After clearing all enrollments:");
        manager.displayActiveStudents();
    }
}
    

