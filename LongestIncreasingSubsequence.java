  import java.util.ArrayList;
class Solution {
    public int lengthOfLIS(int[] nums) {
       ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            int pos = binarySearch(list, num);

            if (pos == list.size()) {
                list.add(num);          // extend LIS
            } else {
                list.set(pos, num);     // replace element
            }
        }
        return list.size();
    }
    // Custom Binary Search
     static int binarySearch(ArrayList<Integer> list, int target) {
        int low = 0, high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (list.get(mid) >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }


    
}