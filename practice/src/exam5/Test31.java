package exam5;

public class Test31 {

    int x = 5____0;

//    int y = ____50;       // compilation error

//    int z = 50____;       // compilation error

    float f = 123.76_86f;

    double d = 1_2_3_4;

}

/*
    For readability purpose underscore (_) is used to separate numeric values. This is very
    useful in representing big numbers such as credit card numbers (1234_7654_9876_0987).
    Multiple underscores are also allowed within the digits. Hence, `int x = 5____0;` compiles
    successfully and variable x stores 50.

    `float f = 123.76_86f;` compiles successfully.

    1_2_3_4 is int literal 1234 and int can easily be assigned to double, hence
    `double d = 1_2_3_4;` compiles successfully.

    ____50 is a valid variable name, and as this variable is not available hence, int
    y = ____50; causes compilation error.

    Underscores must be available within the digits. For the statement int z = 50____; as underscores
    are used after the digits, hence it causes compilation error.
*/
