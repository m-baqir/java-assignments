/**
Author: Mohammad Baqir
Student ID: 239330870
Lab 1
Any and all work in this file is my own
 */
package COSC2006.Lab1;

public class Student extends Person {
    private double average = 0.0;

    Student(int id, String name) {
        super(id, name);
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "Student[id=" + super.getId() + ", name=" + super.getName() + ", GPA=" + this.average + "%]";
    }
}
