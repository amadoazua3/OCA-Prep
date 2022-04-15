package exam4;

import java.util.ArrayList;
import java.util.List;

/*
    list.add(0, 'V'); => char 'V' is converted to Character object and stored as the first
    element in the list. list --> [V].

    list.add('T'); => char 'T' is auto-boxed to Character object and stored at the end of
    the list. list --> [V,T].

    list.add(1, 'E'); => char 'E' is auto-boxed to Character object and inserted at index 1
    of the list, this shifts T to the right. list --> [V,E,T].

    list.add(3, 'O'); => char 'O' is auto-boxed to Character object and added at index 3 of
    the list. list --> [V,E,T,O].

    list.contains('O') => char 'O' is auto-boxed to Character object and as Character class
    overrides equals(String) method this expression returns true. Control goes inside if-block
    and executes: list.remove(3);.

    list.remove(3); => Removes last element of the list. list --> [V,E,T].

    for(char ch : list) => First list item is Character object, which is auto-unboxed and
    assigned to ch. This means in first iteration ch = 'V'; And after this it is simple
    enhanced for loop. Output is VET.
*/
public class Test29 {

    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add(0, 'V');
        list.add('T');
        list.add(1, 'E');
        list.add(3, 'O');

        if(list.contains('O')) {
            list.remove(3);
        }

        for(char ch : list) {
            System.out.print(ch);
        }
    }

}
