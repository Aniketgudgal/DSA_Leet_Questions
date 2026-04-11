class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            mp.computeIfAbsent(nums[i] , x -> new ArrayList<>()).add(i);
        }
        int minDis = Integer.MAX_VALUE;
        for(List<Integer> al : mp.values())
        {
            if(al.size()< 3)
            {
                continue;
            }
            for(int i = 0; i + 2 < al.size(); i++)
            {
                int a = al.get(i);
                int b = al.get(i+1);
                int c = al.get(i+2);
                int total = Math.abs(a - b) + Math.abs(b-c) + Math.abs(c-a);
                minDis = Math.min(minDis,total);
            }
        }
        return minDis == Integer.MAX_VALUE ? -1: minDis;
    }
}