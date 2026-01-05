class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = i; j < matrix[i].length; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m/2; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][m-j-1];
                matrix[i][m-j-1] = temp;
            }
        }
    }
}