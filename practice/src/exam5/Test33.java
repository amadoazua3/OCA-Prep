package exam5;

class Lock {
    public void open() {
        System.out.println("LOCK-OPEN");
    }
}

class Padlock extends Lock {
    public void open() {
        System.out.println("PADLOCK-OPEN");
    }
}

class DigitalPadlock extends Padlock {
    public void open() {
        /*INSERT*/
    }
}


public class Test33 {

    public static void main(String[] args) {
        Lock lock = new DigitalPadlock();
        lock.open();
    }

}

/*
    Which of the following options, if used to replace / *INSERT* /, will compile
    successfully and on execution will print LOCK-OPEN on to the console?

    - (Lock)super.open();
    - super.open();
    - super.super.open();
    - ((Lock)super).open();
    - None of the other options   (Correct)

*/

/*
    super.open(); => Using super keyword, you can access methods and variables of immediate
    parent class, hence if you replace / *INSERT* / with `super.open();`, then open() method
    of Padlock class will be invoked.

    super.super.open(); => super.super is not allowed in java, it causes compilation error.

    ((Lock)super).open(); => Not possible to cast super keyword in java, it causes compilation
    error.

    (Lock)super.open(); => super.open(); will be evaluated first as dot (.) operator has higher
    precedence than cast. super.open(); returns void and hence it cannot be casted to Lock. It
    also causes compilation error.

    In fact, it is not possible to directly reach to 2 levels, super keyword allows to access
    methods and variables of immediate parent class only (just 1 level up). Hence, correct answer
    is: 'None of the other options'
*/