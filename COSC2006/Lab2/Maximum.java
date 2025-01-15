/**
Author: Mohammad Baqir
Student ID: 239330870
Lab 2
Any and all work in this file is my own
 */
package COSC2006.Lab2;

public class Maximum {
    public static void main(String[] args) {
        // print and call method
        System.out.println(maximumChar("COSC2006", '\0'));

    }

    public static char maximumChar(String str, char max) {
        // check if string has length
        if (str.length() > 1) {
            // if first char is greateer then max
            if (str.charAt(0) > max) {
                // assign max value
                max = str.charAt(0);
                // remove first char of string
                str = str.substring(1, str.length() - 0);
                // recurse call to method again
                return maximumChar(str, max);
            } else {
                // if first char is not greater then max then still remove the first char
                str = str.substring(1, str.length() - 0);
                // recurse call the method
                maximumChar(str, max);
                return max;
            }
        } else
            // if str has no length then just return the first char
            return str.charAt(0);
    }
}
