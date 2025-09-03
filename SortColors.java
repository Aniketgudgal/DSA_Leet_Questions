class Solution {
    public void sortColors(int[] nums) {
       int i = 0;
       while(i < nums.length - 1)
       {
            int j = i+1;
            while(j < nums.length)
            {
                if(nums[i] > nums[j])
                {
                  nums[i] = nums[i] + nums[j];
                  nums[j] = nums[i] - nums[j];
                  nums[i] = nums[i] - nums[j];
                  
                }
                else
                {
                    j++;
                }
            }
            i++;
       } 
    }
}