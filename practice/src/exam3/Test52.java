package exam3;

/*
    Initially i = 5. if(i++ < 6) means if(5 < 6) and then i = 6.

    5 < 6 is true, control goes inside if-block and executes
    System.out.println(i++); This prints current value of i to
    the console, which is 6 and after that increments the value
    of i by 1, so i becomes 7.
*/

public class Test52 {

    public static void main(String[] args) {
        int i = 5;
        if(i++ < 6) {
            System.out.println(i++);
        }
    }

}
