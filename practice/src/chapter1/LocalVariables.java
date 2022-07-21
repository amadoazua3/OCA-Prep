package chapter1;

public class LocalVariables {

    public static void main(String[] args) {

        LocalVariables lv = new LocalVariables();

        lv.notValid();
        lv.valid();
        lv.findAnswer(true);

    }

    public int notValid() {

        int y = 10;
        int x;
        int reply = x + y;      // DOES NOT COMPILE
        return reply;

    }

    /*
    y is initialized to 10. However, because x is not initialized before it is
    used in the expression on line 7, the compiler generates the following error:

    Test.java:5: variable x might not have been initialized

    Until x is assigned a value, it cannot appear within an expression, and the
    compiler will gladly remind you of this rule. The compiler knows your code has
    control of what happens inside the method and can be expected to initialize values.
    */

    public int valid() {

        int y = 10;
        int x;      // x is declared here
        x = 3;      // and initialized here
        int reply = x + y;
        return reply;

    }

    public void findAnswer(boolean check) {

        int answer;
        int onlyOneBranch;

        if(check) {
           onlyOneBranch = 1;
           answer = 1;
        } else {
            answer = 2;
        }

        System.out.println(answer);
        System.out.println(onlyOneBranch);      // DOES NOT COMPILE

    }

    /*
    In this example, there are two branches of code. answer is initialized in
    both of them so the compiler is perfectly happy. onlyOneBranch is only
    initialized if check happens to be true. The compiler knows there is the
    possibility for check to be false, resulting in uninitialized code, and
    gives a compiler error.
    */

}


