class Solution {
    public int countPartitions(int[] nums) {
      int count = 0;
      int sum = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            int postSum = sum(nums,i);
            int check = sum - postSum;
            if( check > 0&&check % 2 == 0)
            {
                count++;
            }
            else
            {
                check = check *(-1);
                if(check % 2 == 0)
                    count++;
            }
             sum+= nums[i];
        }
        return count;
    }
    static int sum(int[] nums, int start)
    {
        int sumValue = 0;
        for(int  i = start ; i < nums.length; i++)
        {
            sumValue += nums[i];
        }
        return sumValue;
    }
}