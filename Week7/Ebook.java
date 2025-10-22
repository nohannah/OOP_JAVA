package Week7;
public class Ebook extends Book {
    private double fileSize;
    private String format;
    
    public Ebook(String title, String author, String isbn, double fileSize, String format) {
        super(title, author, isbn);
        this.fileSize = fileSize;
        this.format = format;
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
        System.out.println("File Size: " + fileSize + "MB, Format: " + format);
    }
}