import java.util.Arrays;

/**
 * This class represents a priority queue data structure implemented using an
 * array.
 * The elements in the priority queue are integers, and the priority is
 * determined by the value of the element.
 * The higher the value, the higher the priority.
 */
public class MyPriorityQueue {
    private int[] array;
    private int size;

    /**
     * Constructs a new MyPriorityQueue object with the specified capacity.
     *
     * @param capacity the initial capacity of the priority queue
     */
    public MyPriorityQueue(int capacity) {
        array = new int[capacity];
        capacity = 0;
    }

    /**
     * Adds a new element to the priority queue.
     * If the priority queue is full, the capacity is doubled before adding the
     * element.
     *
     * @param value the value of the element to be added
     */
    public void add(int value) {
        if (size == array.length) {
            array = Arrays.copyOf(array, size * 2);
        }
        array[size++] = value;
        siftUp(size - 1);
    }

    /**
     * Removes and returns the element with the highest priority from the priority
     * queue.
     *
     * @return the element with the highest priority
     */
    public int extractMax() {
        int max = getMax();
        array[0] = array[--size];
        siftDown(0);
        return max;
    }

    /**
     * Returns the element with the highest priority from the priority queue without
     * removing it.
     *
     * @return the element with the highest priority
     */
    public int getMax() {
        return array[0];
    }

    /**
     * Removes the element at the specified index from the priority queue.
     *
     * @param i the index of the element to be removed
     */
    public void remove(int i) {
        array[i] = Integer.MAX_VALUE;
        siftUp(i);
        extractMax();
    }

    /**
     * Displays the elements in the priority queue.
     */
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    // Method to sift up a value at a specific index in the array
    // The value is swapped with its parent until it is no longer greater than its
    // parent
    private void siftUp(int i) {
        while (i > 0 && array[i] > array[(i - 1) / 2]) {
            swap(i, (i - 1) / 2);
            i = (i - 1) / 2;
        }
    }

    // Method to sift down a value at a specific index in the array
    // The value is swapped with its largest child until it is no longer less than
    // its children
    private void siftDown(int i) {
        int indexMax = i;
        int l = 2 * i + 1;
        if (l < size && array[l] > array[indexMax]) {
            indexMax = l;
        }
        int r = 2 * i + 2;
        if (r < size && array[r] > array[indexMax]) {
            indexMax = r;
        }
        if (i != indexMax) {
            swap(i, indexMax);
            siftDown(indexMax);
        }
    }

    // Method to swap two values in the array
    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Changes the priority of the element at the specified index to the new
     * priority.
     * If the new priority is higher than the old priority, the element is sifted
     * up.
     * If the new priority is lower than the old priority, the element is sifted
     * down.
     *
     * @param index       the index of the element
     * @param newPriority the new priority of the element
     * @throws IllegalArgumentException if the index is out of bounds
     */
    public void changePriorityAtIndex(int index, int newPriority) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        int oldPriority = array[index];
        array[index] = newPriority;
        if (newPriority > oldPriority) {
            siftUp(index);
        } else {
            siftDown(index);
        }
    }
}