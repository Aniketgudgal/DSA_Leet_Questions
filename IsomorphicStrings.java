class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
      /*
        s = encoding(s);
        t = encoding(t);
        if(s.equals(t))
        {
            return true;
        }
        else
        {
            return false;
        }
        */
        char[] ch1 = new char[256]; // foo
        char[] ch2 = new char[256]; // bar
        for(int i = 0; i < s.length(); i++)
        {
            if(ch1[s.charAt(i)] == 0 && ch2[t.charAt(i)] == 0)
            {
                ch1[s.charAt(i)] = t.charAt(i);
                ch2[t.charAt(i)] = s.charAt(i);
            }
            else
            {
                if(ch1[s.charAt(i)] != t.charAt(i) || ch2[t.charAt(i)] != s.charAt(i))
                    return false;
            }
        }
        return true;
    }
    public String encoding(String s)
    {
        int[] m = new int[256];
        String result = "";
        int count = 1;
        for(int i = 0; i < s.length(); i++)
        {
            if(m[s.charAt(i)] == 0)
            {
                m[s.charAt(i)] = count++;
            }
            result += m[s.charAt(i)];
        }
        return result;
    }
}