class Solution {
    public int minPartitions(String n) {
        int num = Integer.MIN_VALUE;
        for(int i = 0; i < n.length(); i++)
        {
            int check = n.charAt(i) - '0';
            if(check > num)
            {
                num = check;
            }
        }
        return num;
    }
}