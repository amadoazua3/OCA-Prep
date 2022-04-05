package exam2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/*
    While working with dates, programmers get confused with M & m and D & d.

    Easy way to remember is that Bigger(Upper case) letters represent something bigger.
    M represents month & m represents minute, D represents day of the year & d
    represents day of the month.

    LocalDate's object doesn't have time component, mm represents minute and not
    months so at runtime format method throws exception.
*/

public class Test64 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.of(2012, 1, 11);
        Period period = Period.ofMonths(2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm-dd-yy");
        System.out.print(formatter.format(date.minus(period)));
    }
}
