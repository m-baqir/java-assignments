package COSC2006.Midterm;

public class Box<T extends Comparable<T>> {
    private T something;

    public Box(T something) {
        this.something = something;
    }

    public boolean isGreaterThan(T otherBox) {
        return something.compareTo(otherBox) > 0;
    }

    public static void main(String[] args) {
        Box<String> box = new Box<>("Java");
        System.out.println(box.isGreaterThan("C++"));
        Box<Integer> box2 = new Box<>(5);
        System.out.println(box2.isGreaterThan(3));
    }
}
