package Members_src;

import Excpetion.CpfIncorrect;

public class Employee extends People{
    private String sector;
    private double salary;

    public Employee(String cpf, String name, String old,String sector,double salary) throws CpfIncorrect {
        super(cpf, name, old);
        this.sector = sector;
        this.salary = salary;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}