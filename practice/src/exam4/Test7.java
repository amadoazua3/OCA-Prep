package exam4;

/*
    add(10.0, new Double(10.0)); is an ambiguous call as compiler
    can't decide whether to convert 1st argument to Double reference
    type or 2nd argument to double primitive type.

    So, add(10.0, new Double(10.0)); causes compilation error.
*/

public class Test7 {

    private static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));
    }

    private static void add(Double d1, Double d2) {
        System.out.println("Double version: " + (d1 + d2));
    }

    public static void main(String[] args) {
//        add(10.0, new Double(10.0));                   // Caused compilation error. Ambiguous call
        add(10.0, 10.0);                                // No compilation error
        add(new Double(10.0), new Double(10.0));    // no compilation error
    }
}
