package COSC2006.Exam;

public class Factorial {

    public static void main(String[] args) {
        int n = 5;
        long result = factorialCalc(n);

        System.out.println("Factorial of " + n + " is " + result);
    }

    public static long factorialCalc(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
    /*
     * in a simple algorithm like calculating factorial of a number, the iterative
     * approach is less space complex.
     * it uses constant space O(1) whereas recursive approach would use linear space
     * O(n).
     * The recursive approach adds a new stack each time.
     */
}
