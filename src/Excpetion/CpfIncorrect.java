package Excpetion;

public class CpfIncorrect extends Exception {
    public CpfIncorrect() {
        super("CPF incorrect");
    }

    public CpfIncorrect(String message) {
        super(message);
    }
}
