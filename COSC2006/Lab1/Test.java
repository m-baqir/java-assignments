/**
Author: Mohammad Baqir
Student ID: 239330870
Lab 1
Any and all work in this file is my own
 */
package COSC2006.Lab1;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Mike Johnson");
        Student student2 = new Student(2, "Alabama George");
        Student student3 = new Student(3, "Ankit Bhatt");
        Student student4 = new Student(4, "Johnny Jones");
        Student student5 = new Student(5, "Mark Smith");
        Student student6 = new Student(6, "Tiara Jimmy");
        Student student7 = new Student(7, "Mohammad Baqir");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());
        System.out.println(student5.toString());
        System.out.println(student6.toString());
        System.out.println(student7.toString());
        student1.setAverage(60);
        student2.setAverage(55);
        student3.setAverage(70);
        student4.setAverage(80);
        student5.setAverage(90);
        student6.setAverage(75);
        student7.setAverage(40);
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());
        System.out.println(student5.toString());
        System.out.println(student6.toString());
        System.out.println(student7.toString());
        Instructor instructor = new Instructor(30, "Kieran Masters", "Social Sciences");
        System.out.println(instructor.toString());
        Course course1 = new Course("COSCcourse1", "DramaQueen");
        Course course2 = new Course("SOC1056", "Sociology");
        course1.setInstructor(instructor);
        course2.setInstructor(instructor);
        System.out.println(course1.toString());
        System.out.println(course2.toString());
        course1.enroll(student7);
        course1.enroll(student6);
        course1.enroll(student5);
        course1.enroll(student4);
        course1.enroll(student3);
        course2.enroll(student2);
        course2.enroll(student1);
        System.out.println(course1.toString());
        System.out.println(course2.toString());
        course1.assignGrade(student7, 72);
        course1.assignGrade(student6, 65);
        course1.assignGrade(student5, 55);
        course1.assignGrade(student4, 42);
        course1.assignGrade(student3, 95);
        course2.assignGrade(student2, 85);
        course2.assignGrade(student1, 81);
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());
        System.out.println(student5.toString());
        System.out.println(student6.toString());
        System.out.println(student7.toString());
        course1.unenroll(student7);
        course1.unenroll(student6);
        System.out.println(course1.toString());
    }
}
