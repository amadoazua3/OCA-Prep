package exam2;

/*
    add(10.0, null); => Compiler can't convert null to double primitive type, so 2nd
    argument is tagged to Double reference type.

    So to match the method call, 10.0 is converted to Double object by auto-boxing and
    add(10.0, null); is tagged to add(Double, Double); method.

    But at the time of execution, d2 is null so System.out.println("Double version: " + (d1
    + d2)); throws NullPointerException.
*/

public class Test26 {

    private static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));
    }

    private static void add(Double d1, Double d2) {
        System.out.println("Double version: " + (d1 + d2));
    }

    public static void main(String[] args) {
        add(10.0, null);
    }
}
