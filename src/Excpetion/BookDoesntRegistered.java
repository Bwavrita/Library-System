package Excpetion;

public class BookDoesntRegistered extends Exception {
    public BookDoesntRegistered() {
        super("Book not registered");
    }

    public BookDoesntRegistered(String message) {
        super(message);
    }
}
