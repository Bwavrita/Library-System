package System_src;

import java.util.ArrayList;

import Books_src.Book;
import Members_src.Client;
import Members_src.Employee;

public interface SystemInterface {

    public Boolean borrowBook();
    public Boolean registerBook();
    public int registeredBooks();
    public Book searchBook(String title);
    public ArrayList<Book> searchAuthor(String author);
    public ArrayList<Book> searchBooksAvailable();
    public Boolean registerEmployer(Employee employee);
    public Boolean registerCliente(Client member);
    public Employee verifyEmployer(String name);
    public Client verifyClient(String name);
    public ArrayList<Client> verifyClientOwes(Client client);
}   
