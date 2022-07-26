package chapter2;

public class LogicalComplementAndNegationOperators {

    public static void main(String[] args) {

        boolean x = false;
        System.out.println(x);      // false

        x = !x;
        System.out.println(x);      // true

        double y = 1.21;
        System.out.println(y);      // 1.21

        y = -y;
        System.out.println(y);      // -1.21

        y = -y;
        System.out.println(y);      // 1.21

        int a = !5;                 // DOES NOT COMPILE
        boolean b = -true;          // DOES NOT COMPILE
        boolean c = !0;             // DOES NOT COMPILE

    /*
        The first statement will not compile due the fact that in Java you cannot perform a logical inversion of a
        numeric value. The second statement does not compile because you cannot numerically negate a boolean value; you
        need to use the logical inverse operator. Finally, the last statement does not compile because you cannot take
        the logical complement of a numeric value, nor can you assign an integer to a boolean variable.

    */

    }

}
