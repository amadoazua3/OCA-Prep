package exam1;

/*
    Methods can have the same name as the class. Student() and Student(String, int) are
    methods and not constructors of the class, note the void return type of these
    methods.

    As no constructors are provided in the Student class, java compiler adds default no-
    arg constructor. That is why the statement Student s = new Student(); doesn't give
    any compilation error.

    Default values are assigned to instance variables, hence null is assigned to name and
    0 is assigned to age.

    In the output, null:0 is displayed.
*/

class Student {

    String name;
    int age;

    void Student() {
        Student("James", 25);
    }

    void Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Test27 {

    public static void main(String[] args) {

        Student s = new Student();
        System.out.println(s.name + ":" + s.age);
    }
}
