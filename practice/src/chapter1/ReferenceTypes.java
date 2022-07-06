package chapter1;

public class ReferenceTypes {

    public static void main(String[] args) {

        java.util.Date today;

        String greeting;

        today = new java.util.Date();

        greeting = "How are you?";

    }

}


/*
    Reference Types:

    A reference type refers to an object (an instance of a class).
    Unlike primitive types that hold their values in memory where
    the variable is allocated, references do not hold the value of
    the object they refer to. Instead, a reference "points" to an
    object by storing the memory address where the object is located,
    a concept referred to as a pointer. Unlike other languages, Java
    does not allow you to learn what the physical memory address is.
    You can only use the reference to refer to the object.

    The today variable is reference of type Date and can only point
    to a Date object. The greeting variable is a reference that can
    only point to a String object. A value is assigned to a reference
    in one of two ways:

    ■ A reference can be assigned to another object of the same type.

    ■ A reference can be assigned to a new object using the new keyword.

*/