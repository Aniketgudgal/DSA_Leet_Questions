class Solution {
    public int reverseBits(int n) {
      int[] arr = new int[32];
      int k = 0;
      while(n != 0)
      {
        arr[k++] = n % 2;
        n /= 2;
      }
      int num = 0;
      for(int i = 0; i < arr.length; i++)
      {
        num = num * 2+ arr[i];
      }
      return num;
    }
}