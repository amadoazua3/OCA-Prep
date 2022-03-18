package exam1;

/*
    The result for the following code is -100. There are 2 operators involved in this. Unary minus
        and Postfix operator. The value of a is changed to 101 after the sout on line 12, and because
        there is a unary minus we have the -100 print out on the console.
*/

public class Test2 {
    public static void main(String[] args) {
        int a = 100;
        System.out.println(-a++);
    }
}
