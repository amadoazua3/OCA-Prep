package exam5;

import java.util.ArrayList;
import java.util.List;

public class Test71 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        byte b = 10;
//        list.add(b); //Line n1
        int mul = list.get(0) * list.get(0); //Line n2
        System.out.println(mul);
    }

}

/*
    list is of Integer type and variable 'b' is of byte type.

    At Line n1, b is auto-boxed to Byte and not Integer and List<Integer>
    can't store Byte objects, therefore Line n1 causes compilation error.

    list.get(0) returns Integer and `list.get(0) * list.get(0)` is evaluated
    to int, and variable 'mul' is of int type only. Therefore, Line n2
    compiles successfully.
*/