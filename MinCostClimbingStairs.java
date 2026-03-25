class Solution {
    public int minCostClimbingStairs(int[] cost) {
       // top down approach of DP
       int[] arr = new int[cost.length +1];
       Arrays.fill(arr,-1);
       return recursion(cost.length,cost,arr);
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