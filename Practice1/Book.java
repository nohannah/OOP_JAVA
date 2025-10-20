package Practice1;

public class Book {
    private String title ; 
    private String author; 
    private int yearPublished; 

    //Constructor 
    public Book ( String title , String author, int yearPublished)
    {
        this.title = title; 
        this.author = author; 
        this.yearPublished = yearPublished; 

    }
    //getter 
    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }
    public int getYearPublished()
    {
        return yearPublished; 
    }
    //setter 
    public void setTitle ( String title)
    {
        this.title = title;
    }
    public void setAuthor (String author)
    {
        this.author = author; 
    }
    public void setYearPublished (int yearPublished)
    {
        this.yearPublished = yearPublished;
    }


    public static void main (String[] args)
    {
        Book mybook = new Book ("The choosen", "Alan waler", 2008);

        // access fiel using getter 
        System.out.println("tile: " + mybook.getTitle());
        System.out.println("Author: " + mybook.getAuthor());
        System.out.println("Year Publish: " + mybook.getYearPublished());

        // update field using setter 
        mybook.setTitle("The Alchemist");
        mybook.setAuthor("Hannah");
        mybook.setYearPublished(2012);

        System.out.println("tile: " + mybook.getTitle());
        System.out.println("Author: " + mybook.getAuthor());
        System.out.println("Year Publish: " + mybook.getYearPublished());

    }
}
