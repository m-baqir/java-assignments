import java.util.Random;
public class Lab4Part2 {
    public static void main (String[] args){
        String num1 = Integer.toString((int)Math.floor(Math.random() * (9 - 0 + 1) + 0));
        String num2 = Integer.toString((int)Math.floor(Math.random() * (9 - 0 + 1) + 0));
        String num3 = Integer.toString((int)Math.floor(Math.random() * (9 - 0 + 1) + 0));
        String num4 = Integer.toString((int)Math.floor(Math.random() * (9 - 0 + 1) + 0));
        Random rand = new Random();
        char char1 = (char)(rand.nextInt('Z' - 'A') + 'A');
        char char2 = (char)(rand.nextInt('Z' - 'A') + 'A');
        char char3 = (char)(rand.nextInt('Z' - 'A') + 'A');
        System.out.print(char1+""+char2+""+char3+num1+num2+num3+num4);
    }
}
