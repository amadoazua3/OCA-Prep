package exam1;

import java.time.LocalDate;
import java.time.LocalTime;

/*
    LocalTime.MIN --> {00:00}, LocalTime.Max --> {23:59:59.999999999}
    LocalTime.MIDNIGHT --> {00:00}, LocalTime.NOON --> {12:00}.

    date.atTime(LocalTime) method creates a LocalDateTime instance by combining date
    and time parts.

    toString() method of LocalDateTime class prints the date and time parts separated by
    T in upper case.
*/

public class Test21 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.parse("1947-08-14");
        LocalTime time = LocalTime.MAX;
        System.out.println(date.atTime(time)); // outputs: 1947-08-14T23:59:59.999999999

    }
}
