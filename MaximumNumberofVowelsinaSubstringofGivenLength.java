class Solution {
    public int maxVowels(String s, int k) {
        /*
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < k; i++)
        {
            sb.append(s.charAt(i));
        }
        int max = Integer.MIN_VALUE;
        int count = countVowels(sb);
        if(count > max)
        {
            max = count;
        }
        for(int i = k; i < s.length(); i++)
        {
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));
            count = countVowels(sb);
            if(count > max)
            {
                max = count;
            }
        }
        return max;
        */
        int max = 0;
        int count = 0;

        // First window
        for(int i = 0; i < k; i++) {
            if(isVowel(s.charAt(i))) {
                count++;
            }
        }

        max = count;
         // Sliding window
        for(int i = k; i < s.length(); i++) {

            // Remove left character
            if(isVowel(s.charAt(i - k))) {
                count--;
            }

            // Add new character
            if(isVowel(s.charAt(i))) {
                count++;
            }

            max = Math.max(max, count);
        }

        return max;
    }
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    public int countVowels(StringBuffer sb)
    {
        int count = 0;
        for(int i = 0; i < sb.length(); i++)
        {
            if(sb.charAt(i) == 'A' || sb.charAt(i) == 'E' || sb.charAt(i) == 'I' || sb.charAt(i) == 'O' || sb.charAt(i) == 'U' || sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u')
            count++;
        }
        return count;
    }
}