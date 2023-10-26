import java.util.ArrayList;

public class LeetCodeNQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        ArrayList<String[]> solutions = new ArrayList<>();
        queens(board, 0, solutions);

        // Combine both solutions into a single array
        String[][] combinedSolutions = new String[solutions.size() * 2][n];
        for (int i = 0; i < solutions.size(); i++) {
            String[] solution = solutions.get(i);
            combinedSolutions[i * 2] = solution;
            // Create the mirrored solution
            String[] mirroredSolution = new String[n];
            for (int j = 0; j < n; j++) {
                StringBuilder sb = new StringBuilder();
                for (int k = 0; k < n; k++) {
                    sb.append(solution[k].charAt(j));
                }
                mirroredSolution[j] = sb.toString();
            }
            combinedSolutions[i * 2 + 1] = mirroredSolution;
        }

        // Print the combined solutions
        for (String[] solution : combinedSolutions) {
            System.out.print("[");
            for (String row : solution) {
                System.out.print("\"" + row + "\",");
            }
            System.out.println("]");
        }
    }

    static void queens(boolean[][] board, int row, ArrayList<String[]> solutions) {
        if (row == board.length) {
            String[] solution = new String[board.length];
            for (int i = 0; i < board.length; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j]) {
                        sb.append("Q");
                    } else {
                        sb.append(".");
                    }
                }
                solution[i] = sb.toString();
            }
            solutions.add(solution);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                queens(board, row + 1, solutions);
                board[row][col] = false;
            }
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // Check if there is a queen in the same column
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // Check upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }

        // Check upper right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }

        return true;
    }
}
