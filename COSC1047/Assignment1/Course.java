package Assignment1;

import java.util.Arrays;

public class Course {
  private String courseName;
  private String[] students = new String[100];
  private int numberOfStudents = 10;// default value of 10

  public Course(String courseName) {
    this.courseName = courseName;
  }

  public void addStudent(String student) {
    String[] myArray = new String[numberOfStudents];
    for (int i = 0; i < students.length; i++) {
      if (students[i] == null) {
        students[i] = student;
        return;
      }
    }
    myArray = Arrays.copyOf(students, students.length + 1);
    myArray[myArray.length - 1] = student;
  }

  public String[] getStudents() {
    String[] myArray = new String[numberOfStudents];
    myArray = Arrays.copyOf(students, numberOfStudents);
    return myArray;
  }

  public int getNumberOfStudents() {
    return numberOfStudents;
  }

  public String getCourseName() {
    return courseName;
  }

  public void dropStudent(String student) {
    for (int i = 0; i < students.length; i++) {
      if (students[i] == student) {
        students[i] = null;
        return;
      }
    }
  }

  public void clear() {
    students = null;
  }
}
