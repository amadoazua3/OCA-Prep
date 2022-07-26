package chapter2;

public class IncrementAndDecrementOperators {

    public static void main(String[] args) {

        int counter = 0;

        System.out.println(counter);        // Outputs 0
        System.out.println(++counter);      // Outputs 1
        System.out.println(counter);        // Outputs 1
        System.out.println(counter--);      // Outputs 1
        System.out.println(counter);        // Outputs 0



        int x = 3;
        int y = ++x * 5 / x-- + --x;

        // int y = 4 * 5 / x-- + --x;       // x assigned value of 4
        // int y = 4 * 5 / 4 + --x;         // x assigned value of 3
        // int y = 4 * 5 / 4 + 2;           // x assigned value of 2

        System.out.println("x is " + x);    // x is 2
        System.out.println("y is " + y);    // y is 7


    }
}
