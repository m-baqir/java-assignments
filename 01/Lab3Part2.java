import java.util.Scanner;

public class Lab3Part2 {
    public static void main (String [] args){
        System.out.println("Enter a move!");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Rock (1), Paper (2), Scissors (3): ");
        int user_answer = myObj.nextInt();
        int rand = (int)Math.floor(Math.random() * (3 - 1 + 1) + 1);
        String cpu_choice="";
        switch (rand){
            case 1:
                cpu_choice = "Rock.";
                break;
            case 2:
                cpu_choice = "Paper.";
                break;
            case 3:
                cpu_choice = "Scissors.";
                break;
        }
        if (user_answer == 1){
            System.out.println("You have selected Rock, cpu has selected "+cpu_choice);
            if (rand == 3){
                System.out.println("You win!");
            }
            else if (rand == 1){
                System.out.println("It is a tie!");
            }
            else{
                System.out.println("CPU wins!");
            }
        }
        if (user_answer == 2){
            System.out.println("You have selected Paper, cpu has selected "+cpu_choice);
            if (rand == 1){
                System.out.println("You win!");
            }
            else if (rand == 2){
                System.out.println("It is a tie!");
            }
            else{
                System.out.println("CPU wins!");
            }
        }
        if (user_answer == 3){
            System.out.println("You have selected Scissors, cpu has selected "+cpu_choice);
            if (rand == 2){
                System.out.println("You win!");
            }
            else if (rand == 3){
                System.out.println("It is a tie!");
            }
            else{
                System.out.println("CPU wins!");
            }
        }
    }    
}
