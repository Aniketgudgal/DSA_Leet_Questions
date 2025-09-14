class Solution {
    public int countPrimes(int n) {
        if(n <= 2)
        {
            return 0;
        }
        int count= 0;
        int j = 2;
        while(j <= n)
        {
        
        int i = 2;
        boolean flag = true;
        while((i < j/2))
        {    
            if(j % i == 0)
            {
                flag = false;
                break;
            }
            else
            {
                flag = true;
            }
            i++;   
        }
        if(flag)
        {
            count++;
        }
        j++;
        }
        return count;
    }
}