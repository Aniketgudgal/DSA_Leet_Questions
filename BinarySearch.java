class Solution {
    public int search(int[] nums, int target) {
        // using brute force
        /*
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
        */
        //using binary search
        int start = 0; 
        int end = nums.length - 1;
        while(start <= end)
        {
            int mid = (start + end)/2;
            if(target == nums[mid])
            {
                return mid;
            }
            if(target > nums[mid])
            {
                start = mid + 1;
            }
            else if(target < nums[mid])
            {
                end = mid - 1;
            }
        }
        return -1;
    }
}