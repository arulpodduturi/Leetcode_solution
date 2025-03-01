/**
 You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5

 */
class Solution {
    public int maxProfit(int[] prices) {
        int[] stock=new int[prices.length];
        int maxprofit=0;
        for(int i=0;i<prices.length;i++)	{
            for(int j=i;j<prices.length;j++)	 {
                if(prices[i]<prices[j])	{
                    stock[i]=prices[j]-prices[i];
                    maxprofit=Math.max(maxprofit,stock[i]);
                }
            }
        }
        return maxprofit;
    }
}
