package exam3;

/*
    String is a final class so it cannot be extended.
*/

//public class Test19 extends String {        // causes compilation error

public class Test19 {                       // fixes compilation error

    @Override
    public String toString() {
        return "TEST";
    }

    public static void main(String[] args) {
        Test19 obj = new Test19();
        System.out.println(obj);
    }

}
