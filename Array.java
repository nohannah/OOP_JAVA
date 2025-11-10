import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;  
public class Array {
    import java.util.LinkedList
    public static void main(String[] args) {
        // list.ass(new String (original:"One"));
        // list.ass(new Interger (value : 3));
        // System.out.println("2" + list.get(index:1));
        // ArrayList<String> list = new ArrayList<>();
        // list.add("One");
        // list.add("Two");
        // list.add("Three");
        // System.out.println(list.get(0));  // Outputs: One
        // System.out.println(list.get(1));  // Outputs: Two
        // System.out.println(list.get(2));  // Outputs: Three
        // Vector<String> vect= new Vector<>();
        // Vector.add("hannah");
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add(new Interger (value : 3));
        list.add(new double (value : 3.09));
        list.add(new double (value : 5.0));

        // Display list
        System.out.println("LinkedList: " + list);

    } }
    import java.util.ArrayList;

public class GradeManager {

    private ArrayList<Integer> grades = new ArrayList<>();

    // ✅ Add grade (0–100), else throw IllegalArgumentException
    public void addGrade(int grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
        grades.add(grade);
    }

    // ✅ Calculate average, throw ArithmeticException if list empty
    public double calculateAverage() {
        if (grades.isEmpty()) {
            throw new ArithmeticException("Cannot calculate average: grade list is empty.");
        }
        int sum = 0;
        for (int g : grades) sum += g;
        return (double) sum / grades.size();
    }

    // ✅ Get highest grade, throw ArithmeticException if empty
    public int getHighestGrade() {
        if (grades.isEmpty()) {
            throw new ArithmeticException("Cannot get highest grade: grade list is empty.");
        }
        int max = grades.get(0);
        for (int g : grades) {
            if (g > max) max = g;
        }
        return max;
    }

    // ✅ Remove grade at index, throw IndexOutOfBoundsException if invalid
    public void removeGrade(int index) {
        if (index < 0 || index >= grades.size()) {
            throw new IndexOutOfBoundsException("Invalid index for removal.");
        }
        grades.remove(index);
    }

    // ✅ Main method to test functionality
    public static void main(String[] args) {
        GradeManager gm = new GradeManager();

        try {
            gm.addGrade(85);
            gm.addGrade(92);
            gm.addGrade(78);
            gm.addGrade(95);
            gm.addGrade(88);

            System.out.println("Average: " + gm.calculateAverage());
            System.out.println("Highest Grade: " + gm.getHighestGrade());

            gm.removeGrade(2); // Removes grade at index 2 (78)
            System.out.println("Grade removed successfully!");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
