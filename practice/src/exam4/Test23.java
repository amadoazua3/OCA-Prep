package exam4;

/*
    Both fName and lName are of reference type. fName refers to "James" and lName
    refers to "Gosling".

    In System.out.println() statement, we have used assignment operator (=) and not
    equality operator (==). So result is never boolean.

    fName = lName means copy the contents of lName to fName.

    As lName is referring to "Gosling" and so after the assignment, fName starts referring
    to "Gosling" as well.

    System.out.println() finally prints the String referred by fName, which is "Gosling".

This option is is not available, hence correct answer is "None of the other options"
*/

public class Test23 {

    public static void main(String[] args) {
        String fName = "James";
        String lName = "Gosling";
        System.out.println(fName = lName);
    }

}
