package Week5;

public abstract class Person {
    protected String name;
    protected String email;
    
    public Person(String name, String email)
    {
        this.email = email;
        this.name=name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
     public void setEmail(String Email)
    {
        this.email=email;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return  email;
    }
    abstract String getDetails(); //
}
