package COSC2006.Midterm;

import java.util.Arrays;
import java.util.List;

public class RecursiveGeneric {

    public static <T> T getLast(List<T> myList) {
        if (myList.size() == 1) {
            return myList.get(0);
        } else {
            return getLast(myList.subList(1, myList.size()));
        }
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3);
        Integer last1 = getLast(list);
        System.out.println(last1);

        List<String> list2 = List.of("A", "B", "C");
        String last2 = getLast(list2);
        System.out.println(last2);
    }
}
