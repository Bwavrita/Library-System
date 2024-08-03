package Members_src;

import java.util.ArrayList;

import Books_src.Book;

public class Client extends People{
    private ArrayList<Book> booksWitdrawed = new ArrayList<>();
    
    public Client(String cpf, String name, String old) {
        super(cpf, name, old);
    }
    public ArrayList<Book> getBooksWitdrawed() {
        return booksWitdrawed;
    }
    public void setBooksWitdrawed(ArrayList<Book> booksWitdrawed) {
        this.booksWitdrawed = booksWitdrawed;
    }
    
}
