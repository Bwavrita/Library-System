package Members_src;

public class People{
    private String cpf;
    private String name;
    private String old;
    
    public People(String cpf, String name, String old) {
        this.cpf = cpf;
        this.name = name;
        this.old = old;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOld() {
        return old;
    }
    public void setOld(String old) {
        this.old = old;
    }
    
}