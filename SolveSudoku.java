import java.util.*;

class SolveSudoku{
    static char[][] result;
    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', ' ', ' ', '7', ' ', ' ', ' ', ' '},
            {'6', ' ', ' ', '1', '9', '5', ' ', ' ', ' '},
            {' ', '9', '8', ' ', ' ', ' ', ' ', '6', ' '},
            {'8', ' ', ' ', ' ', '6', ' ', ' ', ' ', '3'},
            {'4', ' ', ' ', '8', ' ', '3', ' ', ' ', '1'},
            {'7', ' ', ' ', ' ', '2', ' ', ' ', ' ', '6'},
            {' ', '6', ' ', ' ', ' ', ' ', '2', '8', ' '},
            {' ', ' ', ' ', '4', '1', '9', ' ', ' ', '5'},
            {' ', ' ', ' ', ' ', '8', ' ', ' ', '7', '9'}
        };
        if (solve(board)){
            System.out.println("Sudoku solved..");
        } else  System.out.println("Sudoku cannot be solved..");
    }

    public static boolean solve(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') continue;

                for (char ch = '1'; ch < '9'; ch++) {
                    if (isValid(board, i, j, ch)) {
                        board[i][j] = ch;
                        if (solve(board)) {
                            return true;
                        }
                        board[i][j] = '.';
                    }
                }
                return false;
            }
        }
        result = board;
        return  true;
    }

    public static boolean isValid(char[][] board, int row, int col, char ch) {
        for (int i = 0; i < 9; i++) {
            if  (board[i][col] == ch || board[row][i] == ch) return false;
        }
        
        int i = ((row/3) * 3);
        int j = ((col/3) * 3);

        for (int  k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                if (board[k + i][l + j] == ch) return false;
            }
        }
        return true;
    }
}