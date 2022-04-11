package exam3;

import java.util.ArrayList;
import java.util.List;

/*
    list.add(true); => Auto-boxing converts boolean literal true to Boolean instance
    containing true. Element at index 0 represents true.

    Boolean class code uses equalsIgnoreCase method to validate the passed String, so
    if passed String is "true" ('t', 'r', 'u' and 'e' can be in any case), then boolean value
    stored in Boolean object is true otherwise false.

    list.add(new Boolean("tRue")); => Element at index 1 represents true.

    list.add(new Boolean("abc")); => Element at index 2 represents false.

    So initially list contains [true, true, false].

    As generic list is used, so list.remove(1) removes the Boolean instance (true) stored at
    index 1 and returns it. So after this operation list contains [true, false].

    For the boolean expression of if-block, Java runtime extracts the stored boolean
    value using booleanValue() method, which returns true. Control goes inside if-block
    and executes list.remove(1);  This removes element at index 1 so after this operation
    list contains [true] and [true] is printed on to the console.
*/

public class Test55 {

    public static void main(String[] args) {
        List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(new Boolean("tRue"));
        list.add(new Boolean("abc"));

        if(list.remove(1)) {
            list.remove(1);
        }

        System.out.println(list);
    }

}
