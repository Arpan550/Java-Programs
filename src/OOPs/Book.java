package OOPs;

public class Book {
    static int totalBooks;
    String title, author, isbn;
    boolean isBorrowed;

    static {
        totalBooks = 0;
    }

    {
        totalBooks++;
    }

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn) {
        this(isbn, "unknown", "unknown");
    }

    static int getTotalNoBooks() {
        return totalBooks;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Already borrowed!");
        } else {
            this.isBorrowed = true;
            System.out.println("Borrowed");
        }
    }

    void returnBook(){
        if(isBorrowed){
            this.isBorrowed=false;
            System.out.println("Hope you enjoyed..leave a review!!");
        } else{
            System.out.println("Already in the library");
        }
    }

    public static void main(String[] args) {
        Book book1=new Book("1","Design","Author");
        Book book2=new Book("2");
        System.out.println(Book.getTotalNoBooks());
        book1.borrowBook();
        book2.borrowBook();
        book1.returnBook();
        book1.returnBook();
    }
}
