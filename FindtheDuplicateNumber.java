import java.util.HashMap;
import java.util.*;
class Solution {
    public int findDuplicate(int[] nums) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
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
             return (int)m.getKey();
        }
       }
       return -1 ;
    }
}