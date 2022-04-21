package exam5;

public class main {

    static String main = "ONE";

    public main() {
        System.out.println("TWO");
    }

    public static void main(String [] args) {
        main();
    }

    public static void main() {
        System.out.println(main);
    }

}

/*
    Though given code looks strange but it is possible in java to provide same name to package,
    class (and constructor), variable and method.

    Above code compiles successfully and on execution prints ONE on to the console. Constructor
    is not invoked as 'new' keyword is not used and that is why TWO will not be printed to the console.

    In real world coding, you would not see such code and that is why it is a good question for
    the certification exam.
*/