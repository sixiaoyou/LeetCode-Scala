package EighteenOne

/*
LeetCode16. 3Sum Closest
Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

For example, given array S = {-1 2 1 -4}, and target = 1.

 The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */


/**
  * Created by You on 2018/1/3.
  */
object LeetCode_3SumClosest {
  def threeSumClosest(nums: Array[Int], target: Int): Int = {
    var Nums = nums.sortWith(_ < _)
    var res = Nums(0) + Nums(1) + Nums(2)
    for (i <- 0 until Nums.length - 2) {
      var j = i + 1
      var k = Nums.length - 1
      while (j < k) {
        var sum = Nums(i) + Nums(j) + Nums(k)
        if (sum == target) {
          return sum
        } else if (math.abs(sum - target) < math.abs(res - target)) {
          res = sum
        }
        if (sum < target) {
          j += 1
        }
        if (sum > target) {
          k -= 1
        }
      }
    }
    res
  }
}
