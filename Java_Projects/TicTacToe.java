package Java_Projects;

import java.util.Scanner;

public class TicTacToe {
    private char[][] board; // 2D array to represent the Tic-Tac-Toe board
    private char currentPlayer; // Current player: 'X' or 'O'

    // Constructor to initialize the game
    public TicTacToe() {
        board = new char[3][3]; // Initialize the board with 3 rows and 3 columns
        currentPlayer = 'X'; // Start with player 'X'
        initializeBoard(); // Initialize the board with empty cells
    }

    // Method to initialize the board with empty cells
    public void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-'; // Set each cell to '-'
            }
        }
    }

    // Method to print the current board state
    public void printBoard() {
        System.out.println("-------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | "); // Print each cell value
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Method to check if the board is full
    public boolean isBoardFull() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == '-') {
                    return false; // If any cell is empty, the board is not full
                }
            }
        }
        return true; // If all cells are filled, the board is full
    }

    // Method to check for a win
    public boolean checkForWin() {
        return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
    }

    // Method to check for win in rows
    private boolean checkRowsForWin() {
        for (int row = 0; row < 3; row++) {
            if (checkRowCol(board[row][0], board[row][1], board[row][2])) {
                return true; // If any row has all same marks, return true
            }
        }
        return false;
    }

    // Method to check for win in columns
    private boolean checkColumnsForWin() {
        for (int col = 0; col < 3; col++) {
            if (checkRowCol(board[0][col], board[1][col], board[2][col])) {
                return true; // If any column has all same marks, return true
            }
        }
        return false;
    }

    // Method to check for win in diagonals
    private boolean checkDiagonalsForWin() {
        return ((checkRowCol(board[0][0], board[1][1], board[2][2])) || (checkRowCol(board[0][2], board[1][1], board[2][0])));
    }

    // Method to check if three marks are equal
    private boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 != '-') && (c1 == c2) && (c2 == c3));
    }

    // Method to change the current player
    public void changePlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Change player from 'X' to 'O' or vice versa
    }

    // Method to place a mark on the board
    public boolean placeMark(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
            // Check if the given position is within the board boundaries and not already marked
            board[row][col] = currentPlayer; // Place the current player's mark on the board
            return true; // Mark placed successfully
        }
        return false; // Invalid move
    }

    // Main method to run the game
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe(); // Create a new TicTacToe object
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input
        int row, col;

        System.out.println("Welcome to Tic Tac Toe!");

        // Main game loop
        while (!game.isBoardFull() && !game.checkForWin()) {
            game.printBoard(); // Print the current board
            System.out.println("Player " + game.currentPlayer + ", enter your move (row and column):");
            row = scanner.nextInt() - 1; // Read row input from user
            col = scanner.nextInt() - 1; // Read column input from user

            if (game.placeMark(row, col)) { // Try to place the mark on the board
                if (game.checkForWin()) { // Check for win after placing the mark
                    game.printBoard(); // Print the final board
                    System.out.println("Player " + game.currentPlayer + " wins!"); // Declare the winner
                    break; // Exit the game loop
                } else if (game.isBoardFull()) { // Check for tie if the board is full
                    game.printBoard(); // Print the final board
                    System.out.println("It's a tie!"); // Declare a tie
                    break; // Exit the game loop
                } else {
                    game.changePlayer(); // Change player if the game is not over
                }
            } else {
                System.out.println("Invalid move! Try again."); // Print error message for invalid move
            }
        }

        scanner.close(); // Close the scanner
    }
}
