package exam3;

import java.util.ArrayList;
import java.util.List;

/*
    Even though code seems to be checking the knowledge of ArrayList but it actually
    checks the knowledge of Polymorphism.

    List<Sellable> list = new ArrayList<>(); is valid statement and list can accept any
    object passing instanceof check for Sellable type.

    Rabbit implements Sellable hence new Rabbit() can be added to list.

    But as Mammal doesn't implement Sellable hence new Mammal() can't be added to list.

    Other initializer blocks can be verified on similar lines. So there is only one initializer
    block, which causes compilation error.
*/

interface Sellable {}
abstract class Animal {}
class Mammal extends Animal{}
class Rabbit extends Mammal implements Sellable{}

public class Test24 {

    {
        List<Animal> list = new ArrayList<>();
        list.add(new Rabbit());
    }
    {
        List<Animal> list = new ArrayList<>();
        list.add(new Mammal());
    }
    {
        List<Mammal> list = new ArrayList<>();
        list.add(new Rabbit());
    }
//    {
//        List<Sellable> list = new ArrayList<>();      //This block causes the compilation error
//        list.add(new Mammal());
//    }
    {
        List<Sellable> list = new ArrayList<>();
        list.add(new Rabbit());
    }

}
