class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[] = new int[nums.length];
          int prefix[] = new int[nums.length];
        /*
        // brute force approach 
        int sum = 1;
       for(int i = 0; i < nums.length; i++)
       {
            sum = 1;
           for(int j = 0; j < nums.length; j++)
           {
                if(j != i)
                {
                    sum *= nums[j];
                }
           }
           arr[i] = sum;
       }
       //calculate the prodct of array from left side and shift that towards the left side by 1 index
       prefix[0] = 1;
       for(int i = 1; i < nums.length; i++)
       {
            prefix[i] = prefix[i-1] * nums[i-1]; 
       }
       // calculate the product of array from right side and shift that array towards the left side by 1 index
       int suffix[] = new int[nums.length];
       suffix[nums.length - 1] = 1;
       for(int i = nums.length - 2 ; i >=0; i--)
       {
            suffix[i] = suffix[i+1] * nums[i+1];
       }
       // calculate the product of the both side and store in third array and return that array
       for(int i = 0; i < arr.length; i++)
       {    
            arr[i] = prefix[i] * suffix[i];
       }
       */
       // more optize solution
        // calculate the product of array from right side and shift that array towards the left side by 1 index
       int suffix[] = new int[nums.length];
       suffix[nums.length - 1] = 1;
       for(int i = nums.length - 2 ; i >=0; i--)
       {
            suffix[i] = suffix[i+1] * nums[i+1];
       }
        int prefix1 = 1;
        for(int i = 0; i < arr.length; i++)
       {
            arr[i] = prefix1 * suffix[i];
            prefix1 *= nums[i];
       }
       return arr;
    }
}