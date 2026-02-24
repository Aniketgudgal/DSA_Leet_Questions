class Solution {
    public boolean canPlaceFlowers(int[] fl, int n) {
        int firstIndex = -1;
        int lastIndex = -1;
        int max = 0;
        for(int i = 0; i < fl.length; i++)
        {
            if(fl[i] == 0)
            {
                continue;
            }
            else if(firstIndex == -1)
            {
                firstIndex = i;
                lastIndex = i;
            }
            else
            {
                lastIndex = i;
            }
        }
        if(firstIndex == -1)
        {
            max = (fl.length+ 1)/2;
        }
        else
        {
            int left = firstIndex;
            int right = fl.length - 1 - lastIndex;
            max = left / 2;
            max += right/2;

            int count = 0;
            for(int i = firstIndex + 1; i < lastIndex; i++)
            {
                if(fl[i] == 0)
                {
                    count++;
                }
                else 
                {
                    max += (count - 1)/2;
                    count = 0;
                }
            } 
            max += (count - 1)/2;
        }
        return n <= max;
    }
}