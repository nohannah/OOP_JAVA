package Week3;

enum Grade{
    A,
    A_minus,
    B_plus,
    B,
    B_minus,
    C_plus,
    C,
    C_minus,
    D,
    F,
}
public class Assessment{
    String name; 
    int mark;
    int totalmark;
    int fudgeMark;
    public Assessment (String name, int mark,int totalmark,int fudgeMark)
    {
        this.name=name;
        this.mark=mark;
        this.totalmark=totalmark;
        this.fudgeMark=fudgeMark;
    }
    public Grade ComputerGrade()
    {
        int c_mark= mark+ fudgeMark;
        double total=((double)c_mark/(double)totalmark)/100;
        if(total >= 90)
        return Grade.A;
        else if(total >=85) 
        return Grade.A_minus;
        else if (total >80)
        return Grade.B_plus;
        else if (total >=75)
        return Grade.B;
        else if (total >70)
        return Grade.B_minus;
        else if (total >=65)
        return Grade.C_plus;
        else if (total >=60)
        return Grade.C;
        else if (total >=55)
        return Grade.C_minus;
        else if (total >=50)
        return Grade.D;
        else 
        return Grade.F;
    }
    public void penalize(int penalty)
    {
        this.fudgeMark=-penalty;
    }
    public void penalize(Grade newGrade)
    {
        int bestFudge =0;
        for(int i=0; i<mark ;i++)
        {
            fudgeMark =-i;
            if(ComputerGrade() == newGrade)
            {
                bestFudge=-i;
            }
            else if (bestFudge != 0)
            {
                break;
            }
        }
        fudgeMark=bestFudge;
    }
    @Override
    public String toString() 
    {
        return "Assessment [name=" + name + ", mark=" + mark + ", totalmark=" + totalmark + ", ComputerGrade()="
         + ComputerGrade() + "]";
    }
    
}

