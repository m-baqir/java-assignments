/**
Author: Mohammad Baqir
Student ID: 239330870
Lab 7
Any and all work in this file is my own
 */
package COSC2006.Lab7;

public class SingleNode {

    protected String item;
    protected SingleNode next;

    public SingleNode(String item) {
        this.item = item;
        this.next = null;
    }

    public SingleNode(String item, SingleNode next) {
        this.item = item;
        this.next = next;
    }
}