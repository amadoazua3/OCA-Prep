package exam5;

import java.sql.SQLException;

public class Test50 {

    private static void availableSeats() throws SQLException {
        throw null; //Line 7
    }

    public static void main(String[] args) {
        try {
            availableSeats(); //Line 12
        } catch(SQLException e) {
            System.out.println("SEATS NOT AVAILABLE");
        }
    }

}

/*
    Classes in Exception framework are normal java classes, hence null can be used wherever
    instances of Exception classes are used, so Line 7 compiles successfully.

    No issues with Line 12 as method availableSeats() declares to throw SQLException and
    main(String []) method code correctly handles it.

    Program compiles successfully but on execution, NullPointerException is thrown, stack trace
    is printed on to the console and program ends abruptly.

    If you debug the code, you would find that internal routine for throwing null exception
    causes NullPointerException.
*/