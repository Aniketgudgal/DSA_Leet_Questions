class Solution {
    public int[][] transpose(int[][] matrix) {
        int col = matrix[0].length;
        int row = matrix.length;
        int[][] arr = new int[col][row];
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = matrix[j][i];
            }
        }
        return arr;
    }
}