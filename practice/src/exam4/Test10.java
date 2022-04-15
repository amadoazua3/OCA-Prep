package exam4;

/*
    Please note that Strings computed by concatenation at compile time,
    will be referred by String Pool during execution. Compile time String
    concatenation happens when both of the operands are compile time constants,
    such as literal, final variable etc.

    Whereas, Strings computed by concatenation at run time (if the resultant
    expression is not constant expression) are newly created and therefore distinct.

    `java += world;` is same as `java = java + world;` and `java + world` is not
    a constant expression and hence is calculated at runtime and returns a non pool
    String object "JavaWorld", which is referred by variable 'java'.

    On the other hand, variable 'javaworld' refers to String Pool object "JavaWorld".
    As both the variables 'java' and 'javaworld' refer to different String objects,
    hence `java == javaworld` returns false.
*/

public class Test10 {

    public static void main(String[] args) {
        String javaworld = "JavaWorld";
        String java = "Java";
        String world = "World";
        java += world;
        System.out.println(java == javaworld);
    }

}
