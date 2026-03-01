class Solution {
    public int largestAltitude(int[] gain) {
        int[] result = new int[gain.length +1];
        result[0]= 0;
        for(int i = 1; i < result.length; i++)
        {
            int g = result[i-1] + gain[i-1];
            result[i] = g;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < result.length; i++)
        {
            if(result[i] > max)
            {
                max = result[i];
            }
        }
        return max;
    }
}