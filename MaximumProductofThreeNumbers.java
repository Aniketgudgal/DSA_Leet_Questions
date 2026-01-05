class Solution {
    public int maximumProduct(int[] nums) {
       Arrays.sort(nums);
        int end = nums.length - 1;
        int arr1 = nums[end] * nums[end-1] * nums[end-2];
        int arr2 = nums[0] *nums[1]*nums[end];
        return Math.max(arr2,arr1);
    }
}