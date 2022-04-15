package exam4;

/*
    Matching case block "case 10:" is found, a *= 2; is executed, which
    means a = a * 2; => a = 5 * 2; => a = 10;

    No break statement, hence it enters in fall-through.

    a *= 3; is executed, which means a = a * 3; => a = 10 * 3; => a = 30;

    a *= 4; is executed, which means a = a * 4; => a = 30 * 4; => a = 120;
*/

public class Test51 {

    public static void main(String[] args) {
        int a = 5;
        int x = 10;
        switch(x) {
            case 10:
                a *= 2;
            case 20:
                a *= 3;
            case 30:
                a *= 4;
        }
        System.out.println(a);
    }

}
