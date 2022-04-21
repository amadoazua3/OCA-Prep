package exam5;

/*
    Variable x is of X type (superclass) and refers to an instance of Z type (subclass).

    At Line n1, compiler checks whether greet() method is available in class X or not. As
    greet() method is available in class X, hence no compilation error for Line n1.

    At Line n2, x is casted to Y and compiler checks whether greet() method is available in
    class Y or not. As greet() method is available in class Y, hence no compilation error for Line n2.

    At Line n3, x is casted to Z and compiler checks whether greet() method is available in
    class Z or not. As greet() method is available in class Z, hence no compilation error for Line n3.

    There is no compilation error in the given code it compiles successfully.

    Variable x refers to an instance of Z class and at Line n1, n2 and n3 same instance is being used.
    Which overriding method to invoke, is decided at runtime based on the instance.

    At runtime, all three statements, at Line n1, Line n2 and Line n3 would invoke the greet() method of
    Z class, which would print Good Night! three times on to the console.
*/
//
//class X {
//    void greet() {
//        System.out.println("Good Morning!");
//    }
//}
//
//class Y extends X {
//    void greet() {
//        System.out.println("Good Afternoon!");
//    }
//}
//
//class Z extends Y {
//    void greet() {
//        System.out.println("Good Night!");
//    }
//}
//
//public class Test20 {
//
//    public static void main(String[] args) {
//        X x = new Z();
//        x.greet(); //Line n1
//        ((Y)x).greet(); //Line n2
//        ((Z)x).greet(); //Line n3
//    }
//
//}
