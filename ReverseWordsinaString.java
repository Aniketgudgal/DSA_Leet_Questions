class Solution {
    public String reverseWords(String s) {
        s = " "+s;
    StringBuffer sb = new StringBuffer();
    StringBuffer result = new StringBuffer();
       for(int i = s.length() -1; i  >= 0; i--)
       {
            if(s.charAt(i) == ' ')
            {
                if(sb.length() > 0)
                {
                result.append(sb.reverse()).append(" ");
                sb.setLength(0);
                }
            }
            else
            {
                sb.append(s.charAt(i));
            }
       }    
       return result.toString().trim();
    }
}