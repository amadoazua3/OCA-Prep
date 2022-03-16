package operatorsAndStatements;

/*
    A switch case can accept primitive types: byte, short, int, char; wrapper types: Byte, Short,
    Integer, Character; String and enums. In this case, all are VALID but only 3 of them execute.
    Case is comparing to integer value 7. Character seven '7' is different from integer value 7.
*/

public class Test3 {
    public static void main(String[] args) {

        /*INSERT*/

//        Character var = '7';    // prints DEFAULT
//    Character var = 7;          // prints Lucky no. 7
//        char var = '7';     // prints DEFAULT
//        Integer var = 7;    // prints Lucky no. 7
        char var = 7;       // prints Lucky no. 7
        /*INSERT*/

        switch(var) {
            case 7:
                System.out.println("Lucky no. 7");
                break;
            default:
                System.out.println("DEFAULT");
        }
    }
}
