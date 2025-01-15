package Exam;

public class Heptagon implements Comparable, Cloneable {
    private double side = 1.0;

    Heptagon() {
        this.side = side;
    }

    Heptagon(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public double getPerimeter(double side) {
        return side * 7;
    }

    public void equals(Heptagon h1, Heptagon h2) {
        if (h1.getSide() == h2.getSide()) {
            System.out.println("Both objects are equal");
        } else
            System.out.println("Both objects are NOT equal");
    }

    @Override
    public String toString() {
        return "This Heptagon side is " + side + " long and its perimiter is " + this.getPerimeter(side);
    }

    @Override
    public int compareTo(Heptagon h) {
        if (getSide() > ((Heptagon) h).getSide())
            return 1;
        else if (getSide() < ((Heptagon) h).getSide())
            return -1;
        else
            return 0;
    }

    public Heptagon Cloneable(Heptagon h) {
        Heptagon newHep = new Heptagon(h.side);
        return newHep;
    }

}
