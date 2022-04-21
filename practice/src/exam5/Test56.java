package exam5;

public class Test56 {

    public static void main(String[] args) {
        System.out.println("Welcome " + args[0] +"!");
    }

}


/*
    javac Test.java

    java Test "James Gosling" "Bill Joy"

    What is the result?
*/

/*
    Please note, if passed command line arguments contain space(s) in between,
    then it is a common practice to enclosed within double quotes. In this case
    "James Gosling" is passed as one String object and "Bill Joy" is also passed
    as one String object.

    java Test "James Gosling" "Bill Joy" passes new String [] {"James Gosling",
    "Bill Joy"} to args of main method. args[0] refers to "James Gosling" and
    args[1] refers to "Bill Joy".

    Hence, Welcome James Gosling! is printed on to the console. While printing
    the String object, enclosing quotes are not shown.

    To use quotes as part of the String, you can escape those using backslash,
    such as:

    java Test "\"James Gosling"\" "\"Bill Joy"\"

    Above command will print Welcome "James Gosling"! on to the console.
*/