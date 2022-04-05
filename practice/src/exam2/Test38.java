package exam2;

import java.time.LocalDate;

/*
    minusYears, minusMonths, minusWeeks, minusDays methods accept long parameter
    so you can pass either positive or negative value.

    If positive value is passed, then that specified value is subtracted and if negative
    value is passed, then that specified value is added. I think you still remember: minus
    minus is plus.



    Similarly plusYears, plusMonths, plusWeeks, plusDays methods work in the same
    manner.

    If positive value is passed, then that specified value is added and if negative value
    is passed, then that specified value is subtracted.
*/

public class Test38 {

    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("1980-03-16");
        System.out.println(date.minusYears(-5));
    }
}
