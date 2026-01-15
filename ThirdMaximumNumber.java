class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> al = new TreeSet<>();
        for(int a:nums)
        {
            al.add(a);
        }
        int k = al.size() - 2;
        int i = 1;
        Iterator<Integer> it = al.iterator();
        int last = 0;
        while (it.hasNext()) {
            if(i == k)
            {
                return it.next();
            }
            i++;
            last = it.next();
        }
        return last;
    }
}