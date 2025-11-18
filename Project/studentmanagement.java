package Project;
import java.util.ArrayList;
public class studentmanagement {
    private ArrayList<studentclass> studentlist;

    public studentmanagement(){
        studentlist=new Arraylist<>();
    }
    //add student to the list
    public void addstudent(studentclass student)
    {
        studentlist.add(student);
        System.out.println("Student added" + student.getname());
    }
    //remove student vai id
    public void removestudent (String studentid)
}
