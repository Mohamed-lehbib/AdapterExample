package example3;

public class BookManager {
    private IBook book;

    public BookManager(IBook book) {
        this.book = book;
    }

    public void display() {
        book.displayBookDetails();
    }
}
