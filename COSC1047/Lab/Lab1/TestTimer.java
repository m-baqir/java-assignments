import java.util.Scanner;

public class TestTimer {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Timer[] arr = new Timer[3];
        System.out.print("Enter the first Timer object: ");
        Timer timer1 = new Timer(myObj.nextInt(), myObj.nextInt(), myObj.nextInt());

        System.out.print("Enter the second Timer object: ");
        Timer timer2 = new Timer(myObj.nextInt(), myObj.nextInt(), myObj.nextInt());

        System.out.print("Enter the third Timer object: ");
        Timer timer3 = new Timer(myObj.nextInt(), myObj.nextInt(), myObj.nextInt());
        arr[0] = timer1;
        arr[1] = timer2;
        arr[2] = timer3;
        int sumHour = 0, sumMinutes = 0, sumSeconds = 0;
        for (int i = 0; i < arr.length; i++) {
            sumHour += arr[i].getHours();
            sumMinutes += arr[i].getMinutes();
            sumSeconds += arr[i].getSeconds();
        }
        System.out.println("The total number of hours is " + sumHour);
        System.out.println("The total number of minutes is " + sumMinutes);
        System.out.println("The total number of seconds is " + sumSeconds);
    }
}
