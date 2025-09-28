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
       int index = -1;
       int L = 0,mid;
       int R = nums.length - 1;
       while(L <= R)
       {
            mid = L + (R-L)/2; // or (start + end)/2
            if(nums[mid] == target)
            {
                index = mid;
            }
            if(nums[mid] < target)
            {
                L = mid + 1;
            }
            else
            {
                R = mid - 1;
            }
       }
       return index;
    }
}