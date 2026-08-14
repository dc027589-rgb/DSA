class Solution {

    private boolean isValid(char[][] board, int row, int col, char ch) {

        for (int k = 0; k < 9; k++) {

          
            if (board[row][k] == ch && k != col)
                return false;
 
            if (board[k][col] == ch && k != row)
                return false;

           
            int d1 = 3 * (row / 3) + (k / 3);
            int d2 = 3 * (col / 3) + (k % 3);

            if (board[d1][d2] == ch && (d1 != row || d2 != col))
                return false;
        }

        return true;
    }

    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board.length; j++) {

                if (board[i][j] != '.') {

                    if (!isValid(board, i, j, board[i][j]))
                        return false;
                }
            }
        }

        return true;
    }
}