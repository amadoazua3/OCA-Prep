package exam2;

import java.util.ArrayList;
import java.util.List;

/*
    Before you answer this, you must know that there are 5 different Student object
    created in the memory (4 at the time of adding to the list and 1 at the time of
    removing from the list).

    This means these 5 Student objects will be stored at different memory addresses.

    remove(Object) method removes the first occurrence of matching object and
    equals(Object) method decides whether 2 objects are equal or not. equals(Object)
    method has been overridden by the Student class and equates the object based on
    their name and age.

    3 matching Student objects are found in the list and 1st list element is removed from
    the list. Remaining 3 list elements are printed in the insertion order.
*/

class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student[" + name + ", " + age + "]";
    }

    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student stud = (Student)obj;
            if(this.name.equals(stud.name) && this.age == stud.age) {
                return true;
            }
        }
        return false;
    }
}

public class Test36 {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("James", 25));
        students.add(new Student("James", 27));
        students.add(new Student("James", 25));
        students.add(new Student("James", 25));

        students.remove(new Student("James", 25));

        for(Student stud : students) {
            System.out.println(stud);
        }
    }

}
