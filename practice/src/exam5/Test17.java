package exam5;

/*
    Basic/Regular for loop has following form:

    for ( [ForInit] ; [Expression] ; [ForUpdate] ) {...}

    [ForInit] can be local variable initialization or the following expressions:

    Assignment

    PreIncrementExpression

    PreDecrementExpression

    PostIncrementExpression

    PostDecrementExpression

    MethodInvocation

    ClassInstanceCreationExpression


    [ForUpdate] can be following expressions:

    Assignment

    PreIncrementExpression

    PreDecrementExpression

    PostIncrementExpression

    PostDecrementExpression

    MethodInvocation

    ClassInstanceCreationExpression


    The [Expression] must have type boolean or Boolean, or a compile-time error occurs.
    If [Expression] is left blank, it evaluates to true.

    All the expressions can be left blank; for(;;) is a valid for loop and it is an infinite
    loop as [Expression] is blank and evaluates to true.

    In the given code, for [ForInit] and [ForUpdate], `System.out.print(i++);` is used, which
    is a method invocation statement and hence a valid statement. Given code compiles fine.

    Let's check the iterations:

    1st iteration: [ForInit] expression is executed, 0 is printed on to the console. i = 1. i < 2
    evaluates to true, control goes inside the loop's body and execute `System.out.print(i);`
    statement. 1 is printed on to the console.

    2nd iteration: [ForUpdate] expression is executed, 1 is printed on to the console. i = 2. 2 < 2
    evaluates to false, control goes out of the for loop. main method ends and program terminates
    successfully after printing 011 on to the console.
*/

public class Test17 {

    public static void main(String[] args) {
        int i = 0;
        for(System.out.print(i++); i < 2; System.out.print(i++)) {
            System.out.print(i);
        }
    }

}
