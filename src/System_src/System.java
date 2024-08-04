package System_src;

import java.util.ArrayList;

import Books_src.Book;
import Members_src.Client;
import Members_src.Employee;

public class System implements SystemInterface {

    @SuppressWarnings("unused")
    private ArrayList<Book> bookList = new ArrayList<>();

    @Override
    public Boolean borrowBook() {
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

    @Override
    public Boolean registerEmployer(Employee employee) {
        throw new UnsupportedOperationException("Unimplemented method 'registerEmployer'");
    }

    @Override
    public Boolean registerCliente(Client member) {
        throw new UnsupportedOperationException("Unimplemented method 'registerCliente'");
    }

    @Override
    public Employee verifyEmployer(String name) {
        throw new UnsupportedOperationException("Unimplemented method 'verifyEmployer'");
    }

    @Override
    public Client verifyClient(String name) {
        throw new UnsupportedOperationException("Unimplemented method 'verifyClient'");
    }

    @Override
    public ArrayList<Client> verifyClientOwes(Client client) {
        throw new UnsupportedOperationException("Unimplemented method 'verifyClientOwes'");
    }
    
}
