class Solution {
    public int majorityElement(int[] nums) {
        /*  
        // Brute Approach // O(n^2)
        int count = 1;
        int number = nums[0];
        int no = 0;
        for(int i = 0; i < nums.length; i++)
        {
            count = 0;
            number = nums[i];
            for(int j = 1; j < nums.length; j++)
            {
                if(number == nums[j])
                {
                    count++;
                }
            }
            if(count >= (nums.length/2))
            {
                no = number;
            }
        }
        return no;
        */

          /*
          // by using sorting // O(nlog n)
          Arrays.sort(nums);
        int len = (int)(nums.length/2);
        int f = 1;
        int number = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] == nums[i - 1])
            {
                f++;
            }else
            {   number = nums[i];
                f = 1;
            }
                if(f >= len)
                {
                    number = nums[i];
                }
        }
        return number;
        */
        //Moore's Voting Algorithm  // O(n)
        int freq = 0;
        int ans= 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(freq == 0)
            {
                ans = nums[i];
            }

            if(ans == nums[i])
            {
                freq++;
            }
            else
            {
                freq--;
            }
        }
        return ans;
    }
}