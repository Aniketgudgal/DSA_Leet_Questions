class Solution {
    public boolean isHappy(int n) 
    {
        while(n != 0)
        {
            int sum = check(n);
            if(sum == 1)
            {
                return true;
            }
            if(sum == 4)
            {
                break;
            }
            n = sum;
        }
        return false;
    }
    public int check(int n)
    {
        int sq = 0;
        while(n != 0)
        {
            int rem = n % 10;
            sq = sq + rem * rem;
            n /= 10;
        }
        return sq;
    }
}