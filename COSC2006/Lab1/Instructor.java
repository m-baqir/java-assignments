/**
Author: Mohammad Baqir
Student ID: 239330870
Lab 1
Any and all work in this file is my own
 */
package COSC2006.Lab1;

public class Instructor extends Person {
    private String department;

    Instructor(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Instructor[id=" + super.getId() + ", name=" + super.getName() + ", department=" + this.department + "]";
    }
}
