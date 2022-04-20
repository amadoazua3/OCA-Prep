package exam5;

/*
    Class M and M are declared public and inside same package com.udayankhattry.oca.
    Method printName() of class M has correctly been overridden by N.

    printName() method is public so no issues in accessing it anywhere.

    Let's check the code inside main method.

    M obj1 = new M(); => obj1 refers to an instance of class M.

    N obj2 = (N)obj1; => obj1 is of type M and it is assigned to obj2 (N type), hence
    explicit casting is necessary. obj1 refers to an instance of class M, so at runtime
    obj2 will also refer to an instance of class M. sub type can't refer to an instance
    of super type so at runtime `N obj2 = (N)obj1;` will throw ClassCastException.
*/

public class Test6 {

    public static void main(String[] args) {
        M obj1 = new M();
        N obj2 = (N)obj1;
//        obj2.printName();
    }

}
