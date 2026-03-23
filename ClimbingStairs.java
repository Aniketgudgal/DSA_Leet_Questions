class Solution {
    public int climbStairs(int n) {
        int[] arr = new int[n+1];
        Arrays.fill(arr,-1);
        return count(arr,n,0);
    }
    private int count(int[] num, int n, int i)
    {
        if(i == n)
        {
            return 1;
        }
        if(i > n)
        {
            return 0;
        }
        if(num[i] != -1)
        {
            return num[i];
        }
        return num[i] = count(num,n,i+1) + count(num,n,i+2);
    }
}