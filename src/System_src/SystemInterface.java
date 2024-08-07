package System_src;

import java.util.ArrayList;

import Books_src.Book;
import Members_src.Client;
import Members_src.Employee;

public interface SystemInterface {

    public Boolean borrowBook(String tittle,String cpf);
    public Boolean registerBook(Book book);
    public int registeredBooks();
    public Book searchBook(String tittle);
    public ArrayList<Book> searchAuthor(String author);
    public ArrayList<Book> searchBooksAvailable();
    public Boolean registerEmployer(Employee employee);
    public Boolean registerClient(Client member);
    public Employee verifyEmployer(String cpf);
    public Client verifyClient(String cpf);
    public ArrayList<Book> verifyClientOwes(Client client);
    public ArrayList<Client> getAllClients();
}   
