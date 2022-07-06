package chapter1;

public class ReferenceTypes2 {

    public static void main(String[] args) {

        // 1

        int value = null;       // DOES NOT COMPILE

        String s = null;        // COMPILES

        // 2

        String reference = "hello";

        int len = reference.length();

        int bad = len.length();     // DOES NOT COMPILE

    }

}


/*
    Key Differences:

    There are a few important differences you should know between primitives
    and reference types:

    1. Reference types can be assigned null, which means they do not
    currently refer to an object. Primitive types will give you a comilation
    error if you attempt to assign them null.

    2. Reference types can be used to call methods when they do not point to
    null. Primitives do not have methods declared on them. In this example,
    we can call a method on reference since it is of a reference type.
    You can tell length is a method because it has () after it. Primitives
    do NOT have methods.

    3. Finally, notice that all the primitive types have lowercase type names.
    All classes that come with java begin with uppercase. You should follow this
    convention for classes you create as well.

*/