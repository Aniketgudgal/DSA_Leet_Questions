class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String, Integer> map = new HashMap<>();
        
        // Store rows
        for(int[] row : grid){
            String key = Arrays.toString(row);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        
        int count = 0;
        
        // Check columns
        for(int j = 0; j < n; j++){
            int[] col = new int[n];
            
            for(int i = 0; i < n; i++){
                col[i] = grid[i][j];
            }
            
            String key = Arrays.toString(col);
            
            if(map.containsKey(key)){
                count += map.get(key);
            }
        }
        
        return count;
    }
}