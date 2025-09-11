class Solution {
    public int maxArea(int[] height) 
    {
       
       /*
       // brute force approach
        int maxW = 0;
        for(int i = 0; i < height.length-1; i++)
        {
            for(int j = i+1; j < height.length; j++)
            {
                int w = j - i;
                int h = Math.min(height[i],height[j]);
                int area = w*h;
                maxW = Math.max(maxW,area);
            }
        }
        return maxW;
        */

        // two pointer approach
        int maxW = 0;
        int j = height.length - 1;
        int i = 0;
        while(i < j)
        {
            int w = j -i; // widtof container 
            int h = Math.min(height[i],height[j]); // height of container
            int area = w*h; // calculate the area
            maxW = Math.max(maxW,area);
            if(height[i] > height[j])
            {
                j --;
            }
            else
            {
                i++;
            }
        }
        return maxW;
    }
}