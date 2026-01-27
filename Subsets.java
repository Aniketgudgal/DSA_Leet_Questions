import java.util.Stack;
class Solution {
    void getAllSet(int[] nums, Stack<Integer> s, int i, List<List<Integer>> al)
    {
        if(i == nums.length)
        {
            al.add(new ArrayList(s));
            return ;
        }
        s.push(nums[i]);
        getAllSet(nums,s,i+1,al);
        s.pop();
        getAllSet(nums,s,i+1,al);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> al = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        getAllSet(nums,s,0,al);
        return al;
    }
}