package Week5;
interface Searchable {
    Person SearchByName(String name);

    
}
public class UniversityLogbook implements Searchable{
    Student [] students;
    Faculty [] facultyMembers;
    int studentcount;
    int facultycount;

    public UniversityLogbook (int maxStudent , int maxFaculty) 
    {
        students = new Student[ maxStudent];
        facultyMembers=new facultyMembers[maxFaculty];
        studentcount=0;
        facultycount=0;
    }
    public void addStudent(Student s)
    {
        if (studentcount < students.length)
        {
            students[studentcount++] = s;
            System.out.println("Student add Successfully");
        }
        else
        {
            System.out.println( "Student cant bec add");
        }

    }
    public void addFaculty(facultyMembers f)
    {
        if (facultycount < facultyMembers.length)
        {
            facultyMembers[facultycountcount++] = s;
            System.out.println("faculty add Successfully");
        }
        else
        {
            System.out.println( "faculty cant bec add");
        }
    }
    public Person seaPerson(String name)
    {
        for(int i=0; i<studentcount ; i++)
        {
            if(student[i].name.equalsIgnoreCase(name))
            {
                return student[i];
            }
        }
        for(int i=0; i<facultycountcount ; i++)
        {
            if(facultyMembers[i].name.equalsIgnoreCase(name))
            {
                return facultyMembers[i];
            }
        }
        System.out.println("cant find that person ");
        return null;
    }
    public void editPerson(String name , String email , String department)
    {
        Person p=SearchByName(name);
        if(p!=null)
        {
            p.setEmail(email);
            if(p instanceof Student)
            {
                //casting 
                ((Student)p).setMajor(department);
            }
            if(p instanceof Faculty)
            {
                ((Faculty)p).setDepartment(department);
            }
        }
        else {
            System.out.println("Person cant be found");
        }
    }
    public void removerPerson(String name)
    {
        for(int i=o ; i < studentcount ; i++)
        {
            if(Student[i].nmae.equalsIgnoreCase(name))
            {
                for(int j=i ; j< i ; j++ ){
                    students[j] = students[j+i];
                }
                students[--studentcount]=null;
                System.out.println("Remove the student");
                return;
            }

        }
        for(int i=o ; i < facultycount ; i++)
        {
            if(Faculty[i].nmae.equalsIgnoreCase(name))
            {
                for(int j=i ; j< i ; j++ ){
                    facultyMembers[j] = facultyMembers[j+i];
                }
                facultyMembers[--facultycount]=null;
                System.out.println("Remove the faculty");
                return;
            }

        }

    }
    public void displayAll()
    {
        System.out.println("------student-----");

        for (int i=0 ; i<studentcount ; i++)
        {
            System.out.println(students[i].getDetail());
        }
        System.out.println("------faculty-----");
        for (int i=0 ; i<facultycount ; i++)
        {
            System.out.println(facultyMembers[i].getDetail());

        }
    }
    
}
