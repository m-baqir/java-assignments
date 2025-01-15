package Assignment4;

public class TestOctagon {
    public static void main(String[] args) {
        Octagon oct1 = new Octagon(5);
        System.out.println(oct1.Area(5));
        System.out.println(oct1.Perimeter(5));

        Octagon oct2 = (Octagon) oct1.clone();
        System.out.println(oct2.compareTo(oct1));
    }
}
