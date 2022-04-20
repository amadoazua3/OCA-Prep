package exam5;

/*
    default methods were added in Java 8. Class Chair correctly implements Sellable
    interface and it also overrides the default symbol() method of Sellable interface.

    At Line n1, 'obj' refers to an instance of Chair class, so obj.symbol() and
    obj.getPrice() invoke the overriding methods of Chair class only.

    obj.symbol() returns "£" and obj.getPrice() returns 35.0

    At Line n2, '+' operator behaves as concatenation operator and Line n2 prints £35.0
    on to the console.
*/

public class Test13 {

    public static void main(String[] args) {
        Sellable obj = new Chair(); //Line n1
        System.out.println(obj.symbol() + obj.getPrice()); //Line n2
    }

}
