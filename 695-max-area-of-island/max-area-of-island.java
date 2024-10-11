class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j =0; j < grid[0].length;j++){
                if(grid[i][j] == 1){
                    max = Math.max(max, helper(grid, i, j));
                }
            }
        }
        return max;
        
    }

    int helper(int[][]grid, int r, int c){
        if(r < 0 || c < 0|| r == grid.length || c == grid[0].length || grid[r][c] == 0){
            return 0;
        }

        grid[r][c] = 0;

        return 1 + helper(grid, r+1,c) + helper(grid, r - 1,c) + helper(grid, r, c + 1) + helper(grid, r, c-1);
    }

}