class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int mid = i + (j - i) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // we are in the ascending part of mountain
                i = mid + 1;
            } else {
                // we are in the descending part or at the peak
                j = mid;
            }
        }

        return i;
    }
}