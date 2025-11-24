import java.time.LocalDate;

public class Employee{
    private String name;
    private double salary;
    private LocalDate employment;

    public Employee(String name, double salary, LocalDate employment){
        this.name = name;
        this.salary = salary;
        this.employment = employment;
    }

    public double getSalary(){
        return this.salary;
    }

    public String getName(){
        return this.name;
    }

    public void get(){
        System.out.println("Pracownik: "+ this.name);
        System.out.println("Pensja: " + this.getSalary());
        System.out.println("W firmie od: " + this.employment);
    }
}

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, LocalDate employment, double bonus){
        super(name,salary,employment);
        this.bonus = bonus;
    }

    @Override
    public double getSalary(){
        return super.getSalary() + this.bonus;
    }

    @Override
    public void get(){
        super.get();
        System.out.println("W pensje wliczony został rownież bonus w wysokości: " + this.bonus);
    }

}

void main() {
    Employee Jan = new Employee("Jan",4200, LocalDate.parse("2020-06-02"));
    Manager Tomek = new Manager("Tomek", 5500,LocalDate.parse("2019-01-02"),700);
    Employee Szymon = new Employee("Szymom", 6900, LocalDate.parse("2000-06-02"));

    Employee[] employees = {Jan, Tomek, Szymon};

    for (Employee e : employees){
        e.get();
    }
}
