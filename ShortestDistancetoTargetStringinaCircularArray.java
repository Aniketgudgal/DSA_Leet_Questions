class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int minLen = Integer.MAX_VALUE;
        for(int i = 0; i < words.length; i++)
        {
            if(words[i].equals(target))
            {
                int dir = Math.abs(i - startIndex);
                int cir = words.length - dir;
                int md = Math.min(cir, dir);
                minLen = Math.min(minLen, md);
            }
        }
        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }
}