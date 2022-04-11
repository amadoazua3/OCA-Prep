package exam3;

/*
    fruit refers to String object "Mango". Matching case is available, MANGO is printed
    on to the console.

    No break statement inside case "Mango":, hence control enters in fall-through and
    executes remaining blocks until the break; is found or switch block ends.

    So in this case, it prints BANANA and break; statement takes control out of switch
    block. main method ends and program terminates successfully.
*/

public class Test61 {

    public static void main(String[] args) {
        String fruit = new String(new char[] {'M', 'a', 'n', 'g', 'o'});
        switch (fruit) {
            default:
                System.out.println("ANY FRUIT WILL DO");
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
                break;
        }
    }

}
