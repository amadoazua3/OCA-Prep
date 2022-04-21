package exam5;

public class Test32 {

    private static void div() {
        System.out.println(1/0);
    }

    public static void main(String[] args) {
        try {
            div();
        } finally {
            System.out.println("FINALLY");
        }
    }

}

/*
    As method div() doesn't declare to throw any Checked Exception, hence main(String [])
    method is not suppose to handle it, try-finally without catch is valid here. There is
    no compilation error in the code.

    Method div() throws an instance of ArithmeticException and method div() doesn't handle
    it, so it forwards the exception to calling method main(String []).

    Method main(String []) doesn't handle ArithmeticException so it forwards it to JVM, but
    just before that, finally block is executed. This prints FINALLY on to the console.

    After that JVM prints the stack trace and terminates the program abruptly.
*/