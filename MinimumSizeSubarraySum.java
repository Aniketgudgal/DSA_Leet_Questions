class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int minlen = Integer.MAX_VALUE;
        int r = 0;
        int l = 0;
        while(r < nums.length)
        {
            sum += nums[r];
            while(sum > target) // sum is greater than target
            {
                if(sum >= target) // check the condition greater than target
                {
                    if((r-l+1) < minlen) // take min length of subarray
                    {
                        minlen = (r-l+1);
                    }
                }
                sum -= nums[l]; // reduce the sum with left element or left-side value
                l++; // increment left by one
            }
            if(sum >= target)
            {
                if((r-l+1) < minlen) // check min length condition
                {
                    minlen = (r-l+1); // store min length
                }
            }
            r++;
        }
        if(minlen == Integer.MAX_VALUE)
        {
            return 0;
        }
        else
        {
            return minlen;
        }
    }
}