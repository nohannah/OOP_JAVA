package Week3;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("How many assessments do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // input assessments
        for (int i = 0; i < n; i++) {
            System.out.print("Enter assessment name: ");
            String name = sc.nextLine();

            System.out.print("Enter mark obtained: ");
            int mark = sc.nextInt();

            System.out.print("Enter total possible mark: ");
            int totalMark = sc.nextInt();
            sc.nextLine(); // consume newline

            student.addAssessment(name, mark, totalMark);
        }

        System.out.println("\nStudent record:");
        System.out.println(student);

        // try grade adjustment
        System.out.print("\nDo you want to penalize a grade? (yes/no): ");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter grade to penalize to (e.g., B, C_plus): ");
            String gradeStr = sc.nextLine();
            Grade newGrade = Grade.valueOf(gradeStr);
            student.addAssessment("dummy", newGrade); // apply penalty
        }

        System.out.println("\nFinal student record:");
        System.out.println(student);

        sc.close();
    }
}

