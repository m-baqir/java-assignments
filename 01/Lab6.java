import java.util.Scanner;

public class Lab6 {
    public static final int PASSWORD_LENGTH = 10;
    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String pass = myObj.nextLine();
        System.out.println("A valid password must have \n - At least 10 characters\n" + 
                " - At least one uppercase letter\n" + 
                " - At least one lowercase letter\n" + 
                " - At least one number\n" + 
                " - At least one symbol");
        if (validPass(pass))
            System.out.println("\nPassword meets all requirements.");
        else
            System.out.println("\nInvalid password!");
    }

    public static boolean validPass(String input){

        if (input.length()<PASSWORD_LENGTH) return false;

        int numCount=0,charUpper=0,charLower=0,symCount=0;
        for (int i=0; i<input.length(); i++){
            char c = input.charAt(i);
            if (c >= '0' && c <= '9') numCount++;
            else if (Character.isUpperCase(c)) charUpper++;
            else if (Character.isLowerCase(c)) charLower++;
            else if (c=='~'||c=='`'||c=='!'||c=='@'||c=='#'||c=='$'||c=='%'||c=='^'||c=='&'||c=='*'||c=='('||c==')'||c=='-'||c=='_'||c=='+'||c=='='||c=='{'||c=='}'||c=='['||c==']'||c=='|'||c=='\\'||c==':'||c==';'||c=='"'||c=='<'||c==','||c=='>'||c=='.'||c=='?'||c=='/')symCount++;
        }
        if (numCount<1 || charLower<1 || charUpper<1 || symCount<1) return false;        
        else return true;
    }
    
}
