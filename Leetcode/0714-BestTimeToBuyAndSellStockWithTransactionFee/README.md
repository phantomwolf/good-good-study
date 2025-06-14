# 714. Best Time to Buy and Sell Stock with Transaction Fee
You are given an array prices where prices[i] is the price of a given stock on the ith day, and an integer fee representing a transaction fee.

Find the maximum profit you can achieve. You may complete as many transactions as you like, but you need to pay the transaction fee for each transaction.

Note:

* You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
* The transaction fee is only charged once for each stock purchase and sale.

Example 1:

Input: prices = [1,3,2,8,4,9], fee = 2
Output: 8
Explanation: The maximum profit can be achieved by:
- Buying at prices[0] = 1
- Selling at prices[3] = 8
- Buying at prices[4] = 4
- Selling at prices[5] = 9
The total profit is ((8 - 1) - 2) + ((9 - 4) - 2) = 8.

Example 2:

Input: prices = [1,3,7,5,10,3], fee = 3
Output: 6

Constraints:

* 1 <= prices.length <= 5 * 104
* 1 <= prices[i] < 5 * 104
* 0 <= fee < 5 * 104

## Solution 1: Dynamic Programming
Modify [188. Best Time to Buy and Sell Stock IV](../0188-BestTimeToBuyAndSellStockIV/README.md):

* Since transactions are unlimited, we can remove j
* Transaction fee is only collected once per transaction(buy+sell). To make it simple, we subtract the fee only when buying stock.

Transition equation:

    dp[i][0] = max(dp[i-1][0], dp[i-1][1]+prices[i])
    dp[i][1] = max(dp[i-1][1], dp[i-1][0]-prices[i]-fee)

Base cases:

    dp[0][0] = 0
    dp[0][1] = -prices[0]-fee

## Solution 2: Space-optimized DP
In the transition equation of solution 1,

* `dp[i][0]` only depends on `dp[i-1][0]` and `dp[i-1][1]`
* `dp[i][1]` only depends on `dp[i-1][1]` and `dp[i-1][0]`

We can use variables to replace the dp array:

* dp[i][0] => dp_i_0
* dp[i][1] => dp_i_1

