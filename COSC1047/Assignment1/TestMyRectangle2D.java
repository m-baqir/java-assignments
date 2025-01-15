package Assignment1;

public class TestMyRectangle2D {
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
        System.out.println("Area of rectangle: " + r1.getArea(5.5, 4.9));
        System.out.println("Perimeter of rectangle: " + r1.getPerimeter(5.5, 4.9));
        System.out.println("Result of contains: " + r1.contains(3, 3));
        System.out.println("Result of contains part 2: " + r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
        System.out.println("Result of overlaps: " + r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
    }
}
