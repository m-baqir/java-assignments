package Assignment4;

public class Square extends GeometricObject implements Colorable {
    private double side = 0;

    public void howToColor() {
        System.out.println("Color all four sides");
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    Square(double side) {
        this.side = side;
    }

    Square() {
        this.side = 0;
    }

}
