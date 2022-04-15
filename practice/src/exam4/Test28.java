package exam4;


import java.io.IOException;

/*
    This question is tricky as 2 changes are related and not independent. Let's first check
    the reason for compilation error. Line 5 throws a checked exception, IOException but it
    is not declared in the throws clause. So, print method should have throws clause for
    IOException or the classes in top hierarchy such as Exception or Throwable.

    Based on this deduction, Line 4 can be replaced with either "static void print() throws
    Exception {" or "static void print() throws Throwable" but we will have to select one out
    of these as after replacing Line 4, Line 11 will start giving error as we are not handling
    the checked exception at Line 11.

    This part is easy, do we have other options, which mention "Throwable"? NO. Then mark the
    first option as "Replace Line 4 with static void print() throws Exception {".

    As, print() method throws Exception, so main method should handle Exception or its super
    type and not it's subtype. Two options working only with IOException can be ruled out.

    Multi-catch statement "catch(IOException | Exception e)" gives compilation error as
    IOException and Exception are related to each other in multilevel inheritance. So you are
    left with only one option to pair with our 1st choice:

    Surround Line 11 with below try-catch block:

    try {
        ReadTheFile.print();
    } catch(Exception e) {
        e.printStackTrace();
    }
*/


// Original code block
//class ReadTheFile {
//    static void print() { //Line 4
//        throw new IOException(); //Line 5
//    }
//}

// Code block that compiles code successfully

class ReadTheFile {
    static void print() throws Exception { //Line 4
        throw new IOException(); //Line 5
    }
}


public class Test28 {

    // Original code block
//    public static void main(String[] args) { //Line 10
//        ReadTheFile.print(); //Line 11
//        //Line 12
//    }

    // Code block that compiles code successfully
    public static void main(String[] args) { //Line 10
        try {
            ReadTheFile.print(); //Line 11
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
