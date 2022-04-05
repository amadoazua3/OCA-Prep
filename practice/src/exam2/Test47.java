package exam2;

/*
    class Car doesn't extend from Vehicle class, this means Vehicle is not super type of
    Car.

    Hence, Vehicle obj = new Car(); causes compilation error.
*/

class Vehicle {
    public int getRegistrationNumber() {
        return 1;
    }
}

class Car {
    public int getRegistrationNumber() {
        return 2;
    }
}

public class Test47 {

    public static void main(String[] args) {
//        Vehicle obj = new Car();
//        System.out.println(obj.getRegistrationNumber());
    }
}
