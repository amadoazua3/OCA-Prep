package exam5;


/*
    User must be allowed to read and change the value of radius field. What needs to be
    done so that all the classes can read/change the value of radius field and Circle
    class is well encapsulated as well?
*/

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}


/*

    Circle class needs to be well encapsulated, this means that instance variable radius
    must be declared with private access modifier and getter/setter methods must be public,
    so that value in radius variable can be read/changed by other classes.

    Out of the given options, below option is correct:

    Add below 2 methods in Circle class:

    public double getRadius() {

        return radius;

    }

    public void setRadius(double radius) {

        this.radius = radius;

    }

*/