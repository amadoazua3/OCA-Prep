package exam3;


/*
    Derived class overrides method m1() of Base class. Access modifier of method m1()
    in Base class is protected, so overriding method can use protected or public.

    But overriding method in this case used default modifier and hence there is
    compilation error.
*/

class Base {
    protected void m1() {
        System.out.println("Base: m1()");
    }
}

class Derived extends Base {

//   public void m1() {                           // use this line to fix code
//    protected void m1() {                       // or use this line to fix the code
    void m1() {                                 // using default results in compilation error
        System.out.println("Derived: m1()");
    }
}

public class TestBaseDerived {

    public static void main(String[] args) {
        Base b = new Derived();
        b.m1();
    }

}
