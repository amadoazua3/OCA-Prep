package exam4;

import java.util.ArrayList;
import java.util.List;

/*
    remove(Object) method of List interface removes the first occurrence of the specified
    element from the list, if it is present. If this list does not contain the element, it
    is unchanged. remove(Object) method returns true, if removal was successful otherwise false.

    Initially list has: [apple, orange, grape, mango, banana, grape]. fruits.remove("grape")
    removes the first occurrence of "grape" and after the successful remove, list has:
    [apple, orange, mango, banana, grape]. fruits.remove("grape") returns true, control goes
    inside if block and executes fruits.remove("apple");

    fruits list contains "apple", so after the removal list has: [orange, mango, banana, grape].
*/

public class Test19 {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("grape");

        if(fruits.remove("grape"))
            fruits.remove("apple");

        System.out.println(fruits);
    }
}
