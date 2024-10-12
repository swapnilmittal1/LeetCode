class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> list = new LinkedList<>();

        int fresh = 0;
        int time = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    fresh++;
                }
                if(grid[i][j] == 2){
                    list.offer(new int[]{i,j});
                }
            }
        }
        
        while(!list.isEmpty() && fresh > 0){
            int sizeList = list.size();

            for(int lm = 0; lm < sizeList; lm++){
            int[] arr = list.poll();
            int r = arr[0];
            int c = arr[1];

            if(r + 1 < grid.length && grid[r + 1][c] == 1){
                grid[r + 1][c] = 2;
                list.offer(new int[]{r + 1,c});
                fresh--;
            }
            if(c + 1 < grid[0].length && grid[r][c + 1] == 1){
                grid[r][c + 1] = 2;
                list.offer(new int[]{r,c + 1});
                fresh--;
            }
            if(r - 1 >= 0 && grid[r - 1][c] == 1){
                grid[r - 1][c] = 2;
                list.offer(new int[]{r - 1,c});
                fresh--;
            }
            if(c - 1 >= 0 && grid[r][c - 1] == 1){
                grid[r][c - 1] = 2;
                list.offer(new int[]{r,c - 1});
                fresh--;
            }

        }
        time++;                        
}

        return fresh == 0 ? time : -1;
    }
}

