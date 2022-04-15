package exam4;

import java.util.ArrayList;
import java.util.List;

/*
    List is super type and ArrayList is sub type, hence List l = new ArrayList(); is valid syntax.

    Animal is super type and Dog is sub type, hence Animal a = new Dog(); is valid syntax. Both
    depicts Polymorphism.

    But in generics syntax, Parameterized types are not polymorphic, this means ArrayList<Animal>
    is not super type of ArrayList<Dog>. Remember this point. So below syntaxes are not allowed:

    ArrayList<Animal> list = new ArrayList<Dog>(); OR List<Animal> list = new ArrayList<Dog>();
*/

abstract class Animal {}
class Dog extends Animal{}

public class Test41 {

    public static void main(String [] args) {
//        List<Animal> list = new ArrayList<Dog>();
//        list.add(0, new Dog());
//        System.out.println(list.size() > 0);
    }

}
