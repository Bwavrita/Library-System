package System_src;

import java.util.ArrayList;

import Books_src.Book;

public class System implements SystemInterface {
    @SuppressWarnings("unused")
    private ArrayList<Book> bookList = new ArrayList<>();

    @Override
    public Boolean withdrawBook() {
        return false;
    }

    @Override
    public Boolean registerBook() {
        return false;
    }

    @Override
    public int registeredBooks() {
        return 0;
    }

    @Override
    public Book searchBook(String title) {
        return null;
    }

    @Override
    public ArrayList<Book> searchAuthor(String author) {
        return null;
    }

    @Override
    public ArrayList<Book> searchBooksAvailable() {
        return null;
    }
    
}
