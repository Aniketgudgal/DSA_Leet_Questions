class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length())
        {
            return -1;
        }
        int k = 0;
        int index = -1;
        for(int i = 0; i < haystack.length(); i++)
        {
            if(k < needle.length() && haystack.charAt(i) == needle.charAt(k))
            {
                 if (k == 0) {
                    index = i;   // start of match
                }
                k++;
                if (k == needle.length()) {
                    return index; // full match found
                }
            }
            else
            {
                 //RESET when mismatch happens
                if (k > 0) {
                    i = index;   // go back to next position after start
                }
                k = 0;
                index = -1;
            }
        }
        return -1;
    }
}