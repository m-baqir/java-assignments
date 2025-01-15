package COSC2006.Assignment1;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println(ArraySum(arr, arr.length));

    }

    public static int ArraySum(int myArray[], int index) {
        if (index <= 0)
            return 0;
        return (ArraySum(myArray, index - 1) + myArray[index - 1]);
    }
}
