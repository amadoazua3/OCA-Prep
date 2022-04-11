package exam3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
    LocalDate object doesn't contain time part but ISO_DATE_TIME looks for time
    portion and throws exception at runtime.

    For the OCA exam, you can check following DateTimeFormatter types: BASIC_ISO_DATE,
    ISO_DATE, ISO_LOCAL_DATE, ISO_TIME, ISO_LOCAL_TIME, ISO_DATE_TIME, ISO_LOCAL_DATE_TIME.
*/

public class Test53 {

    public static void main(String [] args) {
        LocalDate date = LocalDate.of(1987, 9, 1);
        String str = date.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Date is: " + str);
    }

}
