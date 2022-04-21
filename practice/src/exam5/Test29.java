package exam5;

public class Test29 {

    public static void main(String[] args) {
        Counter [] arr = new Counter[2]; //Line n2
        for(Counter ctr : arr) {
            System.out.print(ctr.count); //Line n3
        }
    }

}

/*
    Variable 'count' declared inside interface Counter is implicitly public, static and final.
    Line n1 compiles successfully.

    Line n2 creates one dimensional array of 2 elements of Counter type and both the elements
    are initialized to null. Line n2 compiles successfully.

    Though correct way to refer static variable is by using the type name, such as Counter.count
    but it can also be invoked by using Counter reference variable. Hence ctr.count at Line n3
    correctly points to the count variable at Line n1.

    For invoking static fields, object is not needed, therefore even if 'ctr' refers to null,
    ctr.count doesn't throw NullPoionterException. Given loop executes twice and therefore output is: 1010
*/