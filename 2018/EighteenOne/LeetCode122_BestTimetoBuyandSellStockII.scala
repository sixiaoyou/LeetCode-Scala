package EighteenOne

/*
LeetCode122.Best Time to Buy and Sell Stock II
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 */
/**
  * Created by You on 2018/1/6.
  */
object LeetCode122_BestTimetoBuyandSellStockII {
  def maxProfit(prices: Array[Int]): Int = {
    var maxProfit = 0;
    val length = prices.length;
    if(length == 0){
      return 0;
    }
    var init = prices(0);
    for(i <- 1 until length){
      if(prices(i)>init){
        maxProfit+=prices(i) - init;
      }
      init = prices(i);
    }
    return maxProfit;
  }
}
