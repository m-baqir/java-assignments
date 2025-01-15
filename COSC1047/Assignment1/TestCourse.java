package Assignment1;

import java.util.Arrays;

public class TestCourse {
    public static void main(String[] args) {
        Course myCourse = new Course("TestCourse");
        myCourse.addStudent("Mike");
        myCourse.addStudent("Alex");
        myCourse.addStudent("Daniel");
        myCourse.dropStudent("Mike");
        String[] test = myCourse.getStudents();
        System.out.println(Arrays.toString(test));
    }
}
