class Solution {
    int height;
    int width;

    public void wallsAndGates(int[][] rooms) {
        height = rooms.length;
        width = rooms[0].length;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (rooms[i][j] == 0) dfs(rooms, i, j, 0);
            }
        }
    }

    void dfs(int[][] rooms, int m, int n, int dis) {
        if (m < 0 || n < 0 || m >= height || n >= width || (dis != 0 && rooms[m][n] <= dis)) {
            return;
        } 
        rooms[m][n] = dis;
        dfs(rooms, m + 1, n, dis + 1);
        dfs(rooms, m - 1, n, dis + 1);
        dfs(rooms, m, n + 1, dis + 1);
        dfs(rooms, m, n - 1, dis + 1);
    }
}