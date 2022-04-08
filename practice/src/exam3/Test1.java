package exam3;

import java.time.LocalDate;

/*
date --> {2000-06-25}. date.getDayOfMonth() = 25, 25 >= 20 is true, hence control goes
inside while loop and executes System.out.println(date); statement.

date.plusDays(-1); creates a new LocalDate object {2000-06-24} but date reference variable
still refers to {2000-06-25}. date.getDayOfMonth() again returns 25, this is an infinite loop.
*/

public class Test1 {

    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("2000-06-25");
        while(date.getDayOfMonth() >= 20) {
            System.out.println(date);
            date.plusDays(-1);
        }
    }
}
