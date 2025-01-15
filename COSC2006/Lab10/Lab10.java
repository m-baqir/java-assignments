/**
Author: Mohammad Baqir
Student ID: 239330870
Lab 10
Any and all work in this file is my own
 */
package COSC2006.Lab10;

import java.util.Arrays;

public class Lab10 {
    // Searching, part 1
    public static int SequentialSearch(int[] array, int k) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == k) {
                return i;
            }
        }
        return -1;
    }

    // Sorting, part 1
    public static void BubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int copy = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = copy;
                }
            }
        }
    }

    // Searching, part 2
    public static int BinarySearch(int[] array, int start, int end, int k) {
        if (start < 0 || start >= array.length || end < 0 || end >= array.length || start > end) {
            return -1;
        } else {
            int middle = (start + end) / 2;
            if (array[middle] == k) {
                return middle;
            } else if (k < array[middle]) {
                return BinarySearch(array, start, middle, k);
            } else if (k > array[middle]) {
                return BinarySearch(array, middle + 1, end, k);
            } else {
                return -1;
            }
        }
    }

    // Sorting, part 2
    public static int[] MergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        } else {
            int middle = array.length / 2;

            int b[] = new int[middle];
            int c[] = new int[array.length - middle];
            System.arraycopy(array, 0, b, 0, b.length);
            System.arraycopy(array, middle, c, 0, c.length);
            b = MergeSort(b);
            c = MergeSort(c);
            return array = merge(b, c);
        }
    }

    public static int[] merge(int a[], int b[]) {
        int result[] = new int[a.length + b.length];
        int aPos = 0;
        int bPos = 0;
        int i = 0;
        while (aPos < a.length && bPos < b.length) {
            if (a[aPos] > b[bPos]) {
                result[i] = a[aPos];
                i++;
                aPos++;
            } else {
                result[i] = b[bPos];
                i++;
                bPos++;
            }

        }

        while (aPos < a.length) {
            result[i] = a[aPos];
            i++;
            aPos++;
        }

        while (bPos < b.length) {
            result[i] = b[bPos];
            i++;
            bPos++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = { 10, 20, 15, 25, 2, 8, 5, 32, 54, 9, 4, 6, 1, 55, 97, 45 };

        System.out.println("seqSearch(array, 8) = " + SequentialSearch(array, 8));

        System.out.println("Before bubbleSort: " + Arrays.toString(array));
        BubbleSort(array);
        System.out.println("After bubbleSort: " + Arrays.toString(array));

        System.out.println("binarySearch(array, 0, 10, 20) = " + BinarySearch(array, 0, 10, 20));

        int[] array2 = { 10, 20, 15, 25, 2, 8, 5, 32, 54, 9, 4, 6, 1, 55, 97, 45 };
        System.out.println("Before mergeSort: " + Arrays.toString(array2));
        array2 = MergeSort(array2);
        System.out.println("After mergeSort: " + Arrays.toString(array2));

    }
}