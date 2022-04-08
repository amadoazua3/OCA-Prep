package exam3;

import java.time.LocalDate;

/*
    date --> {2018-06-06}.

    date.minusDays(10); => as LocalDate is immutable, hence a new LocalDate object is
    created {2018-05-27} but no variable refers to it. date still refers to {2018-06-06}.

    2018-06-06 is displayed on to the console.
*/

public class Test28 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2018-06-06");
        date.minusDays(10);
        System.out.println(date);
    }

}