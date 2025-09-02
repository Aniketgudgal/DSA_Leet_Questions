class Solution {
    public boolean isPowerOfThree(int n) {
       if(n == 1) // 27 
       {
        return true;
       }
       if(n <= 0 )
       {
        return false;
       } 
       int rem = 0;
       while(n != 1) // 27 9 3 1
       {
        rem = n % 3 ; // 0 0 0
        n = n /3; // 9 3 1
       }
       if(rem == 0 && n == 1)
       {
        return true;
       }
       else
       {
        return false;
       }
    }
}