package DataBase;

import java.util.ArrayList;

import Books_src.Book;
import Excpetion.BookAlreadyRegistered;
import Excpetion.BookDoesntRegistered;
import Excpetion.ClientAlreadyRegistered;
import Excpetion.ClientDoesntRegistered;
import Excpetion.EmployeeAlreadyRegistered;
import Excpetion.EmployeeDoesntRegistered;
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
        for(Book b : bookList){
            if(b.equals(book)){
                return true;
            }
        }
        return false;
    }
    public Boolean verifyClient(Client client){
        for(Client c : clientList){
            if(c.equals(client)){
                return true;
            }
        }
        return false;
    }
    public Boolean verifyEmployee(Employee employee){
        for(Employee e : employeeList){
            if(e.equals(employee)){
                return true;
            }
        }
        return false;
    }
    public Boolean addBook(Book book)throws BookAlreadyRegistered{
        if(verifyBook(book)){
            throw new BookAlreadyRegistered();
        }else{
            return(bookList.add(book));
        }
    }
    public Boolean addClient(Client client)throws ClientAlreadyRegistered{
        if(verifyClient(client)){
            throw new ClientAlreadyRegistered();
        }else{
            return(clientList.add(client));
        }
    }
    public Boolean addEmployee(Employee employee)throws EmployeeAlreadyRegistered{
        if(verifyEmployee(employee)){
            throw new EmployeeAlreadyRegistered();
        }else{
            return(employeeList.add(employee));
        }
    }   
    public Boolean removeBook(Book book)throws BookDoesntRegistered{
        if(!verifyBook(book)){
            throw new BookDoesntRegistered();
        }else{
            return bookList.remove(book);
        }
    }
    public Boolean removeClient(Client client)throws ClientDoesntRegistered{
        if(!verifyClient(client)){
            throw new ClientDoesntRegistered();
        }else{
            return clientList.remove(client);
        }
    }
    public Boolean removeEmployee(Employee employee)throws EmployeeDoesntRegistered{
        if(!verifyEmployee(employee)){
            throw new EmployeeDoesntRegistered();
        }else{
            return employeeList.remove(employee);
        }
    }
    public Book getBook(String tittle)throws BookDoesntRegistered{
        for(Book b : bookList){
            if(b.getTittle().equals(tittle)){
                return b;
            }
        }
        throw new BookDoesntRegistered();
    }
    public Employee getEmployee(String cpf)throws EmployeeDoesntRegistered{
       for(Employee e : employeeList){
        if(e.getCpf().equals(cpf)){
            return e;
        }
       }
       throw new EmployeeDoesntRegistered();
    }
    public Client getClient(String cpf)throws ClientDoesntRegistered{
        for(Client c : clientList){
            if(c.getCpf().equals(cpf)){
                return c;
            }
        }
        throw new ClientDoesntRegistered();
    }
    public ArrayList<Book> getBookList() {
        return bookList;
    }
    public ArrayList<Client> getClientList() {
        return clientList;
    }
    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
}
