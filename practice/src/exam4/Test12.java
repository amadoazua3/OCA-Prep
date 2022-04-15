package exam4;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
    Even though method m1() declares to throw IOException but at runtime
    an instance of FileNotFoundException is thrown.

    A catch handler for FileNotFoundException is available and hence X is
    printed on to the console.

    After that finally block is executed, which prints Z to the console.
*/

abstract class Super {
    public abstract void m1() throws IOException;
}

class Sub extends Super {
    @Override
    public void m1() throws IOException {
        throw new FileNotFoundException();
    }
}

public class Test12 {

    public static void main(String[] args) {
        Super s = new Sub();
        try {
            s.m1();
        } catch (FileNotFoundException e) {
            System.out.print("X");
        } catch (IOException e) {
            System.out.print("Y");
        } finally {
            System.out.print("Z");
        }
    }
}
