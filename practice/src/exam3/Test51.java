package exam3;

import java.time.LocalDate;
import java.time.Period;

/*
    Constructor of LocalDate is declared private so cannot be called from outside, hence
    new LocalDate(2020, 2, 14); causes compilation failure.

    Overloaded static methods "of" and "parse" are provided to create the instance of LocalDate.

    LocalTime, LocalDateTime, Period also specify private constructors and provide "of" and
    "parse" methods to create respective instances.
*/

public class Test51 {

    public static void main(String [] args) {
//        LocalDate obj = new LocalDate(2020, 2, 14);       // Compilation error
//        LocalDate obj = LocalDate.parse("2020-02-14");        // Solution A
        LocalDate obj = LocalDate.of(2020, 02, 14);     // Solution B
        System.out.println(obj.minus(Period.ofDays(10)));
    }

}
