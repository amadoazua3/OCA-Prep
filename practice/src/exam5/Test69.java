package exam5;

import java.sql.SQLException;

public class Test69 {

    private static void checkData() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) {
            e = null; //Line 10
//            throw e; //Line 11
        }
    }

    public static void main(String[] args) {
        try {
            checkData(); //Line 17
        } catch(SQLException e) {
            System.out.println("NOT AVAILABLE");
        }
    }

}

/*
    Exception is a java class, so `e = null;` is a valid statement and compiles successfully.

    If you comment Line 10, and simply throw e, then code would compile successfully as compiler
    is certain that 'e' would refer to an instance of SQLException only.

    But the moment compiler finds `e = null;`, `throw e;` (Line 11) causes compilation error as at
    runtime 'e' may refer to any Exception type.

    NOTE: No issues with Line 17 as method checkData() declares to throw SQLException and
    main(String []) method code correctly handles it.
*/