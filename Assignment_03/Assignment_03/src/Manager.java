import java.time.LocalDate;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, LocalDate employment, double bonus){
        super(name, salary, employment);
        this.bonus = bonus;
    }


    public static Manager createJunior(String name, LocalDate employment, double bonus) {
        return new Manager(name, 5000, employment, bonus);
    }

    public static Manager createMid(String name, LocalDate employment, double bonus) {
        return new Manager(name, 10000, employment, bonus);
    }

    public static Manager createSenior(String name, LocalDate employment, double bonus) {
        return new Manager(name, 15000, employment, bonus);
    }

    @Override
    public double getSalary(){
        return super.getSalary() + this.bonus;
    }

    @Override
    public void get(){
        super.get();
        System.out.println("Bonus: " + this.bonus);
    }
}
