class Solution {
    public String mergeAlternately(String word1, String word2) {
     int i = 0;
     int j = 0;
     StringBuffer sb = new StringBuffer();
     boolean flag = true;
     while(i < word1.length() && j < word2.length())
     {
        if(flag)
        {
            sb.append(word1.charAt(i));
            i++;
            flag = false;
        }
        else 
        {
            sb.append(word2.charAt(j));
            flag = true;
            j++;
        }
     }  
     while(i < word1.length())
     {
        sb.append(word1.charAt(i));
        i++;
     } 
     while(j < word2.length())
     {
        sb.append(word2.charAt(j));
        j++;
     }
     return sb.toString();
    }
}