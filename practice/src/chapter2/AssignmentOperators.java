package chapter2;

public class AssignmentOperators {

    public static void main(String[] args) {

        int x = 1.0;                    // DOES NOT COMPILE
        short y = 1921222;              // DOES NOT COMPILE
        int z = 9f;                     // DOES NOT COMPILE
        long t = 192301398193810323;    // DOES NOT COMPILE

    }
}

/*
    An assignment operator is a binary operator that modifies, or assigns, the variable on the left-hand side of the
    operator, with the result of the value on the right-hand side of the equation. The simplest assignment operator
    is the = assignment.

    Java will automatically promote from smaller to larger data types, but it will throw a compiler exception if it
    detects you are trying to convert from larger to smaller data types.

    The first statement does not compile because you are trying to assign a double 1.0 to an integer value. Even though
    the value is a mathematic integer, by adding .0, you’re instructing the compiler to treat it as a double. The
    second statement does not compile because the literal value 1921222 is outside the range of short and the compiler
    detects this. The third statement does not compile because of the f added to the end of the number that instructs
    the compiler to treat the number as floating-point value. Finally, the last statement does not compile because Java
    interprets the literal as an int and notices that the value is larger than int allows. The literal would need a
    postfix L to be considered a long.
*/