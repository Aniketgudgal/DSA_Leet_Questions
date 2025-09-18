class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // burte force approach for this example
        int arr[] = new int[2]; // taking array with size 2 because the we have to return the 2 index
        int k = 0;  // that array having handling variable k
        for(int i = 0; i < nums.length - 1; i++) // checking first value or first pointer
        {
           for(int j = i+1; j <nums.length; j++) // this is the second pointer
           {
                if(nums[i] + nums[j] == target) // checking the two pointer sum == target if yes then excute the if block
                {
                    arr[k++] = i; // in first index store the i value or first pointer index
                    arr[k] = j;    // in second index store the j value or second pointer index
                }
           }
        }
        return arr; // return the array from function beacuse the function is type of array function
    }
}