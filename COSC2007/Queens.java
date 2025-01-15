/**
Lab2
COSC2007
Student: Mohammad Baqir
Student number: 239330870
4-Queens
 */
package COSC2007;

public class Queens {
    public static final int TOTAL_QUEENS = 4;
    private static int[] myQueens = { -1, -1, -1, -1 };

    private static boolean mySearch() {
        // calls mySearch Helper given the initial position and moves
        return mySearchHelper(0, 0);
    }

    private static boolean mySearchHelper(int position, int myMoves) {
        if (position == TOTAL_QUEENS) {
            // Base case: All queens are placed successfully
            System.out.println("\nMoves: " + myMoves);
            printBoard(myQueens);
            return true;
        }

        int current = findPosition(position);
        if (current < 0) {
            // No valid position found for the current queen
            // undo the move
            myQueens[position] = -1;
            return mySearchHelper(position - 1, myMoves);
        } else {
            // Place the queen at the valid position
            myQueens[position] = current;
            System.out.println("\nMoves: " + ++myMoves);
            printBoard(myQueens);
            return mySearchHelper(position + 1, myMoves);
        }
    }

    // method to find position given a position in the array
    public static int findPosition(int position) {
        int current = myQueens[position] + 1;

        for (int i = current; i < TOTAL_QUEENS; i++) {
            // if position is valid then return the position index
            if (isValid(position, i)) {
                return i;
            }
        }
        // if not found, return -1
        return -1;
    }

    // method to determine if a move is valid
    public static boolean isValid(int myRow, int myColumn) {
        for (int i = 1; i <= myRow; i++) {
            if (myQueens[myRow - i] == myColumn || myQueens[myRow - i] == myColumn - i
                    || myQueens[myRow - i] == myColumn + i) {
                return false;
            }
        }
        return true;
    }

    // method for displaying the board
    private static void printBoard(int[] myBoard) {
        // myBoard array is printed 4 times to display the board
        for (int i = 0; i < myBoard.length; i++) {
            // for-each loop for printing the array based on if value is 0 or i
            for (int current : myBoard) {
                if (current == i) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }

    // main
    public static void main(String[] args) {
        // calls mySearch method
        mySearch();

    }

}
