package exam1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;


/*
    Jack's salary is 5000 and Liya's salary is 8000. If Employee's salary is >= 10000 then
    that Employee object is removed from the list.

    Allowed lambda expression is:

    (Employee e) -> { return e.getSalary() >= 10000; },

    Can be simplified to:  (e) -> { return e.getSalary() >= 10000; } => type can be
    removed from left side of the expression.

    Further simplified to: e -> { return e.getSalary() >= 10000; } => if there is only one
    parameter in left part, then round brackets (parenthesis) can be removed.

    Further simplified to: e -> e.getSalary() >= 10000 => if there is only one statement in
    the right side then semicolon inside the body, curly brackets and return statement
    can be removed. But all 3 [return, {}, ;] must be removed together.


    NOTE: there should not be any space between - and > of arrow operator.
*/

class Employee {

    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return name;
    }
}

public class Test38 {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("James", 25, 15000));
        list.add(new Employee("Lucy", 23, 12000));
        list.add(new Employee("Bill", 27, 10000));
        list.add(new Employee("Jack", 19, 5000));
        list.add(new Employee("Liya", 20, 8000));

        process(list, (Employee e) -> {return e.getSalary() >= 10000; });     // executes code successfully
//        process(list, (e) -> { e.getSalary() >= 10000; });      // error
//        process(list, e ->  e.getSalary() >= 10000 );     // executes code successfully
//        process(list, e -> { e.getSalary() >= 10000 });     // error

        System.out.println(list);

    }

    private static void process(List<Employee> list, Predicate<Employee> predicate) {

        Iterator<Employee> iterator = list.iterator();
        while(iterator.hasNext()) {
            if(predicate.test(iterator.next()))
                iterator.remove();
        }
    }

}
