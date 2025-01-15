package COSC2006.Midterm;

public class Reverse {

    public static void main(String[] args) {

        System.out.println(reverseStr("COSC"));
        System.out.println(reverseStr("2006"));
    }

    public static String reverseStr(String str) {

        if (str.isEmpty() || str.length() == 1) {
            return str;
        } else {
            return reverseStr(str.substring(1)) + str.charAt(0);
        }
    }
}
