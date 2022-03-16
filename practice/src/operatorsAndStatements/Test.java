package operatorsAndStatements;

/*
    We have a compilation error because of line 15. Since var is a byte data type, only values between -128 and 127.
*/

public class Test {
    public static void main(String[] args) {
        byte var = 100;
        switch(var) {

            case 100:
                System.out.println("var is 100");
                break;
//            case 200:
//                System.out.println("var is 200");
//                break;
            default:
                System.out.println("In default");
        }
    }
}
