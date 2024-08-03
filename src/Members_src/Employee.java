package Members_src;

public class Employer extends People{
    private String sector;
    private double salary;

    public Employer(String cpf, String name, String old,String sector,double salary) {
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