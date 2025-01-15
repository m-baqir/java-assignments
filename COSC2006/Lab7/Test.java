/**
Author: Mohammad Baqir
Student ID: 239330870
Lab 7
Any and all work in this file is my own
 */
package COSC2006.Lab7;

public class Test {
    public static void main(String[] args) {
        SingleSortedLinkedList list = new SingleSortedLinkedList();
        try {
            list.add("Mike");
            System.out.println(list.toString());
            list.add("John");
            System.out.println(list.toString());
            list.add("Smith");
            System.out.println(list.toString());
            list.add("Anderson");
            System.out.println(list.toString());
            list.add("Daisy");
            System.out.println(list.toString());
            list.add("Alex");
            System.out.println(list.toString());
            list.add("Donna");
            System.out.println(list.toString());
            list.add("Andrea");
            System.out.println(list.toString());
            list.add("Daniel");
            System.out.println(list.toString());
            list.add("Donald");
            System.out.println(list.toString());
            System.out.println(list.remove(list.find("Daisy")));
            System.out.println(list.toString());
            System.out.println(list.remove(list.find("Donna")));
            System.out.println(list.toString());
            System.out.println(list.remove(list.find("Daniel")));
            System.out.println(list.toString());
        } catch (ListException ex) {
            System.err.println(ex.getMessage());
        }

    }
}
