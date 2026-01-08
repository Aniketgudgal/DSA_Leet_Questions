class Solution {
    public int maximumCount(int[] nums) {
        int post = 0;
        int neg = 0;
        for(int a: nums)
        {
            if(a < 0)
                neg++;
            else if(a > 0)
                post++;
        }
        if(post > neg)
            return post;
        else
            return neg;
    }
}