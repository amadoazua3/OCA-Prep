package exam5;

abstract class Traveller {

    void travel(String place){}

}

abstract class BeachTraveller extends Traveller {

    /*INSERT*/
//    void travel(String beach) throws java.io.IOException {}
//    abstract void travel(String beach);
//    public void travel(Object obj) {}
//    public abstract void travel();
//    public void travel(String beach) throws Exception {}
//    public void travel() throws RuntimeException {}
//    abstract void travel();
}

/*
Which of the following declarations/definitions can replace / *INSERT* / such that there is no compilation error?

        Select 5 options.

        - void travel(String beach) throws java.io.IOException {}
        - abstract void travel(String beach);   (Correct)
        - public void travel(Object obj) {}     (Correct)
        - public abstract void travel();        (Correct)
        - public void travel(String beach) throws Exception {}
        - public void travel() throws RuntimeException {}   (Correct)
        - abstract void travel();               (Correct)

*/



/*
    Both Traveller and BeachTraveller are abstract classes and BeachTraveller extends Traveller.
    It is possible to have abstract class without any abstract method. Code as is compiles
    successfully as BeachTraveller inherits travel(String) method of Traveller class.

    But as per the question, / *INSERT* / must be replaced such that there is no compilation error.



            Let's check all the options one by one:

    abstract void travel(); ✓ This is method overloading. BeachTraveller has 2 methods:
    `void travel(String){}` and `abstract void travel()`.

    abstract void travel(String beach); ✓ As BeachTraveller is abstract, hence travel(String)
    method can be declared abstract.

    public abstract void travel(); ✓ This is method overloading. BeachTraveller has 2 methods:
    `void travel(String){}` and `abstract void travel()`.

    public void travel() throws RuntimeException {}: ✓ This is method overloading. BeachTraveller
    has 2 methods: `void travel(String){}` and `public void travel() throws RuntimeException {}`.

    public void travel(String beach) throws Exception {}: ✗ As overridden method doesn't declare to
    throw any checked Exception hence overriding method is not allowed to declare to throw Exception.

    void travel(String beach) throws java.io.IOException {} ✗ As overridden method doesn't declare to
    throw any checked Exception hence overriding method is not allowed to declare to throw java.io.IOException.

    public void travel(Object obj) {} ✓ This is method overloading. BeachTraveller has 2 methods:
    `void travel(String){}` and `public void travel(Object){}`.
*/