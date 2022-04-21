package exam5;



abstract class Food {

    // Original code
//    protected abstract double getCalories();

    // third independent solution
    abstract double getCalories();


}

class JunkFood extends Food {

    // Original code block
    double getCalories() {
        return 200.0;
    }

    // first independent solution
//    public double getCalories() {
//        return 200.0;
//    }

    // second independent solution
//    protected double getCalories() {
//        return 200.0;
//    }

}

/*
    Which 3 modifications, done independently, enable the code to compile?

    - Make the getCalories() method of Food class public (Incorrect)
    - Make the getCalories() method of Food class private (Incorrect)
    - Make the getCalories() method of JunkFood class public (Correct)
    - Make the getCalories() method of JunkFood class protected (Correct)
    - Make the getCalories() method of JunkFood class private (Incorrect)
    - Remove the protected access modifier from the getCalories() method of Food class (Correct)

*/

/*
    abstract methods cannot be declared with private modifier as abstract methods need
    to be overridden in child classes.

    abstract methods can be declared with either public, protected and package
    (no access modifier) modifier and hence overriding method cannot be declared which
    private modifier in the child class. That is why getCalories() method in Food and
    JunkFood classes cannot be declared private.


    Access modifier of overriding method should either be same as the access modifier of
    overridden method or it should be less restrictive than the access modifier of overridden
    method. Hence below solutions will work:

    1. Remove the protected access modifier from the getCalories() method of Food class: By
    doing this, both the overridden and overriding methods will have same access modifier
    (no access modifier)

    or

    2. Make the getCalories() method of JunkFood class protected: By doing this, both the
    overridden and overriding methods will have same access modifier (protected)

    or

    3. Make the getCalories() method of JunkFood class public: By doing this, access modifier
    of overriding method (which is public) is less restrictive than the access modifier of
    overridden method (which is protected)
*/