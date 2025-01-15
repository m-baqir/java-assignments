import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("How many students are in the class?");
        int students = myObj.nextInt();
        int[] marks = new int[students];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter grade for student #" + (i + 1));
            marks[i] = myObj.nextInt();
        }
        int max = largest(marks);
        int min = smallest(marks);
        for (int i = 0; i < marks.length; i++) {
            char grade;
            int currentMark = marks[i];
            if (currentMark >= (max - 5))
                grade = 'A';
            else if (currentMark >= (max - 10) && currentMark < (max - 5))
                grade = 'B';
            else if (currentMark >= (max - 15) && currentMark < (max - 10))
                grade = 'C';
            else if (currentMark >= (max - 20) && currentMark < (max - 15))
                grade = 'D';
            else
                grade = 'F';
            System.out.println("Student #" + (i + 1) + ": " + grade);
        }
        System.out.println("Highest score: " + (double) max);
        System.out.println("Lowest score: " + (double) min);
    }

    public static int largest(int[] marks) {
        int max = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > max)
                max = marks[i];
        }
        return max;
    }

    public static int smallest(int[] marks) {
        int min = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < min)
                min = marks[i];
        }
        return min;
    }
}
