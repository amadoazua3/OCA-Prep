package exam5;


/*
    Given statement:

    System.out.println((flag = true) | (flag = false) || (flag = true)); //flag = false

    System.out.println(((flag = true) | (flag = false)) || (flag = true)); //bitwise inclusive OR | has higher precedence over logical OR ||. flag = false

    || has two operands, Left: ((flag = true) | (flag = false)) and Right: (flag = true). Left operand needs to be evaluated first.

    System.out.println((true | (flag = false)) || (flag = true)); //flag = true

    System.out.println((true | false) || (flag = true)); //flag = false

    System.out.println(true || (flag = true)); //flag = false

    || is a short-circuit operator and as left operand evaluates to true, hence right operand is not evaluated.

    Above statement prints true on to the console.

    And

    System.out.println(flag); prints false on to the console as flag variable is false.
*/

public class Test15 {

    public static void main(String [] args) {
        boolean flag = false;
        System.out.println((flag = true) | (flag = false) || (flag = true));
        System.out.println(flag);
    }

}
