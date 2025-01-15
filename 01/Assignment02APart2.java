import java.util.Scanner;

public class Assignment02APart2 {
    public static void main(String[] args) {
    double investment, rate, result;
    int years;
    Scanner myObj = new Scanner(System.in);
    //get investment value from user
    System.out.println("Please enter the investment amount:");
    investment = myObj.nextDouble();
    //I have the logic below to test whether the user input is a string. I chose not to implement it because java already checks for this because it is expecting a double from the user.
    /* String investStr = investment+"";
    for (int i = 0; i <investStr.length(); i++){
        if (Character.isDigit(investStr.charAt(i)) == false){
            System.out.println("Invalid input of a String or Character. Please enter and investment amount of more then 0");
        }
    } */
    //while loop to check if user input is less then or equal to 0
    while (investment<=0){
       System.out.println("Please enter an investment amount of more then 0");
       investment = myObj.nextDouble();
    }
    //get interest rate
    System.out.println("Please enter the monthly interest rate:");
    rate = myObj.nextDouble();
    //get number of years
    System.out.println("Please enter the number of years:");
    years = myObj.nextInt();
    //add 1 to rate
    rate++;
    //interest formula
    result = investment*Math.pow(rate, years);
    System.out.printf("The future value of the investment is: %.2f" , result);
  }
}
