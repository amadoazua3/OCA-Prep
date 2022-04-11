package exam3;

/*
    super(); is added by the compiler as the first statement in both the constructors.

    Class Super extends from Object class and Object class has no-argument constructor,
    hence no issues with the constructor of Super class.

    But no-arg constructor is not available in Super class, hence calling super(); from
    Sub class constructor gives compilation error.
*/

class Super {
    public Super(int i) {
        System.out.println(100);
    }
}

class Sub extends Super {
    public Sub() {
        super(0);       // Fixes compilation error
        System.out.println(200);
    }
}

public class Test63 {

    public static void main(String[] args) {
        new Sub();
    }

}
