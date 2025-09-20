package Week2;

class Person
{
    String name ; 
    int age;
    String Address;

    Person(String name, int age, String Address)
    {
        this.name= name;
        this.age=age;
        this.Address=Address;
    }
    void introduce()
    {
        System.out.println (" Hi, i am "+ name + " my age is " + age + " I live in "+ Address);
    }
}


