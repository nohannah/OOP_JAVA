package Week7;
public class Testbook {
    public static void main(String[] args) {
        Library library = new Library();
        
        // Create books
        Book book1 = new Book("Java Programming", "Author A", "ISBN001");
        Book book2 = new Book("Advanced Java", "Author B", "ISBN002");
        Ebook ebook1 = new Ebook("Python Basics", "Author C", "ISBN003", 5.6, "PDF");
        
        // Add books to library
        library.addBookToBoth(book1);
        library.addBookToBoth(book2);
        library.addBookToBoth(ebook1);
        
        // Test Part 1: List all books
        library.listBooks();
        System.out.println();
        
        // Test Part 2: Find books by ISBN
        System.out.println("Finding book with ISBN: ISBN001");
        library.findBookByISBN("ISBN001");
        System.out.println();
        
        System.out.println("Finding book with ISBN: ISBN003");
        library.findBookByISBN("ISBN003");
        System.out.println();
        
        // Test Part 4: Remove books
        System.out.println("Removing book with ISBN: ISBN001");
        library.removeBook("ISBN001");
        System.out.println();
        
        System.out.println("Removing book with ISBN: ISBN003");
        library.removeBook("ISBN003");
        System.out.println();
        
        // Try to find removed books
        System.out.println("Finding book with ISBN: ISBN001 (after removal)");
        library.findBookByISBN("ISBN001");
        System.out.println();
        
        // List remaining books
        System.out.println("Remaining books after removal:");
        library.listBooks();
    }
}