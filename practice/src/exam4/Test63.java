package exam4;

/*
    Initially arr1 refers to an int array object of 3 elements: 1, 2, 3

    And arr2 refers to an char array object of 2 elements: 'A', 'B'.

    Statement arr1 = arr2; gives compilation error as char [] is not
    compatible with int [] even though char is compatible with int.
*/

public class Test63 {

    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3};
        char [] arr2 = {'A', 'B'}; //ASCII code of 'A' is 65, 'B' is 66
//        arr1 = arr2;              // Causes compilation error
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

}
