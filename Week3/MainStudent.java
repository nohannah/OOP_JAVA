package Week3;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student();

        // add some assessments with fixed values
        student.addAssessment("Midterm", 85, 100);
        student.addAssessment("Final", 72, 100);
        student.addAssessment("Project", 90, 100);

        System.out.println("Initial student record:");
        System.out.println(student);

        // Apply penalty to one of the assessments
        student.addAssessment("Midterm", Grade.C_plus);

        System.out.println("\nAfter penalizing Midterm to C_plus:");
        System.out.println(student);
    }
}
