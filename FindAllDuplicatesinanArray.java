import java.util.HashMap;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> al= new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
         for(int i = 0; i < nums.length; i++)
        {
            Integer count = (Integer)map.get(nums[i]);
            if(count == null)
            {
                count = 0;
            }
            ++count;
            map.put(nums[i], count);
        }
       Set<Map.Entry <Integer, Integer>> set = map.entrySet();
       for(Map.Entry m : set)
       {
        if((int)m.getValue()>1)
        {
             al.add ((int)m.getKey());
        }
       }
       return al;
    }
}