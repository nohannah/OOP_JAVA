package Project;
import java.util.Objects;
public class studentclass {
    private String studentid; 
    private String name; 
    private String email; 
    private int year;

    public studentclass(String studentid, String name, String email, String year)
    {
        this.studentid=studentid;
        this.name=name; 
        this.email=email;
        this.year=year;

    }
    public String getstudentid(){
        return studentid;
    }
    public String getname(){
        return name; 
    }
    public String getemail(){
        return email;
    }
    public int getyear(){
        return year;
    }
    public void setstudentid(String studentid){
        this.studentid=studentid;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setemail(String email){
        this.email=email;
    }
    @Override 
    //taken o as parameter 
    public boolean equals (object o){
        //if this current is equal to parameter which is in the same object in the memories
        if(this==0) return true;
        //check if they are not in the same class 
        if(0==null || getClass()!=o.getClass())return false;
        //casting object o into student 
        studentclass student =(studentclass) o;
        //return true if studentid is equal to the studentid of the parameter student
        return Object.equals(studentid, student.studentid);
    }
    @Override 
    public int hashCode(){
        return Object.hash(studentid);
    }
}
