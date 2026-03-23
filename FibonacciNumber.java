class Solution {
    public int fib(int n) {
        /*
        // first approach
        if(n <= 1)
        {
            return n;
        }
        return fib(n-1) + fib(n-2);
        */
        /*
        // second approach
        int arr[] = new int[n+1];
        Arrays.fill(arr,-1);
        return fibnaci(n,arr);
        */

        /*
        // third approach
        if(n <= 1)
        {
            return n;
        }
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i <= n; i++)
        {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
        */
        // fourth approach for space optimization
        if(n <= 1)
        {
            return n;
        }
        int prev1 = 0;
        int prev2 = 1;
        int sum = prev1+prev2;
        for(int i = 2; i <= n; i++) // alternative writing for(int i = 2; i <= n; i++)
        {
            sum = prev1+prev2;
            prev1 = prev2;
            prev2 = sum;
        }
        return sum;
    }
    public int fibnaci(int n, int[] num)
    {
        // base condition
        if(n <= 1)
        {
            return n;
        }
        // check dp result
        if(num[n] != -1)
        {
            return num[n];
        }
        // restore in dp array
        return num[n] = fibnaci(n - 1,num) + fibnaci(n - 2,num);
    }
}