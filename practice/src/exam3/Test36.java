package exam3;

/*
    All the elements of array are initialized to respective zeros (in case of primitive type)
    or null (in case of reference type).

    So, arr[0] refers to null.

    Method 'isEmpty()' is invoked on null reference and hence NullPointerException is
    thrown at runtime.
*/

public class Test36 {

    public static void main(String[] args) {
        String [] arr = new String[1];
        System.out.println(arr[0].isEmpty());
    }

}
