class Solution {
    public boolean containsDuplicate(int[] nums) {
        // sort the given array
        Arrays.sort(nums);
        // checking the distinct
        boolean flag = false;
        int count = 0;
        // two pointer technique approach
        for(int i = 0; i < nums.length - 1; i++)
        {
            int j = i+1;
            if(nums[i] == nums[j]) // if number comes in twice and checking the both numbers are same or not
            {
                flag = true;
                count++;
            }
        }
        // checking the flag value and count is must be grater than 1 and return the value from array true or false
        if(flag && count > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}