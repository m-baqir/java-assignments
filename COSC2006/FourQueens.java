package COSC2006;

public class FourQueens {

    private static final int QUEENS = 4;

    // constructor
    private static void FourQueens() {
        // start a new 4x4 board
        int[][] myBoard = new int[QUEENS][QUEENS];
        queenHelper(myBoard, 0);
    }

    // helper method to solve the queens problem
    private static void queenHelper(int[][] myBoard, int numQueen) {
        // base case, if all queens are placed
        if (numQueen == QUEENS) {
            print(myBoard);
            return;
        }

        for (int width = 0; width < QUEENS; width++) {
            // check if queen can be placed
            if (isValid(myBoard, numQueen, width)) {
                // queen is placed
                myBoard[numQueen][width] = 1;
                // recursive call
                queenHelper(myBoard, numQueen + 1);
                // backtrack
                myBoard[numQueen][width] = 0;
            }
        }
    }

    private static boolean isValid(int[][] myBoard, int length, int width) {
        // check if queen exists in the same column
        for (int i = 0; i < length; i++) {
            if (myBoard[i][width] == 1) {
                return false;
            }
        }

        // Check left diagonal
        for (int i = length, j = width; i >= 0 && j >= 0; i--, j--) {
            if (myBoard[i][j] == 1) {
                return false;
            }
        }

        // Check right diagonal
        for (int i = length, j = width; i >= 0 && j < QUEENS; i--, j++) {
            if (myBoard[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    // method to print the board
    private static void print(int[][] myBoard) {
        for (int i = 0; i < QUEENS; i++) {
            for (int j = 0; j < QUEENS; j++) {
                System.out.print(myBoard[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // main method
    public static void main(String[] args) {
        FourQueens();
        System.out.print("Mohammad Baqir");
    }
}
