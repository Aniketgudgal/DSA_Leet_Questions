class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result=0;
        for(int i = 0; i < s.length(); i++)
        {
            int[] arr = new int[256];
            int count = 0;
            for(int j = i; j < s.length(); j++)
            {
                if(arr[s.charAt(j)] == 1)
                {
                    break;
                }
                count++;
                arr[s.charAt(j)] = 1;
                result = Math.max(result, count);
            }
        }
        return result;
    }
}