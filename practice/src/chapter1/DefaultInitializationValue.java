package chapter1;

public class DefaultInitializationValue {

    public static void main(String[] args) {

        boolean dv;     // default value is false;

        byte dv2;       // default value is 0
        short dv3;      // default value is 0
        int dv4;        // default value is 0
        long dv5;       // default value is 0

        float dv6;      // default value is 0.0
        double dv7;     // default value is 0.0

        char dv8;       // default value is '\u0000' (NUL)

        // All object references (everything else) has null
        // as a default value
    }

}

/*
    Instance and class variables do not require you to initialize them. As soon
    as you declare these variables, they are given a default value. To make
    this easier, remember that the compiler doesn’t know what value to use and so
    wants the simplest type it can give the value: null for an object and 0/false
    for a primitive.
*/