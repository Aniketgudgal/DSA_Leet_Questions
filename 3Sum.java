class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        /*
        First Approach
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                for(int k = j +1; k < nums.length; k++)
                {
                    if(nums[i] + nums[j] + nums[k] == 0)
                    {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }
        }
        return new ArrayList<List<Integer>>(set);
        */
        //second approach
        Arrays.sort(nums);
        for(int i = 0; i < nums.length ; i++)
        {
            if(i > 0 && nums[i] == nums[i-1])
            {
                continue;
            }
            int j = i+1;
            int k = nums.length-1;
            while(j < k)
            {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum < 0)
                {
                    j++;
                }
                else if(sum > 0)
                {
                    k--;
                }
                else
                {
                    ArrayList<Integer> al =new ArrayList<>();
                    al.add(nums[i]);
                    al.add(nums[j]);
                    al.add(nums[k]);
                    set.add(al);
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1])
                    {
                        j++;
                    }
                    while( j < k && nums[k] == nums[k+1])
                    {
                        k--;
                    }
                }
            }
        }
        return new ArrayList<List<Integer>>(set);
    }
}