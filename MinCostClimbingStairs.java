class Solution {
    public int minCostClimbingStairs(int[] cost) {
        /*
       // top down approach of DP
       int[] arr = new int[cost.length +1];
       Arrays.fill(arr,-1);
       return recursion(cost.length,cost,arr);
       */
       /*
       // optimal solution
       int[] arr = new int[cost.length +1];
       arr[0] = 0;
       arr[1] = 0;
       for(int i = 2; i < arr.length; i++)
       {
        arr[i] = Math.min(cost[i-1]+arr[i-1], cost[i-2]+arr[i-2]);
       }
       return arr[arr.length - 1];
       */
       
       // more optimal solution
       int prev1 = 0;
       int prev = 0;
       int minSum = 0;
       for(int i = 2; i <= cost.length; i++)
       {
            minSum = Math.min(cost[i-1]+prev, cost[i-2]+prev1);
            prev1 = prev;
            prev = minSum;
       }
       return minSum;
       
    }
    public int recursion(int n,int[] arr,int[] dp)
    {
        if(n <= 1)
        {
            return 0;
        }
        if(dp[n] != -1)
        {
            return dp[n];
        }
        return dp[n] = Math.min(arr[n-1]+recursion(n-1,arr,dp),arr[n-2]+recursion(n-2,arr,dp));
    }
}