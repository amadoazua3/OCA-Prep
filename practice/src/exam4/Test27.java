package exam4;

/*
    Array elements are initialized to their default values.

    arr is referring to an array of Boolean type, which is
    reference type and hence both the array elements are initialized
    to null and therefore in the output null:null is printed.
*/

public class Test27 {

    public static void main(String[] args) {
        Boolean [] arr = new Boolean[2];
        System.out.println(arr[0] + ":" + arr[1]);
    }
}

