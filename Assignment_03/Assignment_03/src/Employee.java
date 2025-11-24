import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private  LocalDate employment;


    public Employee(String name,double salary, LocalDate employment){
        this.name = name;
        this.salary = salary;
        this.employment = employment;
    }
    public static Employee createJunior(String name, LocalDate employment) {
        return new Employee(name, 5000, employment);
    }

    public static Employee createMid(String name, LocalDate employment) {
        return new Employee(name, 10000, employment);
    }

    public static Employee createSenior(String name, LocalDate employment) {
        return new Employee(name, 15000, employment);
    }

    public double getSalary(){
        return this.salary;
    }

    public String getName(){
        return this.name;
    }

    public LocalDate getEmployment() {
        return this.employment;
    }

    public void get(){
        System.out.println("Pracownik: " + this.name);
        System.out.println("Pensja: " + this.getSalary());
        System.out.println("W firmie od: " + this.employment);
    }

}
