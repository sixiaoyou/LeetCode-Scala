package SeventeenTwelve

/*
【网友实现】https://discuss.leetcode.com/topic/1225/solve-this-problem-with-binary-search
Implement int sqrt(int x).

Compute and return the square root of x.

x is guaranteed to be a non-negative integer.


Example 1:

Input: 4
Output: 2
Example 2:

Input: 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we want to return an integer, the decimal part will be truncat
 */

/**
  * Created by Administrator on 2017/12/21.
  *
  */
object LeetCode69_Sqrt {
  def mySqrt(x: Int): Int = {
    if (0 == x) return 0;
    var low=1
    var high,ans=x
    while(low<=high){
      val mid=low+(high-low)/2
      if(mid <= x/mid){
        low=mid+1
        ans=mid
      }
      else{
        high=mid-1
      }
    }
    ans
  }
}
