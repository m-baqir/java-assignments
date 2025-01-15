package COSC2006.Assignment2;

public class Test {
    public static void main(String[] args) {
        /*
         * ArrayList<Integer> list = new ArrayList();
         * list.add(5);
         * list.add(10);
         * list.add(15);
         * System.out.println(list.size());
         * System.out.println(list.get(1));
         * ArrayList<String> list2 = new ArrayList();
         * list2.add("Apple");
         * list2.add("Banana");
         * list2.remove(0);
         * System.out.println(list2.size());
         * System.out.println(list2.get(0));
         */
        // dynamic list
        DynamicList<Integer> dynamicList = new DynamicList<>();
        dynamicList.add(5);
        dynamicList.add(10);
        dynamicList.add(15);
        System.out.println(dynamicList.size());
        System.out.println(dynamicList.get(1));
        DynamicList<String> dynamicList2 = new DynamicList<>();
        dynamicList2.add("Apple");
        dynamicList2.add("Banana");
        dynamicList2.remove(0);
        System.out.println(dynamicList2.size());
        System.out.println(dynamicList2.get(0));
    }
}
