package exam1.test;

import exam1.A;

/*
    class A is declared public and defined in exam1 package, there is no
    problem in accessing class A outside exam1 package.

    class B is defined in exam1.test package, to extend from class A either use
    import statement "import exam1.A;" or fully qualified name of the class
    exam1.A. No issues with this class definition as well.

    Variable i1 is declared public in class A, so Line 20 doesn't cause any compilation
    error. Variable i2 is declared protected so it can only be accessed in subclass using
    inheritance but not using object reference variable. obj.i2 causes compilation failure.

    class B inherits variable i2 from class A, so inside class B it can be accessed by using either
    this or super. Line 10 and Line 11 don't cause any compilation error.
*/

public class B extends A {

    public void print(){
        A obj = new A();
        System.out.println(obj.i1);
//        System.out.println(obj.i2);
        System.out.println(this.i2);
        System.out.println(super.i2);
    }

    public static void main(String[] args) {
        new B().print();
    }
}
