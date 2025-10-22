package Week7;
public class Book {
    protected String title;
    protected String author;
    protected String isbn;
    
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
    
    // Getter for ISBN
    public String getIsbn() {
        return isbn;
    }
}