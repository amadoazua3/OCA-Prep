package exam4;

/*
    NOTE: System.out.print statement is printing arr[i][1],

    which means it prints 2nd array element of a particular row,
    for each iteration of inner loop.

    That is why output is:

    BBB

    EEE

    HHH

    To get all the array elements printed correctly, use arr[i][j] in
    System.out.print statement.
*/

public class Test48 {

    public static void main(String[] args) {
        char [][] arr = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'}
        };

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][1]);
            }
            System.out.println();
        }
    }

}
