class Solution {
    public double myPow(double x, int n) {
       long f = n; // power
       // x is the base value
       if(n == 0 || x == 1 || (x == -1 && n % 2 == 0))
       {
        return 1.0;
       }
       if(x == 0)
       {
        return 0.0;
       }
       if(x == -1 && n % 2 == 1)
       {
        return -1.0;
       }
       if(n < 0)
       {
        x  = (1 /x);
        f = -f;
       }
        double a = 1;
        while(f>0)
        {
            if(f % 2 == 1)
            {
                    a *= x;
            }
            x *= x;
            f /= 2;

        }
        return a;
    }
}