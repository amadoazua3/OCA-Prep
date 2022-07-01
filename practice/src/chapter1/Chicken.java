package chapter1;

/*
    The purpose of a constructor is to INITIALIZE FIELDS, although you can put
    any code in there. Another way to initialize fields is to do so directly
    on the line on which they're declared. This example shows both approaches:
*/

public class Chicken {

    int numEggs = 0;    // initialize on line
    String name;

    public Chicken() {

        name = "Duke";  // initialize in constructor

    }

}


/*
    For most classes, you don't have to code a constructor-the compiler
    will supply a "do nothing" default constructor for you.
*/