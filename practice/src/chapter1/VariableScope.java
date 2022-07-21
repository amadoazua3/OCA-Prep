package chapter1;

public class VariableScope {

    public static void main(String[] args) {

        VariableScope vs = new VariableScope();

        vs.eat(1);
        vs.eatIfHungry(true);
        vs.eatIfHungry2(true);
    }

    public void eat(int piecesOfCheese) {

        int bitesOfCheese = 1;

    }

    /*
    You’ve learned that local variables are declared within
    a method. How many local variables do you see in this example?
    There are two local variables in this method. bitesOfCheese is
    declared inside the method. piecesOfCheese is called a method
    parameter. It is also local to the method. Both of these variables
    are said to have a scope local to the method. This means they
    cannot be used outside the method.
    */


    public void eatIfHungry(boolean hungry) {

        if(hungry) {
            int bitesOfCheese = 1;
        }   // bitesOfCheese goes out of scope here
        System.out.println(bitesOfCheese);  // DOES NOT COMPILE
    }

    /*
    hungry has a scope of the entire method. bitesOfCheese has a smaller
    scope. It is only available for use in the if statement because it is
    declared inside of it. When you see a set of braces ({ }) in the code,
    it means you have entered a new block of code. Each block of code has
    its own scope. When there are multiple blocks, you match them from the
    inside out. In our case, the if statement block begins at line 33 and ends
    at line 35. The method’s block begins at line 31 and ends at line 37.
    */


    public void eatIfHungry2(boolean hungry) {

        if(hungry) {
            int bitsOfCheese = 1;
            {
                boolean teenyBit = true;
                System.out.println(bitsOfCheese);
            }
        }
        System.out.println(teenyBit);       // DOES NOT COMPILE
    }

    /*
    Remember that blocks can contain other blocks. These smaller
    contained blocks can reference variables defined in the larger
    scoped blocks, but not vice versa.

    The variable defined on line 18 is in scope until the block ends
    on line 58. Using it in the smaller block from lines 54 to 57 is
    fine. The variable defined on line 20 goes out of scope on line 57.
    Using it on line 59 is not allowed.
    */


    public void eatMore(boolean hungry, int amountOfFood) {

        int roomInBelly = 5;
        if(hungry) {

            boolean timeToEat = true;
            while (amountOfFood > 0) {
                int amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
            }
        }
        System.out.println(amountOfFood);
    }

    /*
    The exam may attempt to trick you with questions on scope. You’ll probably
    see a question that appears to be about something complex and fails to
    compile because one of the variables is out of scope.

    The first step in figuring out the scope is to identify the blocks of code.
    In this case, there are three blocks. You can tell this because there are
    three sets of braces. Starting from the innermost set, we can see where the
    while loop’s block starts and ends. Repeat this as we go out for the if
    statement block and method block.
    */
}
