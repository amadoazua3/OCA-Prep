package exam4;

/*
    boolean res = a++ == 7 && ++a == 9 || a++ == 9;

    = (a++) == 7 && ++a == 9 || (a++) == 9;

    = (a++) == 7 && (++a) == 9 || (a++) == 9;

    = ((a++) == 7) && ((++a) == 9) || ((a++) == 9);

    = ((a++) == 7) && ((++a) == 9) || ((a++) == 9);

    = (((a++) == 7) && ((++a) == 9)) || ((a++) == 9);

    = ((7 == 7) && ((++a) == 9)) || ((a++) == 9); //a = 8

    = (true && ((++a) == 9)) || ((a++) == 9); //a = 8

    = (true && (9 == 9)) || ((a++) == 9); //a = 9

    = (true && true) || ((a++) == 9); //a = 9

    = true || ((a++) == 9); //a = 9

    = true; //a = 9

    So,

    a = 9

    res = true
*/

public class Test62 {

    public static void main(String[] args) {
        int a = 7;
        boolean res = a++ == 7 && ++a == 9 || a++ == 9;
        System.out.println("a = " + a);
        System.out.println("res = " + res);
    }

}
