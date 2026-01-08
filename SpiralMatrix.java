class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int srow = 0, scol = 0, erow = m - 1, ecol = n - 1;
        List<Integer> result = new LinkedList<>();
        while(srow <= erow && scol <= ecol)
        {
            // top
            for(int j = scol; j <= ecol; j++)
            {
                result.add(matrix[srow][j]);
            }

            // right
            for(int i = srow + 1; i <= erow; i++)
            {
                result.add(matrix[i][ecol]);
            }

            // bottom 
            for(int j = ecol - 1; j >= scol; j--)
            {
                if(srow == erow)
                {
                    break;
                }
                result.add(matrix[erow][j]);
            }
            
            //left
            for(int i = erow - 1; i>= srow + 1; i--)
            {
                if(scol == ecol)
                {
                    break;
                }
                result.add(matrix[i][scol]);
            }
            srow++; erow--; scol++;ecol--;
        }
        return result;
    }
}