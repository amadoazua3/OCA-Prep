package chapter1;

public class Mouse {
    static int MAX_LENGTH = 5;
    int length;

    public void grow(int inches) {
        if (length < MAX_LENGTH) {
            int newSize = length + inches;
            length = newSize;
        }
    }
}

/*
    Luckily the rule for instance variables is easier: they are available
    as soon as they are defined and last for the entire lifetime of the object
    itself. The rule for class (static) variables is even easier: they go into
    scope when declared like the other variables types. However, they stay in
    scope for the entire life of the program.

    In this class, we have one class variable (MAX_LENGTH), one instance variable (length),
    and two local variables (inches and newSize.) MAX_LENGTH is a class variable because it
    has the static keyword in its declaration. MAX_LENGTH goes into scope on line 4 where it
    is declared. It stays in scope until the program ends. length goes into scope on line 5
    where it is declared. It stays in scope as long as this Mouse object exists. inches goes
    into scope where it is declared on line 7. It goes out of scope at the end of the method
    on line 12. newSize goes into scope where it is declared on line 9. Since it is defined
    inside the if statement block, it goes out of scope when that block ends on line 11.

    Got all that? Let’s review the rules on scope:
    ■ Local variables—in scope from declaration to end of block
    ■ Instance variables—in scope from declaration until object garbage collected
    ■ Class variables—in scope from declaration until program ends
*/