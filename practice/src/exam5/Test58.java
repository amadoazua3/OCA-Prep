package exam5;

public class Test58 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("TOMATO");
//        System.out.println(sb.reverse().replace("O", "A")); //Line n1
    }
}

/*
    sb --> {"TOMATO"}

    sb.reverse() --> {"OTAMOT"}. reverse() method returns a StringBuilder object.

    replace method of StringBuilder class accepts 3 arguments: `replace(int start, int end, String str)`.
    At Line n1, replace("O", "A") method accepts 2 arguments and hence it causes compilation error.
*/