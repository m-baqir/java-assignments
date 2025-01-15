package COSC2006.Assignment2;

import java.util.Arrays;

public class QuickSortString {

    public static void quickSort(String[] array, int begin, int end) {
        if (begin < end) {
            int index = split(array, begin, end);

            quickSort(array, begin, index - 1);
            quickSort(array, index + 1, end);
        }
    }

    private static int split(String[] array, int begin, int end) {
        String str = array[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (array[j].length() <= str.length()) {
                i++;

                String temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        String temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        String[] input = { "Sun", "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };
        quickSort(input, 0, input.length - 1);
        System.out.println(Arrays.toString(input));
    }
}
