package SeventeenTwelve
/*
LeetCode209. Minimum Size Subarray Sum
Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.

For example, given the array [2,3,1,2,4,3] and s = 7,
the subarray [4,3] has the minimal length under the problem constraint.

click to show more practice.

Credits:
Special thanks to @Freezen for adding this problem and creating all test cases.
 */

/**
  * Created by You on 2017/12/31.
  */
object LeetCode209_MinimumSizeSubarraySum {
  def minSubArrayLen(s: Int, nums: Array[Int]): Int = {
    var(left,ans,subSum) = (0,nums.length+1,0)
    for(i <- 0 until nums.length){
      subSum+=nums(i)
      while(subSum>=s){
        var length = i - left +1
        if(ans>length){
          ans = length
        }
        subSum-=nums(left)
        left+=1
      }
    }
    if(ans==nums.length+1){
      return 0
    }
    return ans
  }
}
