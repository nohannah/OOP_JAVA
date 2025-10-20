package Practice1;

public class Student1 {
    String name;
    int[] marks;  // Fixed variable name from 'mark' to 'marks'
    
    public Student1(String name, int[] marks) {  // Fixed parameter name
        this.name = name;
        this.marks = marks;
    }
    
    // Method overloading - version 1: Display all marks
    public void displayInfo() {  // Fixed: removed parameters, added void return type
        System.out.println(name + "'s Marks:");
        System.out.println("Math: " + marks[2] + ", Science: " + marks[0] + ", English: " + marks[1]);
    }
    
    // Method overloading - version 2: Display specific subject mark
    public void displayInfo(String subject) {  // Fixed: corrected parameter types
        int subjectMark = -1;
        switch (subject.toLowerCase()) {
            case "math":
                subjectMark = marks[2];
                break;
            case "science":
                subjectMark = marks[0];
                break;
            case "english":
                subjectMark = marks[1];
                break;
        }
        System.out.println(name + "'s " + subject + " mark: " + subjectMark);
    }
    
    public String calculateGrade() {  // Fixed: added String return type
        int sum = 0;
        for (int m : marks) {  // Fixed: changed variable name to avoid conflict
            sum += m;
        }
        double average = sum / 3.0;
        
        if (average >= 80) {  // Fixed: corrected grade thresholds
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else {
            return "F";
        }
    }
    
    // Fixed: Moved main method inside the same class, removed inner class
    public static void main(String[] args) {
        Student1[] students = {  // Fixed: changed from Student to Student1
            new Student1("Alice", new int[]{85, 78, 92}),   // Science, English, Math
            new Student1("Bob", new int[]{80, 82, 75}),     // Science, English, Math
            new Student1("Charlie", new int[]{65, 70, 60})  // Science, English, Math
        };
        
        for (Student1 student : students) {  // Fixed: changed from Student to Student1
            // Call both displayInfo() versions
            student.displayInfo();
            student.displayInfo("Science");
            
            // Print overall grade
            System.out.println(student.name + "'s Grade: " + student.calculateGrade());
            System.out.println();
        }
    }
}