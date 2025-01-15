/**
Assignment 1
COSC2007
Student: Mohammad Baqir
Student number: 239330870
Peg Solitaire
 */
package COSC2007;

public class Puzzle {
    private char[][] myBoard = {
            { ' ', ' ', 'x', 'x', 'x', ' ', ' ' },
            { ' ', ' ', 'x', 'x', 'x', ' ', ' ' },
            { 'x', 'x', 'x', 'x', 'x', 'x', 'x' },
            { 'x', 'x', 'x', 'o', 'x', 'x', 'x' },
            { 'x', 'x', 'x', 'x', 'x', 'x', 'x' },
            { ' ', ' ', 'x', 'x', 'x', ' ', ' ' },
            { ' ', ' ', 'x', 'x', 'x', ' ', ' ' }
    };

    private int width = myBoard.length;
    private int length = myBoard[width - 1].length;
    private int myPegs = 32;
    private int moveCounter = 1;
    private final String[] MOVEMENTS = { "UP", "DOWN", "LEFT", "RIGHT" };

    public static void main(String[] args) {
        // call constructor
        new Puzzle().Puzzle();
    }

    // constructor
    public void Puzzle() {
        // print initial board
        print();
        System.out.println("Move number: " + moveCounter);
        System.out.println("Thinking... ");
        // if don't find solution print no solution
        if (!findSolution())
            System.out.println("\nNo Solution!");

    }

    private boolean findSolution() {
        // if one peg left and the peg is at the [3][3] location, then game is done
        if (myPegs == 1 && myBoard[3][3] == 'x') {
            System.out.println("Done!");
            print();
            System.out.println("Move number: " + moveCounter);
            return true;
        } else {
            for (int i = 0; i < length; i++)
                for (int j = 0; j < width; j++)
                    for (int k = 0; k < MOVEMENTS.length; k++) {
                        // loop through each of the movements
                        int[][] myMove = moveSetter(j, i, MOVEMENTS[k]);
                        // if move is legal, make the move
                        if (moveLegal(myMove)) {
                            moveMaker(myMove);
                            moveCounter++;
                            // printBoard();
                            // uncomment the line above to see all iterations of the board
                            // make recursive call
                            if (findSolution())
                                return true;
                            else {
                                // if move is wrong undo it and subtract move counter
                                undoMove(myMove);
                                moveCounter--;
                            }
                        }
                    }

            return false;
        }
    }

    // this method sets the move before movement based on the direction of the move
    private int[][] moveSetter(int row, int col, String direction) {
        int[][] move = new int[3][2];
        move[0][0] = row;
        move[0][1] = col;

        switch (direction) {

            case "UP":
                move[1][0] = row + 1;
                move[1][1] = col;
                move[2][0] = row + 2;
                move[2][1] = col;
                break;

            case "LEFT":
                move[1][0] = row;
                move[1][1] = col - 1;
                move[2][0] = row;
                move[2][1] = col - 2;
                break;

            case "RIGHT":
                move[1][0] = row;
                move[1][1] = col + 1;
                move[2][0] = row;
                move[2][1] = col + 2;
                break;

            case "DOWN":
                move[1][0] = row - 1;
                move[1][1] = col;
                move[2][0] = row - 2;
                move[2][1] = col;
                break;

            default:

                break;
        }

        return move;
    }

    // method to verify if move is legal before executing a move
    private boolean moveLegal(int[][] move) {

        if (move[2][0] >= 7 || move[2][1] >= 7 || move[2][0] < 0 || move[2][1] < 0)
            return false;

        return (myBoard[move[0][0]][move[0][1]] == 'x') &&
                (myBoard[move[1][0]][move[1][1]] == 'x') &&
                (myBoard[move[2][0]][move[2][1]] == 'o');
    }

    // based on the set move above, this method executes the move on the board and
    // subtracts peg
    private void moveMaker(int[][] move) {
        myBoard[move[0][0]][move[0][1]] = 'o';
        myBoard[move[1][0]][move[1][1]] = 'o';
        myBoard[move[2][0]][move[2][1]] = 'x';

        myPegs--;
    }

    // if the move is incorrect, this method, undoes it and adds peg back
    private void undoMove(int[][] move) {
        myBoard[move[0][0]][move[0][1]] = 'x';
        myBoard[move[1][0]][move[1][1]] = 'x';
        myBoard[move[2][0]][move[2][1]] = 'o';

        myPegs++;
    }

    // method to print the board
    private void print() {

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(myBoard[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();

    }

}