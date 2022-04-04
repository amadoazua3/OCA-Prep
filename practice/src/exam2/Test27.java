package exam2;

import java.util.ArrayList;
import java.util.List;

/*
    List cannot accept primitives, it can accept objects only. So, when 100 and 200
    are added to the list, then auto-boxing feature converts these to wrapper objects of
    Integer type.

    So, 4 items gets added to the list: [100, 200, 100, 200]. list.remove(new Integer(100));
    removes the first occurrence of 100 from the list, which means the 1st element of the
    list.

    After removal list contains: [200, 100, 200].

    NOTE: String class and all the wrapper classes override equals(Object) method, hence
    at the time of removal when another instance is passes[new Integer(100)], there is no
    issue in removing the matching item.
*/

public class Test27 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        list.remove(new Integer(100));

        System.out.println(list);
    }
}
