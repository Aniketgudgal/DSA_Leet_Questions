class Solution {
    public boolean judgeCircle(String moves) {
        int countU = 0;
        int countD = 0;
        int countL = 0;
        int countR = 0;
        for(int i = 0; i < moves.length(); i++)
        {
            if(moves.charAt(i) == 'U')
            {
                countU++;
            }
            else if(moves.charAt(i) == 'D')
            {
                countD++;
            }
            else if(moves.charAt(i) == 'L')
            {
                countL++;
            }
            else 
            {
                countR++;
            }
        }
        if(countU == countD && countL == countR)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}