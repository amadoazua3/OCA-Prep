package exam1;

/*
    Method m is overloaded. Which overloaded method to invoke is decided at compile time.
    m(i) is tagged to m(int) as i is of int type and m('5') is tagged to m(char) as '5' is char
    literal.

*/

public class Test29 {

    private static void m(int x) {
        System.out.println("int version");
    }

    private static void m(char x){
        System.out.println("char version");
    }

    public static void main(String[] args) {
        int i = '5';
        m(i);
        m('5');
    }

}
