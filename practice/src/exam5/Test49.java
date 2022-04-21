package exam5;

import d.Dog;

public class Test49 {
    public static void main(String[] args) {
        new Dog();
    }
}

/*
    super(); is added by the compiler as the first statement in both the constructors:

    Animal() {

        super();

        System.out.print("ANIMAL-");

    }


    and



    public Dog() {

        super();

        System.out.print("DOG");

    }


    Class Animal extends from Object class and Object class has no-argument constructor, hence
    no issues with the constructor of Animal class.
*/