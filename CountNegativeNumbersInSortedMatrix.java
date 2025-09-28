class Solution {
    public int countNegatives(int[][] grid) {
    // normal nested for loop using brute force approach 
    // this code time complexity is O(m*n)
     int count = 0;
     for(int i = 0; i < grid.length; i++)
     {
        for(int j = 0; j < grid[i].length; j++)
        {
            if(grid[i][j] < 0)
            {
                count++;
            }
        }
     }  
     return count; 
    }
}