package Excpetion;

public class ClientDoesntRegistered extends Exception {
    public ClientDoesntRegistered() {
        super("Client not registered");
    }

    public ClientDoesntRegistered(String message) {
        super(message);
    }
}
