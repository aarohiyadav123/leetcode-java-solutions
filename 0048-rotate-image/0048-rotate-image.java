class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] temp = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp[j][i] = matrix[i][j];
            }
        }

        // Reverse each row
        int[][] ans = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ans[i][j] = temp[i][row - 1 - j];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = ans[i][j];
            }
        }
    }
}