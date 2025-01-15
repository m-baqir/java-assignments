/**
Lab 1 excercise 1
COSC2007
Student: Mohammad Baqir
Student number: 239330870
Write a program to check given string is palindrome or not using recursion
Pesudocode:
if string is empty, then it is palindrome
else, start by looking at the string
if there is one character, it is palindrome
if first and last characters don't match, then it is NOT palindrome
if above holds true, continue checking the substring between the first and last characters using recursive call
 */
package COSC2007;

public class Lab1ex1 {
    static boolean checkit(String str, int s, int e) {
        if (s == e)
            return true;
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;
        if (s < e + 1)
            return checkit(str, s + 1, e - 1);
        return true;
    }

    static boolean isPalindrome(String str) {
        int n = str.length();
        if (n == 0)
            return true;
        return checkit(str, 0, n - 1);
    }

    public static void main(String args[]) {
        String str1 = "tomato";
        if (isPalindrome(str1))
            System.out.println(str1 + " is palindrome");
        else
            System.out.println(str1 + " is not a palindrome");
        String str2 = "civic";
        if (isPalindrome(str2))
            System.out.println(str2 + " is palindrome");
        else
            System.out.println(str2 + " is not a palindrome");
        String str3 = "level";
        if (isPalindrome(str3))
            System.out.println(str3 + " is palindrome");
        else
            System.out.println(str3 + " is not a palindrome");
    }
}
/**
 * the code above checks whether a string is a palindrome or not.
 * the program is tested with 3 different inputs, tomato, civic and level.
 * tomato is not expected to be a palindrome
 * whereas civic and level are both palindromes.
 * 
 */
