class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");
         Set<String> exitword = new HashSet<>();
        if(pattern.length() != word.length)
        {
            return false;
        }
        String[] result = new String[26];
        for(int i = 0; i < pattern.length(); i++)
        {
            if(result[pattern.charAt(i) - 'a'] == null)
            {
                 if (exitword.contains(word[i])) {
                    return false;
                }
                result[pattern.charAt(i) - 'a'] = word[i];
                exitword.add(word[i]);
            }
            else if(!result[pattern.charAt(i) - 'a'].equals(word[i]))
            {
                return false;
            }
        }
        return true;
    }
}