/*121. Best Time to Buy and Sell Stock
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
--------------------------
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
*/

/*solution : always if u r selling on ith day then buy before min (i-1)th day
refer notebook for more comments*/
//tc-->o(n) , sc->o(1)
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;
        int n = prices.length;
        int bought_min = prices[0]; // 7
        int maxPft=0; // think as bought and sold on same day so no profit
        // since no rpofit starts from day 1
        for(int i =1 ; i < n; i++)
        {
            int profit=prices[i]-bought_min;// find for all like this
            maxPft = Math.max(maxPft, profit);
            bought_min = Math.min(bought_min, prices[i]);//old bbought valuuw with curr
        }
        return maxPft;
    }
}
