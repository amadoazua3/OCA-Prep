package exam4;

/*
    When change method is called, both variable s and sb refers to same StringBuilder object.

    Line 9 modifies the passed object and appends "_Morning" to it. As a result s now refers
    to "Good_Morning" and sb also refers to "Good_Morning" so when control goes back to calling
    method main(String[]) Line 5 prints "Good_Morning" on to the console.
*/

public class Test64 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Good"); //Line 3
        change(sb); //Line 4
        System.out.println(sb); //Line 5
    }

    private static void change(StringBuilder s) {
        s.append("_Morning"); //Line 9
    }

}
