package exam3;

/*
    All the array elements are initialized to their default values. arr is of Boolean type
    (reference type), so arr[0] is initialized to null.

    if expression works with Boolean type variable, so "if(arr[0])" doesn't give compilation
    error but java runtime extracts the boolean value stored in arr[0] and it uses
    booleanValue() method.

    arr[0].booleanValue() means booleanValue() method is invoked on null reference and
    hence NullPointerException is thrown at runtime.
*/

public class Test3 {

    static Boolean[] arr = new Boolean[1];
    public static void main(String[] args) {
        if(arr[0]) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
