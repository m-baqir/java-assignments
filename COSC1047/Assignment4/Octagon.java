package Assignment4;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
    private double side = 0;

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    Octagon() {
        this.side = 0;
    }

    Octagon(double side) {
        this.side = side;
    }

    public double Area(double side) {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    public double Perimeter(double side) {
        return side * 8;
    }

    public int compareTo(Octagon o) {
        if (getSide() > o.getSide())
            return 1;
        else if (getSide() < o.getSide())
            return -1;
        else
            return 0;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}
