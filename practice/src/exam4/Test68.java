package exam4;

import java.util.ArrayList;
import java.util.List;

/*
    ConcurrentModificationException exception may be thrown for following condition:

    1. Collection is being iterated using Iterator/ListIterator or by using for-each loop.

    And

    2. Execution of Iterator.next(), Iterator.remove(), ListIterator.previous(),
    ListIterator.set(E) & ListIterator.add(E) methods. These methods may throw
    java.util.ConcurrentModificationException in case Collection had been modified by means
    other than the iterator itself, such as Collection.add(E) or Collection.remove(Object)
    or List.remove(int) etc.

    PLEASE NOTE: for-each loop internally implements Iterator and invokes hasNext()
    and next() methods.

    For the given code, 'dryFruits' list is being iterated using for-each loop
    (internally as an Iterator).

    hasNext() method of Iterator has following implementation:

    public boolean hasNext() {
        return cursor != size;
    }

    Where cursor is the index of next element to return and initially it is 0.

    1st Iteration: cursor = 0, size = 4, hasNext() returns true. iterator.next() increments
    the cursor by 1 and returns "Walnut".

    2nd Iteration: cursor = 1, size = 4, hasNext() returns true. iterator.next() increments
    the cursor by 1 and returns "Apricot". As "Apricot" starts with "A", hence
    dryFruits.remove(dryFruit) removes "Apricot" from the list and hence reducing the list's
    size by 1, size becomes 3.

    3rd Iteration: cursor = 2, size = 3, hasNext() returns true. iterator.next() method throws
    java.util.ConcurrentModificationException.

    If you want to successfully remove the items from ArrayList, while using Iterator or
    ListIterator, then use Iterator.remove() or ListIterator.remove() method and NOT
    List.remove(...) method. Using List.remove(...) method while iterating the list
    (using the Iterator/ListIterator or for-each) may
    throw java.util.ConcurrentModificationException.
*/


public class Test68 {

    public static void main(String[] args) {
        List<String> dryFruits = new ArrayList<>();
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");

        for(String dryFruit : dryFruits) {
            if(dryFruit.startsWith("A")) {
                dryFruits.remove(dryFruit);
            }
        }

        System.out.println(dryFruits);
    }

}
