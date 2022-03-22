package exam1;

/*
    main method's parameter variable name is "args" and it is a local to main method.

    So, same name "args" can't be used directly within the curly brackets of main
    method.

    short[] args = new short[]{50, 50}; gives compilation error for using same name for
    local variable.
*/

public class Test13 {
    public static void main(String[] args) {
//        short [] args = new short[]{50, 50};
//        args[0] = 5;
//        args[1] = 10;
        System.out.println("[" + args[0] + ", " + args[1] + "]");
    }
}
