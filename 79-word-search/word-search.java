class Solution {
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(dfs(board, i, j, 0, word)){
                    visited[i][j] = false;
                    return true;
                }
            }
        }
        return false;

    }
    boolean dfs(char[][] board, int r, int c, int index, String word){
        if(word.length() == index){
            return true;
        }
        if(r < 0 || c < 0 || r == board.length || c == board[0].length || board[r][c] != word.charAt(index)|| visited[r][c]){
            return false;
        }
        visited[r][c] = true;

        if(dfs(board, r + 1, c, index + 1, word) || dfs(board, r - 1, c, index + 1, word) || dfs(board, r , c + 1, index + 1, word) || dfs(board, r , c - 1, index + 1, word)){
            return true;
        }
        visited[r][c] = false;
        return false;


    }

}