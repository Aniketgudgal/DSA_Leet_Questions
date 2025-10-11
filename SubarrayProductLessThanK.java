class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l = 0, r = 0, product = 1;
        int count = 0;
		while(r < nums.length)
		{
            product *= nums[r];
            while(product >= k && l <= r )
            {
                product /= nums[l];
                l++;
            }
            if(product < k)
            {
               count += (r-l+1);
            }
			r++;
		}
        return count;
    }
}