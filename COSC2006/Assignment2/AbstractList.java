package COSC2006.Assignment2;

abstract class AbstractList<T> {
    protected int size;
    protected Object[] elements;

    public AbstractList() {
        this.size = 0;
        this.elements = new Object[10];
    }

    public abstract void add(T value);

    public abstract void remove(int index);

    public abstract T get(int index);

    public abstract int size();
}