import java.time.LocalDate;

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, LocalDate employment, double bonus) {
        super(name, salary, employment);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + this.bonus;
    }

    @Override
    public String getDescription() {
        return this.name + " zatrudniony od " + getEmploymentDate() +
                ", zarabia łącznie " + this.getSalary() + "wliczając w to bonus " + this.bonus;
    }

    @Override
    public void get() {
        super.get();
        System.out.println("Bonus: " + this.bonus);
    }
}
