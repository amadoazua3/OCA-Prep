package exam5;

public class Test52 {

    public static void main(String [] args) {
        boolean flag1 = true;
        boolean flag2 = false;
        boolean flag3 = true;
        boolean flag4 = false;

        System.out.println(!flag1 == flag2 != flag3 == !flag4); //Line n1
        System.out.println(flag1 = flag2 != flag3 == !flag4); //Line n2
    }

}

/*
Let's solve the expression at Line n1:

!flag1 == flag2 != flag3 == !flag4

(!flag1) == flag2 != flag3 == (!flag4) //Logical NOT has got highest precedence among given operators

((!flag1) == flag2) != flag3 == (!flag4) //== and != have same precedence and left to right associative, grouping == first

(((!flag1) == flag2) != flag3) == (!flag4) //grouping != next

Above expression is left with single operator ==, whose left side is: (((!flag1) == flag2) != flag3) and right side is: (!flag4). As == is a binary operator, so left side is evaluated first.

((false == flag2) != flag3) == (!flag4) //!flag1 is false

((false == false) != flag3) == (!flag4) //flag2 is false

(true != flag3) == (!flag4) //(false == false) evaluates to true

(true != true) == (!flag4) //flag3 is true

false == (!flag4) //(true != true) evaluates to false

false == true //!flag4 is true

false //(false == true) evaluates to false

Hence, false is printed on to the console.


Let's solve the expression at Line n2:

flag1 = flag2 != flag3 == !flag4

flag1 = flag2 != flag3 == (!flag4) //Logical NOT has got highest precedence among given operators

flag1 = (flag2 != flag3) == (!flag4) //== and != have same precedence and left to right associative, grouping == first

flag1 = ((flag2 != flag3) == (!flag4)) //grouping == next

Above expression is left with single assignment operator =, whose right side needs to be evaluated first

flag1 = ((false != flag3) == (!flag4)) //flag2 is false

flag1 = ((false != true) == (!flag4)) //flag3 is true

flag1 = (true == (!flag4)) //(false != true) evaluates to true

flag1 = (true == true) //!flag4 is true

flag1 = true //(true == true) evaluates to true

true is assigned to flag1 and true is also printed on to the console

One suggestion: In the real exam, if you find a question containing multiple expressions, then first check if there is any compilation error or not. If there is no compilation error in all the expressions, then only solve the expressions.
*/