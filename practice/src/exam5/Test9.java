package exam5;

/*
    As command-line argument is not passed, hence Line n1 throws
    ArrayIndexOutOfBoundsException (subclass of RuntimeException),
    handler is available in inner catch block, it executes Line n1
    and prints INHALE- on to the console.

    throw e; re-throws the exception.

    But before exception instance is forwarded to outer catch-block,
    inner finally-block gets executed and prints EXHALE- on to the console.

    In outer try-catch block, handler for RuntimeException is available,
    so outer catch-block gets executed and prints INHALE- on to the console.

    After that outer finally-block gets executed and prints EXHALE- on
    to the console.

    Hence, the output is: INHALE-EXHALE-INHALE-EXHALE
*/

public class Test9 {

    public static void main(String[] args) {
        try {
            try {
                System.out.println(args[1]); //Line n1
            } catch(RuntimeException e) {
                System.out.print("INHALE-"); //Line n2
                throw e; //Line n3
            } finally {
                System.out.print("EXHALE-"); //Line n4
            }
        } catch(RuntimeException e) {
            System.out.print("INHALE-"); //Line n5
        } finally {
            System.out.print("EXHALE"); //Line n6
        }
    }

}
