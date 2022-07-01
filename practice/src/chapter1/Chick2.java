package chapter1;

public class Chick2 {

    private String name = "Fluffy";

    { System.out.println("setting field"); }

    public Chick2() {
        name = "Tiny";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {
        Chick2 chick2 = new Chick2();
        System.out.println(chick2.name);
    }

}

/*
    Order of Initialization I

    When writing code that initializes fields in multiple places, you
    have to keep track of the order of initialization. You will need to
    remember the following:

    ■ Fields and instance initializer blocks are rune in the order in
    which they appear in the file.

    ■ The constructor runs after all fields and instance initializer
    blocks have run.

    Running the code above prints this:

        setting field
        setting constructor
        tiny

    Let's look at what's happening here.

    We start with the main() method because that's where java
    starts execution. On line 15, we call the constructor of Chick2.
    Java creates a new object. First it initializes name to "Fluffy"
    on line 5. Next it executes the print statement in the instance
    initializer on line 7. Once all the fields and instance initializers
    have run, Java returns to the constructor. Line 10 changes the value
    of name to "Tiny" and line 11 prints another statement. At this point,
    the constructor is done executing and goes back to the print statement
    on line 16.

    Order matters for the fields and blocks of code. You can’t refer to a
    variable before it has been initialized:

        { System.out.println(name); } // DOES NOT COMPILE
        private String name = "Fluffy";

*/

