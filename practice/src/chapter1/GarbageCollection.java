package chapter1;

public class GarbageCollection {

    public static void main(String[] args) {

        System.gc();    // Not guaranteed to run...

        /* Look at this code and see if you can figure out when
        each object first becomes eligible for garbage collection. */

        String one, two;
        one = new String("a");
        two = new String("b");
        one = two;
        String three = one;
        one = null;


    }
}


/*
    Garbage collection refers to the process of automatically
    freeing memory on the heap by deleting objects that are no
    longer reachable in your program. You do need to know that
    System.gc() is not guaranteed to run, and you should be able
    to recognize when objects become eligible for garbage collection.

    An object is no longer reachable when one of two situations occurs:
    ■ The object no longer has any references pointing to it.
    ■ All references to the object have gone out of scope.

*/