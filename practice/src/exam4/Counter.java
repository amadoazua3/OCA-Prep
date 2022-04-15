package exam4;

/*
    new Counter(); is invoked only once, hence only one
    Counter object is created in the memory.

    c1, c2, c3 and counter are reference variables of
    Counter type and not Counter objects.
*/

public class Counter {

    int count;

    private static void increment(Counter counter) {
        counter.count++;
    }

    public static void main(String [] args) {
        Counter c1 = new Counter();
        Counter c2 = c1;
        Counter c3 = null;
        c2.count = 1000;
        increment(c2);
    }
}
