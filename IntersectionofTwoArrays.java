import java.util.HashSet;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        for(int i = 0; i < nums1.length; i++)
        {
            h1.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++)
        {
            h2.add(nums2[i]);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer h:h1)
        {
            if(h2.contains(h))
            {
                result.add(h);
            }
        }
        int[] arr = new int[result.size()];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = result.get(i);
        }
        return arr;
    }
}