package exam5;

class Base {
    static void print() { //Line n1
        System.out.println("BASE");
    }
}

class Derived extends Base {
    static void print() { //Line n2
        System.out.println("DERIVED");
    }
}

public class Test35 {

    public static void main(String[] args) {
        Base b = null;
        Derived d = (Derived) b; //Line n3
        d.print(); //Line n4
    }

}

/*
    print() method at Line n2 hides the method at Line n1. So, no compilation error at Line n2.

    Reference variable 'b' is of type Base, so `(Derived) b` does not cause any compilation error.
    Moreover, at runtime it will not throw any ClassCastException as well because b is null. Had 'b'
    been referring to an instance of Base class [Base b = new Base();], `(Derived) b` would have thrown
    ClassCastException.

    d.print(); doesn't cause any compilation error but as this syntax creates confusion, so it is not a
    good practice to access the static variables or static methods using reference variable, instead class
    name should be used. Derived.print(); is the preferred syntax.

    d.print(); invokes the static print() method of Derived class and prints DERIVED on to the console.
*/