package Week2;

public class TestBook {
    public static void main(String[] args) {
        Book b1= new Book("Novel","John" , " 1234 " , 20);
        Book b2= new Book("Science","Smith" , " 5678 " , 30);
        
        if (b1.price > b2.price)
        {
            System.out.println(b1.title + " is more expensive than " + b2.title);
        }
        else
         {
            System.out.println(b1.title + " is more expensive than " + b2.title);
        }
        // b1.display();
        // b2.display();
        System.out.println(b1);
        System.out.println(b2);
    }
    
}
