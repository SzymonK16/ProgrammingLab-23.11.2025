import java.time.LocalDate;


public class Employee extends Person {

    private double salary;
    private LocalDate employment;

    public Employee(String name, double salary, LocalDate employment) {
        super(name);
        this.salary = salary;
        this.employment = employment;
    }

    public double getSalary() {
        return this.salary;
    }

    public LocalDate getEmploymentDate() {
        return this.employment;
    }

    @Override
    public String getDescription() {
        return this.name + " zatrudniony od: " + this.employment + ", wynagreodzenie wynosi: " + this.salary;
    }

    public void get() {
        System.out.println("Imię: " + this.getName());
        System.out.println("Pensja: " + this.getSalary());
        System.out.println("Zatrudniony od: " + this.employment);
    }
}
