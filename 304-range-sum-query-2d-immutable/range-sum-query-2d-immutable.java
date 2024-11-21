class NumMatrix {
    int[][] arr;
    public NumMatrix(int[][] matrix) {
        int l = matrix.length;
        int w = matrix[0].length;
        arr = matrix;

        for(int i = 1; i < l; i++){
            arr[i][0]  += arr[i-1][0];
        }

        for (int j = 1; j < w; j++) {
            arr[0][j] += arr[0][j - 1];
        }

        for (int i = 1; i < l; i++) {
            for (int j = 1; j < w; j++) {
                arr[i][j] += arr[i - 1][j] + arr[i][j - 1] - arr[i - 1][j - 1];
            }
        }

    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans = arr[row2][col2];

        if (row1 > 0) ans -= arr[row1 - 1][col2];
        if (col1 > 0) ans -= arr[row2][col1 - 1];
        if (row1 > 0 && col1 > 0) ans += arr[row1 - 1][col1 - 1];

        return ans;

    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */