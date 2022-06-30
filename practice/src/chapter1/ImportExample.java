package chapter1;

//public class ImportExample {
//
//    public static void main(String[] args) {
//
//        Random r = new Random();        // DOES NOT COMPILE
//        System.out.println(r.nextInt(10));
//
//    }
//
//}

/*
    Understanding Package Declarations and Imports:

    The java compiler helpfully gives you an error that looks like this:

    Random cannont be resolved to a type

    The cause of the error is omitting a needed import statement. Import
    statements tell Java which packages to look in for classes. Since you
    didn't tell Java where to look for Random, it has no clue.
*/


//     Trying this again with the import allows you to compile:

import java.util.Random;    // import tell us where to find Random

public class ImportExample {

    public static void main(String[] args) {

        Random r = new Random();
        System.out.println(r.nextInt(10));      // print a number between 0 and 9

    }

}

