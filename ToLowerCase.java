class Solution {
    public String toLowerCase(String s) {
        char ch[] = new char[s.length()];
        for(int i= 0; i < s.length(); i++)
        {
            ch[i] = s.charAt(i);
        }
        for(int i= 0; i < ch.length; i++)
        {
            if(ch[i] >= 65 && ch[i] <= 90)
            {
                ch[i] = (char)(ch[i] + 32);
            }
        }
        String str = String.valueOf(ch);
        return str;
    }
}