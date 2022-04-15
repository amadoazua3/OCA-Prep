package exam4;

import java.time.LocalDate;

/*
    LocalDate.now(); retrieves the current date from the system clock. There is no issue
    with this statement.

    obj is of LocalDate type and getHour() method is not defined in LocalDate class, it is
    defined in LocalTime and LocalDateTime class. Hence obj.getHour() causes compilation failure.
*/

public class Test53 {

    public static void main(String [] args) {
        LocalDate obj = LocalDate.now();
//        System.out.println(obj.getHour());
    }

}
