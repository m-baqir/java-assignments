/**
Author: Mohammad Baqir
Student ID: 239330870
Lab 6
Any and all work in this file is my own
 */
package COSC2006.Lab6;

public class Test {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        try {
            list.add("Milk", 0);
            System.out.println(list.toString());
            list.add("Eggs", 1);
            System.out.println(list.toString());
            list.add("Celery", 2);
            System.out.println(list.toString());
            list.add("Bananas", 3);
            System.out.println(list.toString());
            list.add("Apples", 4);
            System.out.println(list.toString());
            list.add("Oranges", 5);
            System.out.println(list.toString());
            list.add("Cookies", 6);
            System.out.println(list.toString());
            list.add("Steak", 7);
            System.out.println(list.toString());
            System.out.println(list.remove(list.find("Celery")));
            System.out.println(list.toString());
            System.out.println(list.remove(list.find("Oranges")));
            System.out.println(list.toString());
        } catch (ListException ex) {
            System.err.println(ex.getMessage());
        }

    }
}
