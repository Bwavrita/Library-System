package Members_src;

import Excpetion.CpfIncorrect;

public class People{
    private String cpf;
    private String name;
    private String old;
    
    public People(String cpf, String name, String old)throws CpfIncorrect {
        this.cpf = cpf;
        this.name = name;
        this.old = old;
        if(verifyCpf(cpf)){
            throw new CpfIncorrect();
        }
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
    public Boolean verifyCpf(String cpf){
        if (cpf.length() != 11) {
            return false;
        }
    
        int total;
        int digit;
        String firstVerify;
        String secVerify;
    
        total = 0;
        for (int i = 0; i < 9; i++) {
            digit = Character.getNumericValue(cpf.charAt(i));
            total += digit * (10 - i);
        }
        total = (total * 10) % 11;
        if (total >= 10) {
            total = 0;
        }
        firstVerify = Integer.toString(total);
    
        total = 0;
        for (int i = 0; i < 10; i++) {
            digit = Character.getNumericValue(cpf.charAt(i));
            total += digit * (11 - i);
        }
        total = (total * 10) % 11;
        if (total >= 10) {
            total = 0;
        }
        secVerify = Integer.toString(total);
    
        String cpfFirstVerify = Character.toString(cpf.charAt(9));
        String cpfSecVerify = Character.toString(cpf.charAt(10));
    
        return firstVerify.equals(cpfFirstVerify) && secVerify.equals(cpfSecVerify);
    }

    public Boolean equals(String cpf){
        if(getCpf().equals(cpf)){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        return "Name: " + getName() + "\tCpf: " + getCpf();
    }
    
}