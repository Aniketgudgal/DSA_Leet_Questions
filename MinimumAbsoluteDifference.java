class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> al = new ArrayList<>();
        // for(int i = 0; i < arr.length; i++)
        // {
        //     for(int j = i+1; j < arr.length; j++)
        //     {
        //         if(arr[i] > arr[j])
        //         {
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++)
        {
            int diff = arr[i] - arr[i-1];
            if(diff < min)
            {
                min = diff;
            }
        }
        int k = 0;
        for(int i = 1; i < arr.length; i++)
        {      
            if(arr[i] - arr[i-1] == min)
            {
                al.add(new ArrayList());
                al.get(k).add(arr[i-1]);
                al.get(k).add(arr[i]);
                k++;
            }
        }
        return al;
    }
}