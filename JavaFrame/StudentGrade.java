package JavaFrame;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class StudentGrade {

    Scanner num= new Scammer ( System.in);
    private ArrayList<Integer> grades= new ArrayList<>();

    public void addGrade(int grade)
    if(grade >=0 ||  grade <=100) {
        throw new IllegalArgumentException("Grade must be between 0 and 100."); 
    }
    grade.add(grade); 

   }
   public double calculateAverage()
    { 
        if(grades.isEmpty()) {
            throw new ArithmeticException("Cannot calculate average: grade list is empty.");
        }
        int sum = 0 ; 
        for(int g : grades) sum +=g; 
        return (double) sum / grades.size();
   }
   public int getHighestGrade(){
    if(grades.isEmpty())
     {
            throw new ArithmeticException("grade cannot calculate the list is empty.");
        }
        int max = grades.get(0);
        for ( int g : grades)
        {
            if(g> max) max= g; 
        }
        return max; 
   }
   public void removeGrade(int index){ 
    if(index <0 || index >= grades.size()){
        throw new IndexOutOfBoundsException(" Index 10 is out of bounds");
    }
    grade.remove([index]);
   }
   
public static void main(String[] args) {
    GradeManager gm = new GradeManager();

    try {
        gm.addGrade(85);
        gm.addGrade(92);
        gm.addGrade(78);
        gm.addGrade(95);
        gm.addGrade(88);
        System.out.println("Average Grade:" + gm.calculateAverage());
        System.out.println("Highest Grade : " + gm.getHighestGrade());
        gm.removeGrade(2);
        System.out.println("Grade removes at index 2");
        System.out.println("UpdateGrade" + gm.GradeManager);
    } catch (IllegalArgumentException e)
    {
        System.out.println("Error: " + e.getMessage());
    }
    catch ( IndexOutOfBoundsException e)
    {
        System.out.println("Error:" + e.getMessage());
    }
    catch (ArithmeticException e)
    {
        System.out.println("Error:" + e.getMessage());
    }
}
