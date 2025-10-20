package Practice1;

class LibraryBook
{
    private String title; 
    private String author;
    private float price; 

    public LibraryBook(String title, String author, float price)
    {
        this.title = title; 
        this.author = author;
        this.price = price;

    }  
    public String getTitle() {
        return title;
    }
     public void displayBook()
    {
        System.out.println("Title: " + title +  " | Author: " + author +  " | Price: $" + price);
    }

} 

class Library
{
        private LibraryBook[] books;
        private int count; 

        public Library (int size)
        {
            books = new LibraryBook[size];
            count = 0; 
        }

        public void addBook(LibraryBook book)
        {
            if(count < books.length)
            {
                books[count] = book;
                count++;
                System.out.println("Book added " + book.getTitle());
            }
            else 
            {
                System.out.println("Library is full. Cannot add more books.");
            }
        }
      public void searchBook(String title) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found:");
                books[i].displayBook();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book with title \"" + title + "\" not found.");
        }
    }
     public void displayAllBooks() {
        System.out.println("\n--- Library Books ---");
        for (int i = 0; i < count; i++) {
            books[i].displayBook();
        }
    }
}


