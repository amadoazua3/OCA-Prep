package exam1;

import java.util.ArrayList;
import java.util.List;

/*
    break; and continue; are used inside for-loop, hence no compilation error.

    In 1st iteration, x = 0. "Smith" is added to the list. There is no matching case found,
    hence control just goes after the switch-case block and executes break; statement,
    which takes the control out of the for loop. `System.out.println(list.size());` is executed
    and this prints 1 on to the console.
*/

public class Test61 {

    public static void main(String[] args) {

        String[] names = {"Smith", "Brown", "Thomas", "Taylor", "Jones"};
        List<String> list = new ArrayList<>();

        for(int x = 0; x < names.length; x++) {

            list.add(names[x]);

            switch (x) {
                case 2:
                    continue;
            }
            break;
        }
        System.out.println(list.size());
    }
}
