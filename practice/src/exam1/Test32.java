package exam1;

/*
    As do-while loop executes at least once, hence none of the code is unreachable in
    this case.

    Java runtime prints 100 to the console, then it checks boolean expression, which is
    false.

    Hence control goes out of do-while block. Java runtime executes 2nd
    System.out.println statement to print "Bye" on to the console.
*/

public class Test32 {
    public static void main(String[] args) {

        do {
            System.out.println(100);
        } while (false);
        System.out.println("Bye");
    }
}
