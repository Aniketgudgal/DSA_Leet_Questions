class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumEven = 0, sumOdd = 0;
        int i = 1;
        int countOdd = 0, countEven = 0;
        while(countOdd < n || countEven < n)
        {
            if(i % 2 == 0)
            {
                sumEven += i;
                countEven++;
            }
            else
            {
                sumOdd += i;
                countOdd++;
            }
            i++;
        }
        // to calculate gcd of logic
          int gcd = 0;
        if(sumEven > sumOdd)
        {
            i = 1;
            while(i <= sumOdd)
            {
                if(sumOdd % i == 0 && sumEven % i == 0)
                {
                    gcd = i;
                }
                i++;
            }
        }
        else
        {
            i = 1;
            while(i <= sumEven)
            {
                if(sumEven % i == 0 && sumOdd % i == 0)
                {
                    gcd = i;
                }
                i++;
            }
        }
       return gcd;
    }
    
}