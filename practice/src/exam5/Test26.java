package exam5;

public class Test26 {

    public static void main(String[] args) {
//        int[][] arr = new int[x][y]; //Line n1
//        arr[1][4] = 100;
//        arr[6][6] = 200;
//        arr[3][6] = 300;
    }

}

/*
    How many of above x,y pair(s) can replace x and y at Line n1
    such that Test.java file compiles successfully?

    1. x = 6, y = 6

    2. x = 2, y = 5

    3. x = 4, y = 7

    4. x = 7, y = 7

    5. x = 8, y = 8

    6. x = 0, y = 0

    7. x = -1, y = -1

*/

/*
    Given question expects you to solve the compilation error and not care
    about runtime error. For array indexes, any int values can be used,
    hence all the 7 pairs are allowed in this case.

    If question were expecting to compile and execute the program successfully,
    then any combination greater than the max indexes values would have worked.
    For example, in the given code, as max 1st dimension value = 6 and max 2nd
    dimension value = 6, so any int value > 6 can be used for x and any int
    value > 6 can be used for y.

    Out of the given seven options, only two options (x = 7, y = 7) and
    (x = 8, y = 8) would have worked.
*/