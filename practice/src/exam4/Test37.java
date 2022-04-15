package exam4;

import java.time.LocalDate;

/*
    Both the methods "public boolean isEqual(ChronoLocalDate)" and "public boolean
    equals(Object)" return true if date objects are equal otherwise false.

    NOTE: LocalDate implements ChronoLocalDate.
*/

public class Test37 {

    public static void main(String [] args) {
        LocalDate date1 = LocalDate.parse("1980-03-16");
        LocalDate date2 = LocalDate.parse("1980-03-16");
        System.out.println(date1.equals(date2) + " : " + date1.isEqual(date2));
    }

}
