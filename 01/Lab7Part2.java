import java.util.Scanner;

public class Lab7Part2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter list of 10 integers");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = myObj.nextInt();
        }
        int num = numbers[0];
        int counter = 0;
        for (int j = 1; j < 10; j++) {
            if (numbers[j] > num) {
                counter++;
                continue;
            } else {
                counter++;
                break;
            }

        }

        if (counter == 9)
            System.out.println("List is sorted!");
        else
            System.out.println("List is NOT sorted!");

    }
}
