package System_src;

import java.util.ArrayList;

import Books_src.Book;

public interface SystemInterface {

    public Boolean withdrawBook();
    public Boolean registerBook();
    public int registeredBooks();
    public Book searchBook(String title);
    public ArrayList<Book> searchAuthor(String author);
    public ArrayList<Book> searchBooksAvailable();

}   
