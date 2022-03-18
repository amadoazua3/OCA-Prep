package exam1;


/*
    date --> {2012-01-11}, period --> {P2M}, date.minus(period) --> {2011-11-11}
    [subtract 2 months period from {2012-01-11}, month is changed to 11 and year is
    changed to 2011].

    formatter -> {MM-dd-yy}, when date {2011-11-11} is formatter in this format 11-11-11
    is printed on to the console.
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test5 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012, 1, 11);
        Period period = Period.ofMonths(2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy");
        System.out.println(formatter.format(date.minus(period)));
    }
}
