package COSC2007;

public class Assignment1 {
    private int[][] board;
    private int move;
    private int[][][] solution;

    public Assignment1() {
        // Initialize the 7x7 board with pegs and holes
        board = new int[][] {
                { 0, 0, 1, 1, 1, 0, 0 },
                { 0, 0, 1, 1, 1, 0, 0 },
                { 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1 },
                { 0, 0, 1, 1, 1, 0, 0 },
                { 0, 0, 1, 1, 1, 0, 0 }
        };
        move = 1;

        // Initialize the solution array
        solution = new int[50][7][7]; // Assuming a maximum of 50 moves
    }

    public void findSolution(int move) {
        if (move > 1) {
            // Store the current board state in the solution array
            for (int i = 0; i < 7; i++) {
                System.arraycopy(board[i], 0, solution[move - 1][i], 0, 7);
            }
        }

        // Iterate through each position on the board
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (isValidMove(i, j)) {
                    // Make the move
                    board[i][j] = 0;
                    board[i - 1][j] = 0;
                    board[i - 2][j] = 1;

                    // Recur for the next move
                    findSolution(move + 1);

                    // Undo the move (backtrack)
                    board[i][j] = 1;
                    board[i - 1][j] = 1;
                    board[i - 2][j] = 0;
                }
            }
        }
    }

    private boolean isValidMove(int i, int j) {
        // Check if the move is within bounds and is a valid jump
        return i >= 2 && board[i][j] == 1 && board[i - 1][j] == 1 && board[i - 2][j] == 0;
    }

    public void print() {
        // Print the current situation of the board
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printSolution() {
        // Print the sequence of resulting intermediate board situations
        for (int i = 1; i <= move - 1; i++) {
            System.out.println("Move " + i + ":");
            for (int j = 0; j < 7; j++) {
                for (int k = 0; k < 7; k++) {
                    System.out.print(solution[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Assignment1 puzzle = new Assignment1();
        for (int i = 1; i < 49; i++) {
            puzzle.print(); // Initial board state
            puzzle.findSolution(i);
            puzzle.printSolution();
        }
    }
}
