package COSC2006.Assignment2;

import java.util.Arrays;

class ArrayList<T> extends AbstractList<T> {

    @Override
    public void add(T value) {
        checkCapacity();
        elements[size++] = value;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        size--;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return (T) elements[index];
    }

    @Override
    public int size() {
        return size;
    }

    private void checkCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
    }
}