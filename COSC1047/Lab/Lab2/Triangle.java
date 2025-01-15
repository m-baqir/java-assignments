package Lab2;

public class Triangle extends GeometricObject {
    private double side1 = 1.0, side2 = 1.0, side3 = 1.0;

    Triangle() {
        side1 = 0;
        side2 = 0;
        side3 = 0;
    }

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide1() {
        this.side1 = side1;
    }

    public void setSide2() {
        this.side2 = side2;
    }

    public void setSide3() {
        this.side3 = side3;
    }

    public double getSide1() {
        return this.side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "This Triangle is made of " + side1 + " " + side2 + " " + side3 + " sides";
    }
}
