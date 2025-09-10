class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
       int  buy = prices[0];
        for(int i =1; i < prices.length; i++)
        {
            if(prices[i] < buy) // if price of stock is less than buy then add that price in buy variable
            {
                buy = prices[i];
            }
            else if(prices[i] > maxprofit) // price of stock is high from provius value
            {
                    if(prices[i] - buy > maxprofit) // checking the max profit which stock is giving
                    {
                        maxprofit = prices[i] - buy;
                    }
            }
        }
        // return max profit value from all stocks
        return maxprofit;
    }
}