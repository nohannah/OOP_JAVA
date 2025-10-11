package Week5;

public class Faculty extends Person {
    protected String facultyID;
    protected String department ; 
    public Student (String name, String email , String facultyID , String department )
    {
        super(name, email);
        this.facultyID=facultyID; 
        this.department=department;
    }
    public void setfacultyID(String facultyID)
    {
        this.facultyID=facultyID;
    }
     public void setDepartment(String department)
    {
        this.department=department;
    }
    public String getfacultyID()
    {
        return facultyID;
    }
    public String getDepartment()
    {
        return  department;
    }
    String getDetail()
    {
        return "Name " + name  +
        "\n email" + email +
        "\nFacultyID" + FacultyID+ 
        "\ndepartment" + department ;
    }
    
}
