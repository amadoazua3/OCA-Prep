package exam4;

/*
    To invoke the special main method, JVM loads the class in the memory. At that time,
    static fields of Test class are initialized. d1 is of Double type so null is assigned to it.

    x is not static variable, so int x = d1.intValue(); is not executed. Class is loaded
    successfully in the memory and "HELLO" is printed on to the console.

    NOTE: new Test() will throw NullPointerException but not ExceptionInInitializerError.
*/

public class Test24 {

    static Double d1;
    int x = d1.intValue();

    public static void main(String[] args) {
        System.out.println("HELLO");
    }
}
