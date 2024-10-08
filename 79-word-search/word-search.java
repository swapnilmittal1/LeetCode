class Solution {
    public boolean exist(char[][] board, String word) {
        
        int r = board.length;
        int c = board[0].length;

        boolean[][] visited = new boolean[r][c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(helper(i,j,board,word,visited,0)){
                    return true;
                }
            }
        }
        return false;
    }

    boolean helper(int r, int c, char[][] board, String word, boolean[][] visited, int i) {
        if(word.length() == i) {
            return true;
        }

        if(r < 0 || c < 0 || r >= board.length || c >= board[0].length || visited[r][c] || board[r][c] != word.charAt(i)){
            return false;
        }

        visited[r][c] = true;

        if(helper(r + 1, c, board, word, visited, i + 1) || helper(r - 1, c, board, word, visited, i + 1) || helper(r, c + 1, board, word, visited, i + 1) || helper(r, c - 1, board, word, visited, i + 1)) {
            return true;
        }

        visited[r][c] = false;
        return false;
    }
}