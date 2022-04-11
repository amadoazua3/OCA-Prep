package exam3;

import java.util.Arrays;

/*
There are 2 ways to change the value of count variable of Counter class:

1. As access modifier of count variable is public, hence it can easily be accessed
from other classes using the instance of Counter class, such as `new Counter().count`
or `obj.count` (where obj is reference variable of Counter type, referring to Counter
variable's instance)

2. By invoking the increase(int) method of Counter class.

Now let's check all the blocks one by one:

1.

for(Counter ctr : arr) {

    ctr.count = 100;

}

✓ It will assign 100 to count variables of three instances of Counter class.

2.

for (Counter ctr : arr) {

    int x = ctr.getCount();

    x = 100;

}

✗ x is local variable and is copy of ctr.count. Hence, assigning 100 to x will not affect
the value of ctr.count.

3.

for (Counter ctr : arr) {

    ctr.getCount() = 100;

}

✗ ctr.getCount() returns int value and not a variable, hence cannot be used on left side of
assignment operator. It causes compilation error.

4.

for(Counter ctr : arr) {

    ctr.increase(100 - ctr.count);

}

✓ You must have noticed that value of count variable of 3 array elements are: -1000, 539, 0.
How will you change all 3 values to 100 using same expression? It is by adding 100 and
subtracting current value. For example,

-1000 + 100 -(-1000) = 100

or

539 + 100 - 539 = 100

or

0 + 100 - 0 = 100

And same this is done by executing `ctr.increase(100 - ctr.count);` statement.

5.

for (Counter ctr : arr) {

    ctr.increase(100 - ctr.getCount());

}

✓ Same as block no. 4. Only difference is ctr.getCount() is used instead of ctr.count.

6.

for(Counter ctr : arr) {

    ctr.increase(-ctr.getCount() + 100);

}

✓ Same as block no. 5.

7.

for(Counter ctr : arr) {

    ctr.increase(-ctr.count + 100);

}

✓ Same as block no. 4.

Hence, out of given 7 blocks, 5 will give you expected output.
*/

public class Test54 {

    public static void main(String[] args) {
        Counter[] arr = new Counter[] { new Counter(-1000), new Counter(539), new Counter(0) };

        /* INSERT */

        System.out.println(Arrays.toString(arr));
    }

}
