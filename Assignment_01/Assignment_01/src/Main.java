import java.awt.*;
import java.time.LocalDateTime;
import java.time.LocalDate;

void main() {
    LocalDate calendar = LocalDate.now();

    int today = calendar.getDayOfMonth();
    int month = calendar.lengthOfMonth();

    LocalDate FirstDay = calendar.withDayOfMonth(1);
    int dow = FirstDay.getDayOfWeek().getValue();
    int emptySlots = (dow == 7) ? 6 : (dow - 1);
    System.out.println("Mon Tue Wed Thu Fri Sat Sun");

    for (int i = 0; i < emptySlots; i++) {
        System.out.print("    ");
    }


    for (int i = 1; i <= month; i++) {
        if (i == today){
            System.out.printf("%2d* ", i);
        }
        else {
            System.out.printf("%3d ", i);
        }
        int currentDow = LocalDate.of(calendar.getYear(), calendar.getMonth(), i).getDayOfWeek().getValue();
        if (currentDow == 7) {
            System.out.println();
        }
    }}


