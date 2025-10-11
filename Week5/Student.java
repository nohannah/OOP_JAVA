package Week5;

public class Student extends Person {
    protected String studentID;
    protected String major; 
    public Student (String name, String email , String studentID, String major)
    {
        super(name, email);
        this.studentID=studentID; 
        this.major=major;
    }
    public void setStudentID(String studentID)
    {
        this.studentID=studentID;
    }
     public void setMajor(String major)
    {
        this.major=major;
    }
    public String getStudentID()
    {
        return studentID;
    }
    public String getMajor()
    {
        return  major;
    }
    String getDetail()
    {
        return "Name " + name  +
        "\n email" + email +
        "\nstudentID" + StudentID+ 
        "\nMajor" + major;
    }
}
