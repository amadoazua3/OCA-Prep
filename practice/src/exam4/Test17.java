package exam4;

/*
    color is LOCAL variable and it must be initialized before it can be used.

    As area is not compile time constant, java compiler doesn't have an idea
    of the value of variable area.

    There is no else block available as well.

    So compiler cannot be sure of whether variable color will be initialized
    or not, therefore System.out.println(color); causes compilation error.
*/

public class Test17 {
    public static void main(String args[]) {
        double area = 5.7;
        String color;
        if (area < 7)
            color = "green";

//        System.out.println(color);
    }
}
