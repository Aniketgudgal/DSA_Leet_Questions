class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        HashMap<Integer, Integer> al = new HashMap<>();
        int n = nums.length;
        int fon = n *(n +1)/2;
        int sum = 0;
        int dup = 0;
        for(int num : nums)
        {
            sum += num;
            if(al.containsKey(num))
            {
                dup = num;
            }
            al.put(num, al.getOrDefault(num,0)+1);
        }
        int mis = fon - (sum - dup);
        arr[0] = dup;
        arr[1]= mis;
        return arr;
    }
}