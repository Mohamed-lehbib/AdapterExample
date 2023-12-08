package example3;

public class Main {
    public static void main(String[] args) {
        IBook paperBook = new PaperBook(); // Assuming PaperBook is a concrete implementation of Book
        BookManager bookManager = new BookManager(paperBook);
        bookManager.display();

        EBook eBook = new EBook();
        IBook eBookAdapter = new EBookAdapter(eBook);
        bookManager = new BookManager(eBookAdapter);
        bookManager.display();
    }
}
