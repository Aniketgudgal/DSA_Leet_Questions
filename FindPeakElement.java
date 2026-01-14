class Solution {
    public int findPeakElement(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int index = -1;
        int max = nums[0];
        while(i < j)
        {
            int mid = i + (j-i)/2;
            if(nums[mid] > nums[mid+1])
            {
               j = mid;
            }
           else
           {
            i = mid + 1;
           }
        }
        return i;
    }
}