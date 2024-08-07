package Members_src;

import java.util.ArrayList;

import Books_src.Book;
import Excpetion.CpfIncorrect;

public class Client extends People{
    private ArrayList<Book> booksWitdrawed = new ArrayList<>();
    
    public Client(String cpf, String name) throws CpfIncorrect{
        super(cpf, name);
    }
    public void borrowBook(Book book){
        booksWitdrawed.add(book);
    }
    public ArrayList<Book> getBooksWitdrawed() {
        return booksWitdrawed;
    }
    public void setBooksWitdrawed(ArrayList<Book> booksWitdrawed) {
        this.booksWitdrawed = booksWitdrawed;
    }
    
}
