class Solution {
    public int[] leftRightDifference(int[] nums) {
      int[] left = new int[nums.length]; 
      int sum = 0;
      for(int i = 0; i < left.length; i++)
      {
        left[i] = sum;
        sum+= nums[i];
      }
      int[] right = new int[nums.length];
      sum = 0;
      for(int i = right.length - 1; i >= 0; i--)
      {
        right[i] = sum;
        sum+= nums[i];
      }
      for(int i = 0; i < nums.length; i++)
      {
        nums[i] = Math.abs(right[i] - left[i]);
      }
      return nums;
    }
}