package Week5;

import java.util.Scanner;

public class DemoLognook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        UniversityLogbook logbook=new(50,50);
        int choice;
        do{
            System.out.println("University Logbook");
            System.out.println("1.Add Student");
            System.out.println("2. Add faculty");
            System.out.println("3.Search Person");
            System.out.println("4.Edit Person");
            System.out.println("5.Remove person");
            System.out.println("6.Display person");
            System.out.println("7.Exit");
            switch(choice)
            {
                case 1: 
                String name= in.nextLine();
                String ID=in.nextLine();
                String email=in.nextLine();
                String department=in.nextLine();
                Student s=new Student[name, email , studentID,  major];
                logbook.addStudent(s);
                break;
                case 2: 
                String fname= in.nextLine();
                String fID=in.nextLine();
                String femail=in.nextLine();
                String fdepartment=in.nextLine();
                Faculty f=new Faculty[name, email , studentID,  major];
                logbook.addFaculty(f);
                break;
                case 3: 
                String Search_name=int.nextLine();
                Person p=logbook.SearchByName(Search_name);
                System.out.println(p.getDetails());
                break;
                case4: 
                String e_name= int.nextLine();
                String e_email=int.nextLine();
                String e_department=int.nextLine();
                logbook.editPerson(e_name, e_email, e_department);
                break;
                case 5: 
                String r_name= in.nextLine();
                lohbook.removerPerson(r_name);
                break;
                case 6: logbook.displayAll();
                breal;
                default: 
                System.out.println("not valid choice");
            }
        } 
        while (choice=7);
        
    }
    
}
