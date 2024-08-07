package Members_src;

import Excpetion.CpfIncorrect;

public class People{
    private String cpf;
    private String name;
    private int old;
    
    public People(String cpf, String name)throws CpfIncorrect {
        this.cpf = cpf;
        this.name = name;
        if(verifyCpf(cpf)){
            throw new CpfIncorrect();//Verificar sobre o CPF
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
    public int getOld() {
        return old;
    }
    public void setOld(int old) {
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

    public Boolean equals(People people){
        if(getCpf().equals(people.getCpf())){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        return "Name: " + getName() + "\tCpf: " + getCpf();
    }
    
}