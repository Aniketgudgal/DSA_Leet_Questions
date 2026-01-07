class Solution {
    public int subarraySum(int[] nums, int k) {
   /* 
   this code has same limition of prefix sum that's why i'm using map
   int left = 0;
    int right = 0;
    int count = 0;
    int sum = 0;
    while(right < nums.length)
    {
        sum += nums[right];
        while(sum > k)
        {
            sum -= nums[left];
            left++;
        }
        if(sum == k)
        {
            count ++;
        }
        right ++;
    }  
    return count;
    */
     Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);   // important for k = 0

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}