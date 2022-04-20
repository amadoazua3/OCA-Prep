package exam5;

import java.util.List;

/*
    And the definitions of get() method:

    1. List<Father> get() {return null;}

    2. ArrayList<Father> get() {return null;}

    3. List<Son> get() {return null;}

    4. ArrayList<Son> get() {return null;}

    5. List<GrandSon> get() {return null;}

    6. ArrayList<GrandSon> get() {return null;}

    7. List<Object> get() {return null;}

    8. ArrayList<Object> get() {return null;}

    How many definitions of get() method can replace / *INSERT* /
    such that there is no compilation error?
*/

class Father {}

class Son extends Father {}

class GrandSon extends Son {}

abstract class Super {
    abstract List<Father> get();
}

class Sub extends Super {

    /*INSERT*/

    List<Father> get() {return null;} // NO compilation error

//    ArrayList<Father> get() {return null;}    // NO compilation error

//    List<Son> get() {return null;}    // compilation error

//    ArrayList<Son> get() {return null;}   // compilation error

//    List<GrandSon> get() {return null;}   // compilation error

//    ArrayList<GrandSon> get() {return null;}  // compilation error

//    List<Object> get() {return null;} // compilation error

//    ArrayList<Object> get() {return null;}    // compilation error

}

/*
    There are 2 rules related to return types of overriding method:

    1. If return type of overridden method is of primitive type, then
    overriding method should use same primitive type.

    2. If return type of overridden method is of reference type, then
    overriding method can use same reference type or its sub-type
    (also known as covariant return type).

    ArrayList is a subtype of List, hence overriding method can use
    List<Father> or ArrayList<Father> as return type. Definitions 1 and 2
    are valid.

    Please note: even though Son is a subtype of Father, List<Son> is not
    subtype of List<Father>. Hence definitions 3 and 4 are NOT valid.

    On similar lines, even though GrandSon is a subtype of Father, List<GrandSon>
    is not subtype of List<Father>. Hence definitions 5 and 6 are also NOT valid.

    List<Object> is not subtype of List<Father>, definition 7 is NOT valid.

    ArrayList<Object> is not subtype of List<Father>, definition 8 is also NOT valid.
*/