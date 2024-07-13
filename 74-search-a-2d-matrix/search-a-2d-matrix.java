class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;

        while (row < matrix.length) {
            int column_start = 0;
            int column_end = matrix[row].length - 1;

            if (target > matrix[row][column_end]) {
                row++;
                continue;
            } else {
                while (column_start <= column_end) {
                    int mid = column_start + (column_end - column_start) / 2;

                    if (matrix[row][mid] == target) {
                        return true;
                    } else if (matrix[row][mid] > target) {
                        column_end = mid - 1;
                    } else {
                        column_start = mid + 1;
                    }
                }
                return false; // Target is not in the current row
            }
        }

        return false; // Target not found in any row
    }
}
