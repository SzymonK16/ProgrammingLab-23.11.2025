import java.time.LocalDate;


void main() {

    Employee Jan = new Employee("Jan", 4200, LocalDate.parse("2020-06-02"));
    Manager Tomek = new Manager("Tomek", 5500, LocalDate.parse("2019-01-02"), 700);
    Employee Szymon = new Employee("Szymon", 6900, LocalDate.parse("2000-06-02"));

    Employee[] employees = { Jan, Tomek, Szymon };

    for (Employee e : employees) {
        e.get();
        System.out.println("Opis: " + e.getDescription());
        System.out.println();
    }
}

