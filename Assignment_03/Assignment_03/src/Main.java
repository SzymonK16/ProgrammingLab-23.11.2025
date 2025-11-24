import java.time.LocalDate;


public static void main(String[] args) {

    Employee Jan = Employee.createJunior("Szymon", LocalDate.parse("2020-06-02"));
    Manager Tomek = Manager.createSenior("Tomek",LocalDate.parse("2019-01-02"),700);
    Employee Szymon = Employee.createMid("Szymon", LocalDate.parse("2020-01-15"));

    Employee[] employees = {Jan, Tomek, Szymon};

    for (Employee e : employees) {
        e.get();
        System.out.println();

    }
}
