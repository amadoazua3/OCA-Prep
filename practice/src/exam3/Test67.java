package exam3;

/*
final boolean flag = false; statement makes flag a compile time constant.

Compiler knows the value of flag, which is false at compile time and hence
it gives "Unreachable Code" error.
*/

public class Test67 {

    public static void main(String[] args) {
        final boolean flag = false;
//        while(flag) {
//            System.out.println("Good Morning!");
//        }
    }

}
