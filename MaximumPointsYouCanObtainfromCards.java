class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lSum = 0;
        for(int i = 0; i < k; i++)
        {
            lSum += cardPoints[i];
        }
        int max = lSum;
        int rPoint = cardPoints.length - 1;
        int rSum = 0;
        for(int i = k - 1; i >= 0; i--)
        {
            lSum -= cardPoints[i];
            rSum += cardPoints[rPoint];
            rPoint--;
            max = Math.max(max, lSum+rSum);
        }
        return max;
    }
}