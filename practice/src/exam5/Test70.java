package exam5;

class A {
    public String toString() {
        return null;
    }
}

public class Test70 {

    public static void main(String [] args) {
        String text = null;
        text = text + new A(); //Line n1
        System.out.println(text.length()); //Line n2
    }

}

/*
    You need to keep in mind an important point related to String Concatenation:

    If only one operand expression is of type String, then string conversion is
    performed on the other operand to produce a string at run time.

    If one of the operand is null, it is converted to the string "null".

    If operand is not null, then the conversion is performed as if by an invocation
    of the toString method of the referenced object with no arguments; but if the
    result of invoking the toString method is null, then the string "null" is used instead.

    Let's check the expression of Line n1:

    text = text + new A(); --> As text is of String type, hence + operator behaves as
    concatenation operator.

    As text is null, so "null" is used in the Expression.

    new A() represents the object of A class, so toString() method of A class is invoked, but
    as toString() method of A class returns null, hence "null" is used in the given expression.

    So, given expression is written as:

    text = "null" + "null";

    text = "nullnull";


    Hence, Line n2 prints 8 on to the console.
*/