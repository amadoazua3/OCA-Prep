package exam5;


interface X1 {
    default void print() {
        System.out.println("X1");
    }
}

interface X2 extends X1 {
    void print();
}

interface X3 extends X2 {
    default void print() {
        System.out.println("X3");
    }
}

class X implements X3 {}

public class Test48 {
    public static void main(String[] args) {
        X1 obj = new X();
        obj.print();
    }
}

/*
    As per Java 8, default methods were added in the interface. Interface X1 defines default method
    print(), there is no compilation error in interface X1. Method print() is implicitly public in X1.

    interface X2 extends X1 and it overrides the default method print() of X1, overriding method in X2
    is implicitly abstract and public. An interface in java can override the default method of super
    type with abstract modifier. interface X2 compiles successfully.

    interface X3 extends X2 and it implements the abstract method print() of X2, overriding method in
    X3 is default and implicitly public. An interface in java can implement the abstract method of super
    type with default modifier. interface X3 compiles successfully.

    class X implements X3 and therefore it inherits the default method print() defined in interface X3.

    `X1 obj = new X();` compiles successfully as X1 is of super type (X implements X3, X3 extends X2 and
    X2 extends X1).

    `obj.print();` invokes the default method print() defined in interface X3 and hence X3 is printed on
    to the console.
*/