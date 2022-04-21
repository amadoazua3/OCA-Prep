package exam5;

class Car {
    void speed(Byte val) { //Line n1
        System.out.println("DARK"); //Line n2
    } //Line n3

    void speed(byte... vals) {
        System.out.println("LIGHT");
    }
}

public class Test55 {

    public static void main(String[] args) {
        byte b = 10; //Line n4
        new Car().speed(b); //Line n5
    }
}

/*
    Which of the following needs to be done so that LIGHT is printed to the console?

    - Replace Line n4 with byte... b = 10;
    - Delete Line n1, Line n2 and Line n3 (Correct)
    - No changes are required as given code prints LIGHT on execution
    - Replace Line n5 with new Car().speed((byte...)b);

*/


/*
    speed method is correctly overloaded in Car class as both the methods have different signature:
    speed(Byte) and speed(byte...). Please note that there is no rule regarding return type for
    overloaded methods, return type can be same or different.

    `new Car().speed(b);` tags to speed(Byte) as boxing is preferred over variable arguments. Code as
    is prints DARK on to the console.

    Variable arguments syntax '...' can be used only for method parameters and not for variable type
    and type-casting. Hence the option of replacing Line n4 and Line n5 are not correct.

    If you delete speed(Byte) method, i.e. Line n1, Line n2 and Line n3, then `new Car().speed(b);`
    would tag to speed(byte...) method and on execution would print LIGHT on to the console.
*/