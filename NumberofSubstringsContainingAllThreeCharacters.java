class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
         int[] result = {-1,-1,-1};
        for(int i = 0; i < s.length(); i++)
        {
            result[s.charAt(i)-'a'] = i;
            if(result[0] != -1 && result[1] != -1 && result[2] != -1)
                count = count +(1+ min(result[0],result[1], result[2])); 
        }
        return count;
    }
    public int min(int a, int b, int c)
    {
        if(a < b && a < c)
        {
            return a;
        }
        else if(b < a && b < c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
}