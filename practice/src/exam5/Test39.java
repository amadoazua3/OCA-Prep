package exam5;

/*
throw ex; causes compilation error as div method doesn't declare to throw Exception (checked) type.
*/

public class Test39 {

//    private static void div(int i, int j) {     // Need to add throws Exception here to fix error
    private static void div(int i, int j) throws Exception{     // error is fixed
    try {
            System.out.println(i / j);
        } catch(ArithmeticException e) {
            Exception ex = new Exception(e);
            throw ex;
        }
    }
    public static void main(String[] args) {
        try {
            div(5, 0);
        } catch(Exception e) {
            System.out.println("END");
        }
    }

}

