package exam3;

/*
    class Error extends Throwable, so `obj instanceof Error;` and `obj instanceof
    Throwable;` return true.

    But Error class is not related to Exception and RuntimeException classes in multilevel
    inheritance and that is why Line n1 and Line n2 causes compilation error.
*/

public class Test10 {

    public static void main(String[] args) {
        Error obj = new Error();
//        boolean flag1 = obj instanceof RuntimeException; //Line n1
//        boolean flag2 = obj instanceof Exception; //Line n2
        boolean flag3 = obj instanceof Error; //Line n3
        boolean flag4 = obj instanceof Throwable; //Line n4
//        System.out.println(flag1 + ":" + flag2 + ":" + flag3 + ":" + flag4);
    }
}
