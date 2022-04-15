package exam4;

/*
    There is nothing inside loop body, hence loop body is blank.

    This loop executes 3 times, for i = 0, i = 1 and i = 2. For i = 3,
    control goes out of the for loop.

    Now, as i is declared outside for loop, hence it is accessible
    outside loop body.

    System.out.println(i); prints 3 to the console.
*/

public class Test45 {

    public static void main(String[] args) {
        int i;
        for(i=0; i<=2; i++){}
        System.out.println(i);
    }

}
