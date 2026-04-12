class Solution {
    Integer[][][] dp;
    public int minimumDistance(String word) {
        dp = new Integer[word.length()][27][27];
        // 1. word, 2. i, 3. position1, 4. position2
        return helper(word, 0, -1,-1);
    }
    public int helper(String word, int i, int pos1, int pos2)
    {
        if(i == word.length())
        {
            return 0;
        }
        int ch = word.charAt(i) - 'A';
        if(dp[i][pos1 + 1][pos2 + 1] != null)
        {
            return dp[i][pos1 + 1][pos2 + 1];
        }
        // first finger
        int dis1 = getDis(ch, pos1) + helper(word, i+1, ch, pos2);

        // second finger
        int dis2 = getDis(ch, pos2) + helper(word, i+1, pos1, ch);
        
        return dp[i][pos1 + 1][pos2 + 1] =  Math.min(dis1, dis2);

    }
    private int getDis(int ch, int pos)
    {
        if(pos == -1)
        {
            return 0;
        }
        int x1 = ch / 6, x2 = pos/6, y1 = ch % 6, y2 = pos % 6;
        return Math.abs(x1- x2) + Math.abs(y1 - y2);

    }
}