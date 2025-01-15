package COSC2006.Assignment1;

public class Employee implements Comparable<Employee> {
    private int age;
    private String name;

    Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Employee e) {
        if (e.age == this.age && e.name.equals(this.name))
            return 1;
        else if (e.age == this.age)
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(30, "John");
        Employee e2 = new Employee(30, "Jane");
        System.out.println(e1.compareTo(e2));

    }
}
