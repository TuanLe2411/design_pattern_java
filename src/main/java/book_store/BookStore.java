package book_store;

public class BookStore {
    private static final BookStore bookStore = new BookStore();

    private BookStore() {}

    public static BookStore getBookStore() {
        return bookStore;
    }
}
