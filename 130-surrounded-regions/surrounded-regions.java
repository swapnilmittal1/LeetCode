class Solution {
    public void solve(char[][] board) {
        int row = board.length;
        int column = board[0].length;


        for(int i = 0; i < row; i++){
            for(int j = 0;j < column; j++){
                if (i == 0 || j == 0 || i == row - 1 || j == column - 1) {
                    capture(i,j,board);
                }
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0;j < column; j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
                if(board[i][j] == 'R'){
                    board[i][j] = 'O';
                }
            }
        }

    }

    void capture(int r, int c, char[][] board){
        if(r < 0 || c < 0 || r == board.length || c == board[0].length || board[r][c] != 'O'){
            return;
        }

        board[r][c] = 'R';
        capture(r + 1, c, board);
        capture(r, c - 1, board);
        capture(r, c + 1, board);
        capture(r - 1, c, board);
    }
}