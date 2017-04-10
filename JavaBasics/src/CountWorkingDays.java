import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class CountWorkingDays {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String start = console.nextLine();
        String end = console.nextLine();

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate startDate = LocalDate.from(f.parse(start));
        LocalDate endDate = LocalDate.from(f.parse(end));

        LocalDate[] holidays = new LocalDate[]{
                LocalDate.of(2016, 1, 1),
                LocalDate.of(2016, 3, 3),
                LocalDate.of(2016, 5, 1),
                LocalDate.of(2016, 5, 6),
                LocalDate.of(2016, 5, 24),
                LocalDate.of(2016, 9, 6),
                LocalDate.of(2016, 9, 22),
                LocalDate.of(2016, 11, 1),
                LocalDate.of(2016, 12, 24),
                LocalDate.of(2016, 12, 25),
                LocalDate.of(2016, 12, 26),
        };

        int counter = 0;

        for (LocalDate current = startDate; current.isBefore(endDate.plusDays(1)); current = current.plusDays(1)) {
            LocalDate possibleHoliday = LocalDate.of(2016, current.getMonth(), current.getDayOfMonth());

            if (!Arrays.asList(holidays).contains(possibleHoliday) && current.getDayOfWeek() != DayOfWeek.SATURDAY && current.getDayOfWeek() != DayOfWeek.SUNDAY) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
