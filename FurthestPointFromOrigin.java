class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countR = 0;
        int countL = 0;
        int count_ = 0;
        for(char c: moves.toCharArray())
        {
            if(c == 'R')
            {
                countR++;
            }
            else if(c == 'L')
            {
                countL++;
            }
            else 
            {
                count_++;
            }
        }
        return Math.abs(countR - countL) + count_;
    }
}