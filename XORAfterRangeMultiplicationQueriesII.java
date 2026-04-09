class Solution {
     private static final int MOD = 1_000_000_007;
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int n = nums.length;
        int T = (int)Math.sqrt(n);
        List<List<int[] >> blocks = new ArrayList<>(T); 
        for(int i = 0; i < T; i++)
        {  
            blocks.add(new ArrayList<>());
        }
        for(int[] query: queries)
        {
            int l= query[0];
            int r = query[1];
            int k  = query[2];
            int v = query[3];
            if(k < T)
            {
                blocks.get(k).add(new int[]{l,r,v});
            }
            else
            {
                for(int i = l; i <= r; i+= k)
                {
                    nums[i] = (int)(((long)nums[i]*v)% MOD);
                }
            }
            
        }
        long mul[] = new long[n+T];
        for(int k = 1; k < T; k++)
        {
            if(blocks.get(k).isEmpty())
            {
                continue;
            }
            Arrays.fill(mul, 1);
            for(int[] q: blocks.get(k))
            {
               int l= q[0];
                int r = q[1];
                int v  = q[2];
                mul[l] = (mul[l]*v)% MOD;
                int R = ((r-l)/k + 1) * k + l;
                mul[R] = (mul[R] * power(v, MOD - 2)) % MOD;
            }
            for(int i = k; i < n; i++)
            {
                mul[i] = (mul[i] * mul[i - k]) % MOD;
            }
            for(int i = 0; i < n; i++)
            {
                nums[i]  = (int)(((long)nums[i] * mul[i]) % MOD);
            }
        }
        int res = 0;
        for(int x: nums)
        {
            res ^= x;
        }
        return res;
    }
    int power(long x, long y)
    {
        long res = 1;
        while(y > 0)
        {
            if((y & 1) == 1)
            {
                res = (res*x) % MOD;
            }
            x = (x*x) % MOD;
            y >>= 1;
        }
        return (int)res;
    }
}