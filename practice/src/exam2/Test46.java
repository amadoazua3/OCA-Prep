package exam2;

/*
    Easy question on iterating through 2-dimensional array. Starting index should be 0
    and not 1. Enhanced for loop syntax is correct.

    As for loops contain 1 statement, hence curly brackets can be ignored.
*/

public class Test46 {

    public static void main(String[] args) {
        String [][] fruits = {{"apple", "mango"}, {"orange", "grape"}};
        /*INSERT*/

//        Option 1 will print "apple mango orange grape" on to the console
//        for(String []arr : fruits) {
//            for(String fruit : arr) {
//                System.out.println(fruit + " ");
//            }
//        }

//        Option 2 will NOT print "apple mango orange grape" on to the console
//        for(int i = 1; i <= fruits.length; i++) {
//            for(int j = 1; j <= fruits[i].length; j++) {
//                System.out.println(fruits[i][j] + " ");
//            }
//        }

//        Option 3 will print "apple mango orange grape" on to the console
//        for(int i  = 0; i < fruits.length; i++) {
//            for(int j = 0; j < fruits[i].length; j++) {
//                System.out.println(fruits[i][j] + " ");
//            }
//        }

//        Option 4 will NOT print "apple mango orange grape" on to the console
//        for(int i = 1; i < fruits.length; i++) {
//            for(int j = 1; j < fruits[i].length; j++) {
//                System.out.println(fruits[i][j] + " ");
//            }
//        }

    }
}
