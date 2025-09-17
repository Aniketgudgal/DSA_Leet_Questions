class Solution {
    public int search(int[] nums, int target) {
        // this is the brute force approach
        // this program time complexity is O(n)
        int result = -1;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target )
            {
                result = i;
                break;
            }
        }
        return result;
    }
}