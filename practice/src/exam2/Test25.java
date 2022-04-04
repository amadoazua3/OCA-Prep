package exam2;

/*
    "mango" is different from "Mango", so there is no matching case available.

    default block is executed and as it is the last block inside switch hence after printing
    "ANY FRUIT WILL DO" control goes out of switch block, main method ends and
    program terminates successfully.
*/

public class Test25 {

    public static void main(String[] args) {
        String fruit = "mango";
        switch (fruit) {
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
                break;
            default:
                System.out.println("ANY FRUIT WILL DO");
        }
    }
}
