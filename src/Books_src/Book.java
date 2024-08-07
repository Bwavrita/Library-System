package Books_src;

import Util_src.Date;

public class Book {
    private String tittle;
    private String author;
    private Date publicationDate;
    private Boolean available = true;
    
    public Book(String tittle, String author) {
        this.tittle = tittle;
        this.author = author;
    }

    public Book(String tittle, String author, Date publicationDate) {
        this.tittle = tittle;
        this.author = author;
        this.publicationDate = publicationDate;
    }
    
    public String getTittle() {
        return tittle;
    }
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Date getPublicationDate() {
        return publicationDate;
    }
    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }
    public Boolean getAvailable() {
        return available;
    }
    public void setAvailable() {
        if(getAvailable()){
            this.available = false;
        }else{
            this.available = true;
        }
    }

    public Boolean equals(Book book){
        if(getTittle().equals(book.getTittle())){
            return true;
        }else{
            return false;
        }
    }
    
}
