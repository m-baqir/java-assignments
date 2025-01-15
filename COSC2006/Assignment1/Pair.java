package COSC2006.Assignment1;

public class Pair<F, S> {
    private final F first;
    private final S second;

    Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Pair<Integer, Integer> myPair = new Pair<>(1, 2);
        System.out.println(myPair.getFirst());
        System.out.println(myPair.getSecond());

    }
}
