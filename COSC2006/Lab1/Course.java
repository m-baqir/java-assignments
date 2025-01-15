/**
Author: Mohammad Baqir
Student ID: 239330870
Lab 1
Any and all work in this file is my own
 */
package COSC2006.Lab1;

public class Course {
    private final int MAX_ENROLLED_STUDENTS = 5;
    private Student[] students = new Student[MAX_ENROLLED_STUDENTS];
    private int enrollment = 0;
    private Instructor instructor = new Instructor(32, "John Smith", "Computer Science");
    private String courseCode;
    private String courseName;

    Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public void enroll(Student student) {
        if (this.enrollment < MAX_ENROLLED_STUDENTS) {
            for (int i = 0; i < students.length; i++) {
                if (students[i] == null) {
                    students[i] = student;
                    enrollment++;
                    break;
                }
            }
        }
    }

    public int getEnrolled() {
        return enrollment;
    }

    public void setEnrolled(int enrollment) {
        this.enrollment = enrollment;
    }

    public void unenroll(Student student) {
        if (this.enrollment > 0) {
            Student[] tempStudents = new Student[students.length + 1];
            int index = -1;
            System.arraycopy(this.students, 0, tempStudents, 0, students.length);
            for (int i = 0; i < students.length; i++) {
                if (tempStudents[i] == student) {
                    tempStudents[i] = null;
                    index = i;
                }
            }
            if (index > -1) {
                for (int j = index; j < students.length; j++) {
                    tempStudents[j] = tempStudents[j + 1];
                }
                students = tempStudents;
                this.setEnrolled(this.enrollment - 1);
            } else {
                System.out.println("Student not in this class");
            }

        }
    }

    public void assignGrade(Student student, double grade) {
        double average = student.getAverage();
        student.setAverage((average + grade) / 2);
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "Course[code=" + this.courseCode + ", name=" + this.courseName + ", instructor=" + instructor.getName()
                + ", enrolled=" + this.enrollment + "]";
    }

    public void setInstructor(Instructor i) {
        this.instructor = i;
    }

    public Instructor getInstructor() {
        return instructor;
    }

}
