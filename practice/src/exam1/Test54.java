package exam1;

/*
    Class Guest has special main method but main method defined in Message class
    is not public and hence it can't be called by JVM. But there is no issue with the syntax
    hence no compilation error.

    java Guest Clare Waight Keller passes new String [] {"Clare", "Waight", "Keller"} to
    args of Guest.main method.

    Guest.main method invokes Message.main method with the same argument: new
    String [] {"Clare", "Waight", "Keller"}. args[2] is "Keller" hence "Welcome Keller!" gets
    printed on to the console.
*/

//class Message {
//    static void main(String [] args) {
//        System.out.println("Welcome" + args[2] + "!");
//    }
//}
//
//public class Test54 {
//
//    public static void main(String[] args) {
//        Message.main(args);
//    }
//
//}
