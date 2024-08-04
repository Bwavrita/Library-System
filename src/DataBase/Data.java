package DataBase;

import java.util.ArrayList;

import Books_src.Book;
import Members_src.Client;
import Members_src.Employee;

public class Data {
    private ArrayList<Book> bookList;
    private ArrayList<Client> clientList;
    private ArrayList<Employee> employeeList;

    public Data(){
        this.bookList = new ArrayList<>();
        this.clientList = new ArrayList<>();
        this.employeeList = new ArrayList<>();
    }

    public Boolean verifyBook(Book book){
        return false;
    }
    public Boolean verifyClient(Client client){
        return false;
    }
    public Boolean verifyEmployee(Employee employee){
        return false;
    }
    public Boolean addBook(Book book){
        return false;
    }
    public Boolean addCliente(Client client){
        return false;
    }
    public Boolean addEmployee(){
        return false;
    }   
    public Boolean removeBook(Book book){
        return false;
    }
    public Boolean removeClient(Client client){
        return false;
    }
    public Boolean removeEmployee(Employee employee){
        return false;
    }
    public Book getBook(String tittle){
        return null;
    }
    public Employee getEmployee(String cpf){
        return null;
    }
    public Client getClient(String cpf){
        return null;
    }
}
