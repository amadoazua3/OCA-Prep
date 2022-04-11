package exam3;

/*
    To invoke the special main method, JVM loads the class in the memory. At that time,
    static fields of Test class are initialized. d1 is of Double type so null is assigned to it.

    x is also static variable so d1.intValue(); is executed and as d1 is null hence
    d1.intValue() throws a NullPointerException and as a result an instance of
    java.lang.ExceptionInInitializerError is thrown.
*/

public class Test59 {

    static Double d1;
    static int x = d1.intValue();

    public static void main(String[] args) {
        System.out.println("HELLO");
    }

}
