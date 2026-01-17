class Solution {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        for(int i = 0; i < s.length(); i++)
        {
            arr[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s.length(); i++)
        {
            int count = arr[s.charAt(i) - 'a'];
            if(count > 0 && count < 2)
            {
                return i;
            }
        }
        return -1;
    }
}