/**
 * @author Mohammad Baqir
 * @version 1.0
 */
public class Rectangle {
    // default value constant
    final int DEFAULT = 2;
    private int length, width;

    // empty constructor
    Rectangle() {
        this.length = DEFAULT;
        this.width = DEFAULT;
    }

    // constructor with params
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // set length method
    public void setLength(int length) {
        this.length = length;
    }

    // set width method
    public void setWidth(int width) {
        this.width = width;
    }

    // method for setting for length and width
    public void setLength_Width(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // accessor method for length
    public int getLength() {
        return this.length;
    }

    // accessor method for width
    public int getWidth() {
        return this.width;
    }

    // method for finding area
    public int findArea(int length, int width) {
        return length * width;
    }

    // method for perimeter
    public int findPerimeter(int length, int width) {
        return 2 * (length + width);
    }

    // override method for printing dimensions
    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }

    // method to compare two rectangles
    public boolean equals(Rectangle x) {
        if (length == x.length || width == x.width) {
            System.out.println("These two rectangles are equivalent");
            return true;
        }
        System.out.println("These two rectangles are not equivalent");
        return false;
    }
}
