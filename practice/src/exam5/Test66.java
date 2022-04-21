package exam5;

import java.io.IOException;
import java.sql.SQLException;

public class Test66 {
    public static void main(String[] args) {
        /*INSERT*/
    }

    private static void save() throws IOException {}

    private static void log() throws SQLException {}
}

/*
Which of the block of codes can be used to replace / *INSERT* / such that there is no compilation error?

        Select 3 options.

        - try {
                save();
                log();
            } catch(IOException | SQLException ex) {}

            (Correct)

        - try {
                save();
                log();
            } catch(SQLException | IOException ex) {}

            (Correct)

        - try {
                save();
                log();
            } catch(Exception ex) {}

            (Correct)

        - try {
                save();
                log();
            } catch(Exception | Runtime ex) {}

        - try {
                save();
                log();
            } catch(SQLException | Exception ex) {}

        - try {
                save();
                log();
            } catch(IOException | Exception ex) {}

*/

/*
save() method throws IOException (which is a Checked Exception) and log() method throws SQLException (which is also a Checked Exception).

Let's check all the options one by one (I am just using the catch-block as try-block of all the options are same):

catch(IOException | SQLException ex) {}: ✓ As IOException and SQLException are not related to each other in multi-level inheritance, hence this multi-catch syntax is valid.

catch(SQLException | IOException ex) {}: ✓ Same as above, order of exceptions in multi-catch syntax doesn't matter.

catch(IOException | Exception ex) {}: ✗ Causes compilation error as IOException extends Exception.

catch(SQLException | Exception ex) {}: ✗ Causes compilation error as SQLException extends Exception.

catch(Exception | RuntimeException ex) {}: ✗ Causes compilation error as RuntimeException extends Exception.

catch(Exception ex) {}: ✓ As Exception is the super class of both IOException and SQLException, hence it can handle both the exceptions.
*/