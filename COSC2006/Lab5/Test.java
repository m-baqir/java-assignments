/**
Author: Mohammad Baqir
Student ID: 239330870
Lab 5
Any and all work in this file is my own
 */
package COSC2006.Lab5;

public class Test {
    public static void swap(ADTList list, int i, int j) {
        try {
            String objectI = list.get(i);
            String objectJ = list.get(j);

            list.remove(i);
            list.add(objectJ, i);

            list.remove(j);
            list.add(objectI, j);
        } catch (ListException e) {
            System.out.println("Error: Swap failed");
        }
    }

    public static void main(String[] args) throws ListException {
        String[] myArray = { "Milk" };
        ADTList list = new ADTList(myArray, 8);
        list.add("Eggs", 1);
        System.out.println("List print: " + list.toString());
        list.add("Celery", 2);
        System.out.println("List print: " + list.toString());
        list.add("Bananas", 3);
        System.out.println("List print: " + list.toString());
        list.add("Apples", 4);
        System.out.println("List print: " + list.toString());
        list.add("Oranges", 5);
        System.out.println("List print: " + list.toString());
        list.add("Cookies", 6);
        System.out.println("List print: " + list.toString());
        list.add("Steak", 7);
        System.out.println("List print: " + list.toString());
        int celeryIndex = list.find("Celery");
        list.remove(celeryIndex);
        System.out.println("List print: " + list.toString());
        int orangeIndex = list.find("Oranges");
        list.remove(orangeIndex);
        System.out.println("Orange removed: " + list.toString());
        swap(list, 1, 4);
        System.out.println("List print: " + list.toString());
        swap(list, 0, 2);
        System.out.println("List print: " + list.toString());
    }
}
