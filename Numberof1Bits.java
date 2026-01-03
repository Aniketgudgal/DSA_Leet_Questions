class Solution {
    public int hammingWeight(int n) {
        /*
        int[] binary = new int[31];
        int b = 0;
        while(n > 0)
        {
            binary[b++] = n % 2;
            n = n / 2; 
        }
        int count = 0;
        for(int i = 0; i < binary.length; i++)
        {
            if(binary[i] == 1)
            {
                count++;
            }
        }
        return count;
        */
        int ones = 0;
    	while(n!=0) {
    		ones = ones + (n & 1);
    		n = n>>>1;
    	}
    	return ones;
    }
}