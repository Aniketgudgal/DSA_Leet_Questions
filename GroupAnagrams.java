class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] temp = new String[strs.length];
        for(int i = 0; i < strs.length; i++)
        {
            temp[i] = revChar(strs[i]);
        }
        List<List<String>> al = new ArrayList<>();
         boolean[] visited = new boolean[strs.length];
        for(int i = 0; i < strs.length; i++)
        {
            if (visited[i]) continue;
            List<String> tp = new ArrayList<>();
            tp.add(strs[i]);
            visited[i] = true;
            for(int j = i+1; j < temp.length; j++)
            {
                if(!visited[j] && temp[i].equals(temp[j]))
                {
                    tp.add(strs[j]);
                    visited[j] = true;
                }
            }
            al.add(tp);
        }
        return al;
    }
    public String revChar(String s)
    {
        char ch[] = s.toCharArray();
        for(int i = 0; i < ch.length -1; i++)
        {
            for(int j = i+1; j < ch.length; j++)
            {
                if(ch[i] > ch[j])
                {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        return new String(ch);
    }
}