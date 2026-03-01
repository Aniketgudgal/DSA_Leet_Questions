class Solution {
    public boolean increasingTriplet(int[] nums) {
        /*
        for(int i = 0; i < nums.length - 2; i++)
        {
            int j= i+1;
            int k = j+1;
            if(nums[i] < nums[j]&& nums[i] < nums[k] && nums[j] < nums[k] )
            {
                return true;
            }
        }
        return false;
        */
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] <= first)
            {
                first = nums[i];
            }
            else if(nums[i] <= second)
            {
                second = nums[i];
            }
            else 
            {
                return true;
            }
        }
        return false;
    }
}