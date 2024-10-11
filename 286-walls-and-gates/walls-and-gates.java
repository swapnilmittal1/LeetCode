class Solution {
    public void wallsAndGates(int[][] rooms) {
        Queue<int[]> q = new LinkedList<>();
        int m = rooms.length;
        int n = rooms[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rooms[i][j] == 0) q.add(new int[] { i, j });
            }
        }
        if (q.size() == 0) return;
        int[][] dirs = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int row = cur[0];
            int col = cur[1];
            for (int[] dir : dirs) {
                int x = row + dir[0];
                int y = col + dir[1];
                if (
                    x >= m ||
                    y >= n ||
                    x < 0 ||
                    y < 0 ||
                    rooms[x][y] != Integer.MAX_VALUE
                ) continue;
                q.add(new int[] { x, y });

                rooms[x][y] = rooms[row][col] + 1;
            }
        }
    }
}