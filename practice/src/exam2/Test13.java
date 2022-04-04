package exam2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
    If you want to remove the items from ArrayList, while using Iterator or ListIterator,
    then use Iterator.remove() or ListIterator.remove() method and NOT List.remove()
    method.

    In this case ListIterator.remove() method is used. startsWith("A") returns true for
    "Apricot" and "Almond" so these elements are removed from the list. In the output,
    [Walnut, Date] is displayed.
*/

public class Test13 {
    public static void main(String[] args) {
        List<String> dryFruits = new ArrayList<>();
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");

        ListIterator<String> iterator = dryFruits.listIterator();
        while(iterator.hasNext()) {
            if(iterator.next().startsWith("A")) {
                iterator.remove();
            }
        }

        System.out.println(dryFruits);
    }
}
