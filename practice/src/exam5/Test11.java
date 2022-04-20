package exam5;

/*
    Super class defines a method with name Super() but not any constructor. Hence
    compiler adds below default constructor in Super class:

    Super() {

        super();

    }

    Class Super extends from Object class and Object class has no-argument constructor,
    which is called by the super(); statement in above default constructor.

    Java compiler also adds `super();` as the first statement inside the no-argument constructor
    of Base class:

    Base() {

        super();

        Super();

        System.out.print("GOING_");

    }

    As Base extends Super and both the classes are in the same package, hence `super();` invokes
    the no-argument constructor of Super class and `Super();` invokes the Super() method of Super
    class. Base class inherits the Super() method of Super class.

    No compilation error in any of the classes.

    On executing Test class, main(String[]) is invoked, which executes `new Base();` statement.

    No-argument constructor of Base class is invoked, which executes `super();`, hence no-argument
    constructor of Super class is invoked.

    Next, `Super();` is executed and this invokes the Super() method of Super class and hence KEEP_ is
    printed on to the console.

    After that, `System.out.print("GOING_");` is executed and GOING_ is printed on to the console.

    main(String []) method finishes its execution and program terminates successfully after printing
    KEEP_GOING_ on to the console.
*/

class Super {
    void Super() {
        System.out.print("KEEP_");
    }
}

class Base extends Super {
    Base() {
        Super();
        System.out.print("GOING_");
    }
}

public class Test11 {

    public static void main(String[] args) {
        new Base();
    }
}
