class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int row = heights.length;
        int column = heights[0].length;

        Set<Integer> pac= new HashSet<>();
        Set<Integer> atl = new HashSet<>();

        for(int r = 0; r < heights.length; r++){
            dfs(r, 0, pac, heights[r][0], heights);
            dfs(r, column - 1, atl, heights[r][column - 1], heights);

        }
        for(int c = 0; c < column;c++){
            dfs(0, c, pac, heights[0][c], heights);
            dfs(row - 1,c, atl, heights[row - 1][c], heights);
        }
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column;j++){
                if(pac.contains(i  * column + j) && atl.contains(i * column + j)){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    ans.add(temp);
                }
            }
        }

        return ans;

    }

    void dfs(int r, int c, Set<Integer> visit, int height, int[][] heights){
        if(r < 0 || c < 0 || r == heights.length || c == heights[0].length || heights[r][c] < height || visit.contains(r * heights[0].length + c)){
            return;
        }

        visit.add(r * heights[0].length + c);

        dfs(r + 1, c, visit, heights[r][c], heights);
        dfs(r - 1, c, visit, heights[r][c], heights);

        dfs(r, c + 1, visit, heights[r][c], heights);

        dfs(r, c - 1, visit, heights[r][c], heights);

        
    }
}