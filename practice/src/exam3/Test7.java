package exam3;

/*
    Initially arr1 refers to an int array object of 3 elements.

    And arr2 refers to an int array object of 2 elements [char type is compatible
    with int type]

    When the statement `arr1 = arr2;` executes, variable arr1 copies the content of arr2,
    which is the address of array object containing 2 elements. Hence, arr1 also starts
    referring to same array object. arr1.length = 2 and arr2.length = 2.

    Therefore, output is: 4
*/

public class Test7 {

    public static void main(String[] args) {
        int [] arr1 = {5, 10, 15};
        int [] arr2 = {'A', 'B'};
        arr1 = arr2;
        System.out.println(arr1.length + arr2.length);
    }

}
