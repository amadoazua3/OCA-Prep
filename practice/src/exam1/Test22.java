package exam1;

import java.time.LocalDateTime;

/*
    LocalDateTime stores both date and time parts. LocalDateTime.now(); retrieves the
    current date and time from the system clock. obj.getSecond() can return any value
    between 0 and 59.
*/

public class Test22 {

    public static void main(String[] args) {

        LocalDateTime obj = LocalDateTime.now();
        System.out.println(obj.getSecond());
    }
}
