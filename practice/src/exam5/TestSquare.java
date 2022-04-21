package exam5;

/*
    As both the classes: Square and TestSquare are in the same file, hence variables
    'length' and 'sq' can be accessed using dot operator. Given code compiles successfully.

    Line n1 creates an instance of Square class and 'sq1' refers to it. sq1.length = 10 and
    sq1.sq = null.

    Line n2 creates an instance of Square class and 'sq2' refers to it. sq2.length = 5 and
    sq2.sq = null.

    On execution of Line n3, sq1.sq = sq2.

    Line n4: System.out.println(sq1.sq.length); => System.out.println(sq2.length); => Prints
    5 on to the console.
*/

//class Square {
//    int length;
//    Square sq;
//
//    Square(int length) {
//        this.length = length;
//    }
//
//    void setInner(Square sq) {
//        this.sq = sq;
//    }
//
//    int getLength() {
//        return this.length;
//    }
//}
//
//
//public class TestSquare {
//
//    public static void main(String[] args) {
//        Square sq1 = new Square(10); //Line n1
//        Square sq2 = new Square(5); //Line n2
//        sq1.setInner(sq2); //Line n3
//        System.out.println(sq1.sq.length); //Line n4
//    }
//
//}
