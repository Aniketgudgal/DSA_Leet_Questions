class Solution {
    public int maxProduct(int[] nums) {
        int product = 1;
        int max = Integer.MIN_VALUE;
        int i=0;
        // forward product
        while(i < nums.length)
        {
           product = product * nums[i];
          max = Math.max(max, product);
           if(product == 0)
           {
            product = 1;
           }
           i++;
        }
        // backward product 
        product = 1;
        i = nums.length - 1;
        while(i >= 0)
        {
           product = product * nums[i];
          max = Math.max(max, product);
           if(product == 0)
           {
            product = 1;
           }
           i--;
        }
        return max;
    }
}