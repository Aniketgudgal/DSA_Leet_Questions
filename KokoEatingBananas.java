class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i = 0; i < piles.length; i++)
        {
            max = Math.max(max,piles[i]);
        }
        int low = 0;
        int high= max;
        while(low <= high)
        {
            int mid = (low + high)/2;
            int total = perBananas(piles, mid);
            if(total <= h)
            {
                high = mid-1;   
            }
            else
            {
                low = mid+1;
            }
        }
        return low;
    }
    public int perBananas(int[] arr, int hours)
    {
        int total = 0;
        for(int i = 0; i < arr.length; i++)
        {
            total += Math.ceil((double)arr[i]/(double)hours);
        }
        return total;
    }
}