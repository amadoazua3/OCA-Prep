package exam5;

import java.time.LocalDate;

public class Test45 {

    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("1983-06-30");
        System.out.println(date.plusMonths(8));
    }

}

/*
    plusMonths(long) method of LocalDate class returns a copy of this LocalDate with the specified
    number of months added.

    This method adds the specified amount to the months field in three steps:

        Add the input months to the month-of-year field

        Check if the resulting date would be invalid

        Adjust the day-of-month to the last valid day if necessary


    For the given code,

    1983-06-30 plus 8 months would result in the invalid date 1984-02-30. Instead of returning an invalid
    result, the last valid day of the month, 1984-02-29, is returned.

    Please note, 1984 is leap year and hence last day of February is 29 and not 28.
*/