class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        double avg = 0.0f;
        for(int i = 0; i < k; i++)
        {
            sum = sum + nums[i];
        }
        avg = (double)sum/k;

        for(int i = k; i < nums.length; i++)
        {
            sum = sum - nums[i - k] + nums[i];
            double cal = (double)sum/k;
            if(cal > avg)
            {
                avg = cal;
            }
        }
        return avg;
    }
}