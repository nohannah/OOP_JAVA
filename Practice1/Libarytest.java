package Practice1;


public class Libarytest {

    public static void main(String[] args) {
        // Create a library with capacity 3
        Library library = new Library(3);

        // Add books
        LibraryBook  b1= new LibraryBook("Java Basics", "Alice Smith", 29.99f);
        LibraryBook  b2= new LibraryBook("Java Basics", "Alice Smith", 29.99f);
        LibraryBook  b3= new LibraryBook("Python for Beginners", "Bob Johnson", 39.99f);
        
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        // Try adding 4th book (will fail)
        library.addBook(new LibraryBook("Extra Book", "Unknown", 15.00f));

        // Display all books
        library.displayAllBooks();

        // Search for a book
        library.searchBook("Python for Beginners");
        library.searchBook("C++ Programming");
    }
}
