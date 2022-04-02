package exam1;

import java.util.ArrayList;
import java.util.List;

/*
ArrayList's 1st and 3rd items are referring to same String instance referred by s [s -->
"Hello"] and 2nd item is referring to another instance of String.

String is immutable, which means s.replace("l", "L"); creates another String instance
"HeLLo" but s still refers to "Hello" [s --> "Hello"].

[Hello, Hello, Hello] is printed in the output.
*/


public class Test50 {

    public static void main(String[] args) {

        String s = new String("Hello");
        List<String> list = new ArrayList<>();
        list.add(s);
        list.add(new String("Hello"));
        list.add(s);
        s.replace("l", "L");

        System.out.println(list);

    }
}
