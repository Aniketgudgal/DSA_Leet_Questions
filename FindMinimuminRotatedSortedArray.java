class Solution {
    public int findMin(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int ans = nums[0];
        while(i <= j)
        {
            int mid = i + (j - i)/2;
            if(nums[mid] >= nums[0])
            {
                i = mid + 1;
            }
            else
            {
                ans = nums[mid];
                j = mid - 1;
            }
        }
        return ans;
    }
}