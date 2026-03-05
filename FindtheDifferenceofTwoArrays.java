class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> al1 = new HashSet<>();
        HashSet<Integer> al2 = new HashSet<>();
        for(int n: nums1)
        {
            al1.add(n);
        }
        for(int n: nums2)
        {
            al2.add(n);
        }
        List<Integer> res1 = new ArrayList<>();
        for(int n: al1)
        {
            if(!al2.contains(n))
            {
                res1.add(n);
            }
        }
        List<Integer> res2 = new ArrayList<>();
        for(int n: al2)
        {
            if(!al1.contains(n))
            {
                res2.add(n);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(res1);
        result.add(res2);
        return result;
    }
}