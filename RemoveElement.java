class Solution {
    public int removeElement(int[] nums, int val) {
        int count=1;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i]!= val)
            {
                ans.add(nums[i]);
            }
        }
        int j=0;
        for(int i:ans)
        {
            nums[j++]=i;
        }
        return ans.size();
    }
}