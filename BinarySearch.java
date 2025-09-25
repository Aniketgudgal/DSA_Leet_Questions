class Solution {
    public int search(int[] nums, int target) {
        // using brute force // time complexity is O(n)
        int n= -1;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
            {
                n = i;
                break;
            }
        }
        return n;
    }
}