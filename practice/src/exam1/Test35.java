package exam1;

/*
    In below statements: student<main> means student inside main method.

    On execution of main method: student<main> --> {"James", 25}, marks<main> = 25.

    On execution of review method: stud<review> --> {"James", 25} (same object
    referred by student<main>), marks<review> = 25 (this marks is different from the
    marks defined in main method). marks<review> = 35 and stud.marks = 60. So at the
    end of review method: stud<review> --> {"James", 60}, marks<review> = 35.

    Control goes back to main method: student<main> --> {"James", 60}, marks<main>
    = 25. Changes done to reference variable are visible in main method but changes
    done to primitive variable are not reflected in main method.
*/

class Student {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Test35 {

    public static void main(String[] args) {

        Student student = new Student("James", 25);
        int marks = 25;
        review(student, marks);
        System.out.println(marks + "-" + student.marks);
    }

    private static void review(Student stud, int marks) {
        marks = marks + 10;
        stud.marks += marks;
    }

}
