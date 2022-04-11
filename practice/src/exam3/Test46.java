package exam3;

/*
    When change(String) method is called, both variable s and str refers to same String object.

    Line 9 doesn't modify the passed object instead creates a new String object "Good_Morning".

    But this newly created object is not referred and hence is a candidate for GC.

    When control goes back to calling method main(String[]), str still refers to "Good".

    Line 5 prints "Good" on to the console.
*/

public class Test46 {

    public static void main(String[] args) {
        String str = "Good"; //Line 3
        change(str); //Line 4
        System.out.println(str); //Line 5
    }

    private static void change(String s) {
        s.concat("_Morning"); //Line 9
    }

}
