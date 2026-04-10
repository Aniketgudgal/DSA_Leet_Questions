class Solution {
    public int minimumDistance(int[] nums) {
        if(nums.length <= 2)
        {
            return -1;
        }
        int max  = nums.length +1;
        for(int i = 0; i < nums.length -2; i++)
        {
            for(int j = i+1; j < nums.length - 1; j++)
            {
                if(nums[i] != nums[j])
                {
                    continue;
                }
                for(int k = j+1; k < nums.length; k++)
                {
                    if(nums[j] == nums[k])
                    {
                        max = Math.min(max,(k-i));
                        break;
                    }
                }
            }
        }
        return max == nums.length + 1 ? -1 : max*2;
    }
}