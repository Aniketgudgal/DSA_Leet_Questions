class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int extra) {
        List<Boolean> al = new ArrayList<>();
        int max = 0;
        for(int i = 0; i < c.length; i++)
        {
            if(c[i] > max)
            {
                max = c[i];
            }
        }
        for(int i = 0; i < c.length; i++)
        {
            if(c[i] + extra >= max)
            {
                al.add(true);
            }
            else 
            {
                al.add(false);
            }
        }
        return al;
    }
}