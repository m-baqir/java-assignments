package COSC2006.Exam;

import java.util.List;

public class MultiplyMe {

    public static <T extends Number> double multiplyNums(List<T> myList) {
        double myProduct = 1.0;

        for (T number : myList) {
            myProduct *= number.doubleValue();
        }

        return myProduct;
    }

    public static void main(String[] args) {
        List<Integer> myIntList = List.of(1, 2, 3);
        double ans1 = multiplyNums(myIntList);
        System.out.println("Answer 1: " + ans1);

        List<Double> myDoubleList = List.of(1.1, 2.0, 3.0);
        double ans2 = multiplyNums(myDoubleList);
        System.out.println("Answer 2: " + ans2);
    }
}
