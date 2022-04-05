package exam2;

/*
    As there is no brackets after if, hence only one statement is part of if block and other
    is outside.

    Above code can be written as below:

    if(grade > 60) {
        System.out.println("Congratulations");
    }
    System.out.println("You passed");
    else
        System.out.println("You failed");


    There should not be anything between if-else block but in this case,
    System.out.println("You passed"); is between if-else and thus Compilation error.
*/

public class Test65 {

    public static void main(String[] args) {
        int grade = 75;
        if(grade > 60)
            System.out.println("Congratulations");
//        System.out.println("You passed");
         else
        System.out.println("You failed");
    }
}
