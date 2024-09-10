package pl.wojtyna.mydesignisbetter.chess.designA;

import java.util.Scanner;

public class SimpleChess {

    public static void main(String[] args) {
        // Initialize the chess board as a 2D array
        String[][] board = {
            {"R", "N", "B", "Q", "K", "B", "N", "R"},
            {"P", "P", "P", "P", "P", "P", "P", "P"},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {"p", "p", "p", "p", "p", "p", "p", "p"},
            {"r", "n", "b", "q", "k", "b", "n", "r"}
        };

        Scanner scanner = new Scanner(System.in);
        boolean isWhiteTurn = true;

        while (true) {
            printBoard(board);

            // Prompt the current player for their move
            System.out.println((isWhiteTurn ? "White" : "Black") + "'s turn.");
            System.out.print("Enter your move (e.g., e2 e4): ");
            String move = scanner.nextLine();
            String[] parts = move.split(" ");

            // Convert input like "e2" into row/column indices
            int fromRow = 8 - Character.getNumericValue(parts[0].charAt(1));
            int fromCol = parts[0].charAt(0) - 'a';
            int toRow = 8 - Character.getNumericValue(parts[1].charAt(1));
            int toCol = parts[1].charAt(0) - 'a';

            // Check if the move is valid (very basic validation)
            if (isValidMove(board, fromRow, fromCol, toRow, toCol, isWhiteTurn)) {
                // Make the move
                board[toRow][toCol] = board[fromRow][fromCol];
                board[fromRow][fromCol] = " ";

                // Switch turns
                isWhiteTurn = !isWhiteTurn;
            } else {
                System.out.println("Invalid move, try again.");
            }
        }
    }

    // Simple method to print the board
    public static void printBoard(String[][] board) {
        System.out.println("  a b c d e f g h");
        for (int row = 0; row < board.length; row++) {
            System.out.print((8 - row) + " ");
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println(8 - row);
        }
        System.out.println("  a b c d e f g h");
    }

    // Basic validation for pawn moves (can be extended for other pieces)
    public static boolean isValidMove(String[][] board, int fromRow, int fromCol, int toRow, int toCol, boolean isWhiteTurn) {
        String piece = board[fromRow][fromCol];

        // Check if the piece belongs to the current player
        if (!(isWhiteTurn && piece.equals(piece.toLowerCase()) || !isWhiteTurn && piece.equals(piece.toUpperCase()))) {
            return false;
        }

        // Validate basic pawn moves (no captures, no en passant)
        if (piece.equalsIgnoreCase("P")) {
            int direction = isWhiteTurn ? -1 : 1; // White pawns move up, black pawns move down

            // Single step move
            if (fromCol == toCol && board[toRow][toCol].equals(" ") && toRow == fromRow + direction) {
                return true;
            }

            // Double step move from starting position
            if (fromCol == toCol && board[toRow][toCol].equals(" ") && (fromRow == 6 || fromRow == 1) && toRow == fromRow + 2 * direction) {
                return true;
            }
        }

        return false;
    }
}

