package System_src;

import java.util.ArrayList;
import Books_src.Book;
import DataBase.Data;
import Excpetion.BookAlreadyRegistered;
import Excpetion.BookDoesntRegistered;
import Excpetion.ClientAlreadyRegistered;
import Excpetion.ClientDoesntRegistered;
import Excpetion.EmployeeDoesntRegistered;
import Members_src.Client;
import Members_src.Employee;

public class SystemLibrary implements SystemInterface {
    private Data dataBase = new Data();

    @Override
    public Boolean borrowBook(String title, String cpf) {//Arrumar
        try {
            Book book = dataBase.getBook(title);
            if (book.getAvailable()) {
                System.out.println("Passou aqui");
                book.setAvailable();
                Client client = dataBase.getClient(cpf);
                client.borrowBook(book);
                return true;
            } else {
                System.out.println("Nao disponivel");
                return false;
            }
        } catch (ClientDoesntRegistered e) {
            System.out.println("Client not registered");
            return false;
        } catch (BookDoesntRegistered e) {
            System.out.println("Error: Book not registered");
            return false;
        }
    }

    @Override
    public Boolean registerBook(Book book) {
        try {
            return dataBase.addBook(book);
        } catch (BookAlreadyRegistered e) {
            System.out.println("Book already registered");
        }
        return Boolean.FALSE;  // Retorna falso se ocorrer qualquer exceção
    }

    @Override
    public int registeredBooks() {
        return dataBase.getBookList().size();
    }

    @Override
    public Book searchBook(String title) {
        try {
            return dataBase.getBook(title);
        } catch (BookDoesntRegistered e) {
            System.out.println("Book not found");
        }
        return null;  // Retorna null se o livro não for encontrado
    }

    @Override
    public ArrayList<Book> searchAuthor(String author) {
        ArrayList<Book> tempList = new ArrayList<>();
        for (Book b : dataBase.getBookList()) {
            if (b.getAuthor().equals(author)) {
                tempList.add(b);
            }
        }
        return tempList;
    }

    @Override
    public ArrayList<Book> searchBooksAvailable() {
        ArrayList<Book> tempList = new ArrayList<>();
        for (Book b : dataBase.getBookList()) {
            if (b.getAvailable()) {
                tempList.add(b);
            }
        }
        return tempList;
    }

    @Override
    public Boolean registerEmployer(Employee employee) {
        try {
            return dataBase.addEmployee(employee);
        } catch (Exception e) {
            System.out.println("Employer already registered");
        }
        return Boolean.FALSE;  // Retorna falso se ocorrer qualquer exceção
    }

    @Override
    public Boolean registerClient(Client member) {
        try {
            return dataBase.addClient(member);
        } catch (ClientAlreadyRegistered e) {
            System.out.println("Client already registered");
        }
        return Boolean.FALSE;  // Retorna falso se ocorrer qualquer exceção
    }

    @Override
    public Employee verifyEmployer(String cpf) {
        try {
            return dataBase.getEmployee(cpf);
        } catch (EmployeeDoesntRegistered e) {
            System.out.println("Employee not registered");
        }
        return null;  // Retorna null se o empregado não for encontrado
    }

    @Override
    public Client verifyClient(String cpf) {
        try {
            return dataBase.getClient(cpf);
        } catch (ClientDoesntRegistered e) {
            System.out.println("Client not registered");
        }
        return null;  // Retorna null se o cliente não for encontrado
    }

    @Override
    public ArrayList<Book> verifyClientOwes(Client client) {
        try {
            return dataBase.getClient(client.getCpf()).getBooksWitdrawed();
        } catch (ClientDoesntRegistered e) {
            System.out.println("Client not registered");
        }
        return new ArrayList<>();  // Retorna uma lista vazia se o cliente não for encontrado
    }

    @Override
    public ArrayList<Client> getAllClients() {
        return new ArrayList<>(dataBase.getClientList());
    }
}
