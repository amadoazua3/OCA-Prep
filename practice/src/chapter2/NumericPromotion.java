package chapter2;

public class NumericPromotion {

    public static void main(String[] args) {

        // What is the data type of x * y?

        int x = 1;
        long y = 33;

        System.out.println(x * y);

        /*
            If we follow the first rule, since one of the values is long and the other is int, and long is larger than
            int, then the int value is promoted to a long, and the resulting value is long.
        */


        // What is the data type of a + b?

        double a = 39.21;
        float b = 2.1;      // DOES NOT COMPILE

        System.out.println(a + b);

        /*
            This is actually a trick question, as this code will not compile! floating-point literals are assumed to be
            double, unless postfixed with an f, as in 2.1f. If the value was set properly to 2.1f, then the promotion
            would be similar to the last example, with both operands being promoted to a double, and the result would
            be a double value.
        */

        // What is the data type of c / d?

        short c = 10;
        short d = 3;

        System.out.println(c / d);

        /*
            In this case, we must apply the third rule, namely that x and y will both be promoted to int before the
            operation, resulting in an output of type int. Pay close attention to the fact that the resulting output is
            not a short, as we’ll come back to this example in the upcoming section on assignment operators.
        */

        // What is the data type of e * f / g?

        short e = 14;
        float f = 13;
        double g = 30;

        System.out.println(e * f / g);

        /*
            In this case, we must apply all of the rules. First, x will automatically be promoted to int solely because
            it is a short and it is being used in an arithmetic binary operation. The promoted x value will then be
            automatically promoted to a float so that it can be multiplied with y. The result of x * y will then be
            automatically promoted to a double, so that it can be multiplied with z, resulting in a double value.
        */

    }
}


/*
    Numeric Promotion Rules

    1. If two values have different data types, Java will automatically promote one of the values to the larger of
    the two data types.

    2. If one of the values is integral and the other is floating-point, Java will automatically promote the integral
    value to the floating-point value’s data type.

    3. Smaller data types, namely byte, short, and char, are first promoted to int any time they’re used with a Java
    binary arithmetic operator, even if neither of the operands is int.

    4. After all promotion has occurred and the operands have the same data type, the resulting value will have the
    same data type as its promoted operands.
*/