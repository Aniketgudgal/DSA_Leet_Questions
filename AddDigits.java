class Solution {
    public int addDigits(int num) {
        int digit = 0;
        int rem;
        while(num != 0)
        {
            rem = num % 10;
            digit += rem;
            num /= 10;
        }
        int digit1 = 0;
        while(digit != 0)
        {
             rem = digit % 10;
            digit1 += rem;
            digit /= 10;
        }
          digit = 0;
         while(digit1 != 0)
        {
             rem = digit1 % 10;
             if(rem != 0)
             {
            digit += rem;
             }
            digit1 /= 10;
        }
        return digit;
    }
}