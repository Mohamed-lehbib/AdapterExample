package example3;

public class EBookAdapter implements IBook {
    private EBook eBook;

    public EBookAdapter(EBook eBook) {
        this.eBook = eBook;
    }

    @Override
    public void displayBookDetails() {
        eBook.showEBook();
    }
}
