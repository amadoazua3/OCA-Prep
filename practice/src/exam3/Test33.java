package exam3;

/*
    Variable msg is referring to String object "Hello".

    There is only one element in boolean array object and it is initialized to default value
    of boolean, which is false.

    flag[0] is false, if-check fails and control doesn't enter if block.

    System.out.println(msg) prints original value of msg, which is "Hello".
*/

public class Test33 {

    public static void main(String[] args) {
        String msg = "Hello";
        boolean [] flag = new boolean[1];
        if(flag[0]) {
            msg = "Welcome";
        }
        System.out.println(msg);
    }

}
