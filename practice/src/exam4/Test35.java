package exam4;

/*
    for(;;) is an infinite loop and hence `sb.append("OCA");` causes OutOfMemoryError
    which is a subclass of Error class.

    main(String []) method throws OutOfMemoryError and program terminates abruptly.
*/

public class Test35 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try {
            for(;;) {
                sb.append("OCA");
            }
        } catch(Exception e) {
            System.out.println("Exception!!!");
        }
        System.out.println("Main ends!!!");
    }

}
