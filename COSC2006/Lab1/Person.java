/**
Author: Mohammad Baqir
Student ID: 239330870
Lab 1
Any and all work in this file is my own
 */
package COSC2006.Lab1;

public class Person {
    private final int id;
    private String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object p) {
        if (p instanceof Person && (this.getId() == ((Person) p).getId())
                && (((Person) p).getName().equals(this.name)))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Person[id=" + this.id + ", name=" + this.name + "]";
    }
}