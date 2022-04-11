package exam3;

/*
    Greetings g1 = new Greetings(); invokes no-arg constructor.

    No-arg constructor calls parameterized constructor with the argument
    "Good Morning!"

    Parameterized constructor assigns "Good Morning!" to msg variable of the object
    referred by g1.

    Greetings g2 = new Greetings("Good Evening!"); invokes parameterized constructor,
    which assigns "Good Evening!" to msg variable of the object referred by g2.

    g1.display(); prints Good Morning!

    g2.display(); prints Good Evening!
*/

public class Greetings {

        String msg = null;

        public Greetings() {
            this("Good Morning!");
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
            g2.display();
        }
}
