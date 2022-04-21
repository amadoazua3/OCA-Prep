package exam5;

import java.util.ArrayList;
import java.util.List;

public class Test36 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("P");
        list.add("O");
        list.add("T");

        List<String> subList = list.subList(1, 2); //Line n1
        subList.set(0, "E"); //Line n2
        System.out.println(list);
    }
}


/*
    list --> [P, O, T]

    sublist method is declared in List interface:

    List<E> subList(int fromIndex, int toIndex)

    fromIndex is inclusive and toIndex is exclusive

    It returns a view of the portion of this list between the specified fromIndex and toIndex.
    The returned list is backed by this list, so non-structural changes in the returned list are
    reflected in this list and vice-versa.

    If returned list (or view) is structurally modified, then modification are reflected in this
    list as well but if this list is structurally modified, then the semantics of the list returned
    by this method become undefined.

    If fromIndex == toIndex, then returned list is empty.

    If fromIndex < 0 OR toIndex > size of the list OR fromIndex > toIndex, then
    IndexOutOfBoundsException is thrown.

    list.subList(1, 2) --> [O] (fromIndex is inclusive and endIndex is exclusive, so start index is 1
    and end index is also 1). subList --> [O].

    At Line n2, `subList.set(0, "E");` => sublist --> [E]. This change is also reflected in the backed
    list, therefore after this statement, list --> [P, E, T]

    `System.out.println(list);` prints [P, E, T] on to the console.
*/