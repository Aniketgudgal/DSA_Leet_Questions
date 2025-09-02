class Solution {
    public int[] plusOne(int[] digits) 
    {
      /*  long sum = 0;
        for(int i = 0; i < digits.length; i++)
        { sum = sum*10 + digits[i];
        }
        sum += 1;
        long rev;
        long temp = sum;
        long count = 0;
        while(temp != 0)
        {
            temp /= 10;
            count++;
        }
        if(count == digits.length)
        {
        long i = digits.length - 1;
        while(sum != 0 && i >= 0)
        {
            rev = sum % 10;
           digits[(int)i] = (int)rev;
            sum /= 10;
            i--;
        }
        return digits;
        }
        else
        {
        int[] result = new int[digits.length+1];
        long i = result.length - 1;
        while(sum != 0 && i >= 0)
        {
            rev = sum % 10;
            result[(int)i] = (int)rev;
            sum /= 10;
            i--;
        }
        return result;
        }
        */
     for (int i = digits.length - 1; i >= 0; i--) 
     {
        if (digits[i] < 9) 
        {
            digits[i]++;
            return digits;
        }
            digits[i] = 0;
    }
    
    int[] result = new int[digits.length + 1];
    result[0] = 1;
    return result;
    
    }
}