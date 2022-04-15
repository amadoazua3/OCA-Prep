package exam4;

/*
    Greetings g1 = new Greetings(); invokes no-arg constructor. Property msg
    (of object referred by g1) is assigned to null.

    Greetings g2 = new Greetings("Good Evening!"); invokes parameterized
    constructor, which assigns "Good Evening!" to msg of object referred by g2.

    g1.display(); prints null

    Again we have same call g1.display(); which prints null.

    NOTE: We haven't called display() on object referred by g2.
*/

public class Greetings {

    String msg = null;
    public Greetings() {
    }

    public Greetings(String str) {
        msg = str;
    }

    public void display() {
        System.out.println(msg);
    }

    public static void main(String [] args) {
        Greetings g1 = new Greetings();
        Greetings g2 = new Greetings("Good Evening!");
        g1.display();
        g1.display();
    }
}
