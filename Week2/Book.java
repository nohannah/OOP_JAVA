package Week2;

public class Book
{
    String title;
    String author;
    String ISNB;
    int price;


    Book(String title,String author,String ISNB,int price)
    {
        this.title= title;
        this.author=author;
        this.ISNB=ISNB;
        this.price=price;
    }
    void display()
    {
        System.out.println(" The book " + title + " written by " + author + " with ISNB " + ISNB + " is priced at $" + price);
    }
    @Override //learn in future
    public String toString()
    {
        return " Book title is " + this.title + " author is " + this.author + " ISNB is " + this.ISNB + " price is $" + this.price ;
    }
}
