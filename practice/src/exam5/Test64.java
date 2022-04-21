package exam5;

class Shape {
    int side = 0; //Line n1

    int getSide() { //Line n2
        return side;
    }
}

class Square extends Shape {
    private int side = 4; //Line n3

    protected int getSide() { //Line n4
        return side;
    }
}

public class Test64 {

    public static void main(String[] args) {
        Shape s = new Square();
        System.out.println(s.side + ":" + s.getSide());
    }

}

/*
    Subclass overrides the methods of superclass but it hides the variables of superclass.

    Line n3 hides the variable created at Line n1 and Line n4 overrides the getSide() method
    of Line n2. There is no compilation error for Square class as it correctly overrides getSide()
    method. You can use any access modifier at Line n3 as well, there are no rules for variable hiding.

    's' is of Shape type, hence s.side equals to 0 and s.getSide() invokes overriding method of Square
    class and it returns 4. Hence output is: 0:4.
*/