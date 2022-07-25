package chapter1;

import java.util.ArrayList;
import java.util.List;

public class Finalizer2 {

    protected static List objects = new ArrayList();

    protected void finalize() {
        objects.add(this);      // DON'T DO THIS
    }

}

/*
    Remember, finalize() is only run when the object is eligible
    for garbage collection. The problem here is that by the end of
    the method, the object is no longer eligible for garbage collection
    because a static variable is referring to it and static variables
    stay in scope until the program ends. Java is smart enough to realize
    this and aborts the attempt to throw out the object. Now suppose later
    in the program objects is set to null. Oh, good, we can finally remove
    the object from memory. Java remembers already running finalize() on
    this object and will not do so again. The lesson is that the finalize()
    call could run zero or one time.
*/