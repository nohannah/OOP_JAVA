package Week7;
import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> booksList;
    private HashMap<String, Book> booksMap;
    
    public Library() {
        booksList = new ArrayList<>();
        booksMap = new HashMap<>();
    }
    
    // Part 1: ArrayList methods
    public void addBook(Book book) {
        booksList.add(book);
    }
    
    public void listBooks() {
        System.out.println("Listing all books:");
        for (Book book : booksList) {
            book.displayDetails();
        }
    }
    
    // Part 2: HashMap methods
    public void addBookToMap(Book book) {
        booksMap.put(book.getIsbn(), book);
    }
    
    public void findBookByISBN(String isbn) {
        try {
            Book book = booksMap.get(isbn);
            if (book != null) {
                book.displayDetails();
            } else {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println("Book with ISBN: " + isbn + " not found.");
        }
    }
    
    // Part 4: Remove book with exception handling
    public void removeBook(String isbn) {
        try {
            Book removedBook = booksMap.remove(isbn);
            if (removedBook != null) {
                // Also remove from ArrayList
                booksList.removeIf(book -> book.getIsbn().equals(isbn));
                System.out.println("Book with ISBN: " + isbn + " removed.");
            } else {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println("Book not found in the system.");
        }
    }
    
    // Helper method to add books to both collections
    public void addBookToBoth(Book book) {
        addBook(book);
        addBookToMap(book);
    }
}