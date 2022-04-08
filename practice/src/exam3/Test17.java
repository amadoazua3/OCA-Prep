package exam3;

/*
    i and j cannot be declared private as i and j are local variables.

    Only final modifier can be used with local variables.
*/

class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}

public class Test17 {

    public static void main(String[] args) {
//        private int i = 100;
//        private int j = 200;
//        Rectangle rect = new Rectangle(i, j);
//        System.out.println(rect.getHeight() + ", " + rect.getWidth());
    }

}
