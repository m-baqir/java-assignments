import java.util.Scanner;

public class Lab3 {
    public static void main (String[] args){
        int lower = 1, upper = 16, answer=0;
        int randint1 = (int)Math.floor(Math.random() * (upper - lower + 1) + lower);
        int randint2 = (int)Math.floor(Math.random() * (upper - lower + 1) + lower);
        int randop = (int)Math.floor(Math.random() * (4 - 1 + 1) + 1);
        String operator="";
        switch (randop){
            case 1:
                operator = "+";
                answer = randint1+randint2;
                break;
            case 2:
                operator = "-";
                answer = randint1-randint2;
                break;
            case 3:
                operator = "/";
                answer = randint1/randint2;
                break;
            case 4:
                operator = "*";
                answer = randint1*randint2;
                break;
        }
        int user_answer;
        Scanner myObj = new Scanner(System.in);
        System.out.print(randint1+" "+operator+" "+randint2+" = ");
        
        user_answer = myObj.nextInt();
        if (user_answer == answer){
            System.out.print("Correct!");
        }
        else{
            System.out.print("Incorrect! Correct answer is "+answer);
        }
    }    
}
