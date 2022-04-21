package exam5;

public class Test65 {

    public static void main(String [] args) {
        int a = 3;
        int b = 5;
        int c = 7;
        int d = 9;
        boolean res = --a + --b < 1 && c++ + d++ > 1;
        System.out.printf("a = %d, b = %d, c = %d, d = %d, res = %b", a, b, c, d, res);
    }

}

/*
Given expression:

--a + --b < 1 && c++ + d++ > 1;

--a + --b < 1 && (c++) + (d++) > 1; //postfix has got highest precedence

(--a) + (--b) < 1 && (c++) + (d++) > 1; //prefix comes after postfix

{(--a) + (--b)} < 1 && {(c++) + (d++)} > 1; //Then comes binary +. Though parentheses are used but I used curly brackets, just to explain.

[{(--a) + (--b)} < 1] && [{(c++) + (d++)} > 1]; //Then comes relational operator (<,>). I used square brackets instead of parentheses.

This expression is left with just one operator, && and this operator is a binary operator so works with 2 operands, left operand [{(--a) + (--b)} < 1] and right operand [{(c++) + (d++)} > 1]

Left operand of && must be evaluated first, which means [{(--a) + (--b)} < 1] must be evaluated first.



[{2 + (--b)} < 1] && [{(c++) + (d++)} > 1]; //a=2, b=5, c=7, d=9

[{2 + 4} < 1] && [{(c++) + (d++)} > 1]; //a=2, b=4, c=7, d=9

[6 < 1] && [{(c++) + (d++)} > 1];

false && [{(c++) + (d++)} > 1];



&& is short circuit operator, hence right operand is not evaluated and false is returned.



Output of the given program is: a = 2, b = 4, c = 7, d = 9, res = false
*/