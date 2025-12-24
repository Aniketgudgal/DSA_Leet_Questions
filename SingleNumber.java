class Solution {
    public int singleNumber(int[] nums) {
        int number = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            count = 0;
            for(int j = 0; j < nums.length; j++)
            {
                if(nums[i] == nums[j])
                {
                    count++;
                }
            }
            if(count < 2)
            {
                number = nums[i];
            }
        }
        return number;
    }
}