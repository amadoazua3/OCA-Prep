package exam5;

/*
Variable 'arr' refers to a two-dimensional array. for-each loops are used to iterate
the given array.

In 1st iteration of outer loop, str refers to one-dimensional String array {"%", "$$"}.

In 1st iteration of inner loop, s refers to "%" and "%" will be printed on to the console.
Boolean expression of Line n1 evaluates to false so Line n2 is not executed.

In 2nd iteration of inner loop, s refers to "$$" and "$$" will be printed on to the console.
Boolean expression of Line n1 evaluates to false so Line n2 is not executed.

Iteration of inner for-each loop is over and control executes Line n3. break; statement at
Line n3 terminates the outer loop and program ends successfully.


So, output is:

%

$$
*/

public class Test2 {

    public static void main(String[] args) {
        String [][] arr = { {"%", "$$"}, {"***", "@@@@", "#####"}};
        for(String [] str : arr) {
            for(String s : str) {
                System.out.println(s);
                if(s.length() == 4) //Line n1
                    break; //Line n2
            }
            break; //Line n3
        }
    }
}
