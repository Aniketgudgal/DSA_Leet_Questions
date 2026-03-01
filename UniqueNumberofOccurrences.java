class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        LinkedHashMap<Integer,Integer> al = new LinkedHashMap<>();
        for(int i = 0; i < arr.length; i++)
        {
            if(!al.containsKey(arr[i]))
            {
                al.put(arr[i],1);
            }
            else
            {
                int n= al.get(arr[i]);
                al.put(arr[i],n+1);
            }
        }
        HashSet<Integer> res = new HashSet<>();
        for(Map.Entry<Integer, Integer> entry : al.entrySet())
        {
            if(res.contains(entry.getValue()))
            {
                return false;
            }
            res.add(entry.getValue());
        }
        return true;
    }
}