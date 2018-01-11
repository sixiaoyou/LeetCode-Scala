package SeventeenTwelve

/**
  * Created by Administrator on 2017/12/6.
  */


/*
LeetCode1. Two Sum
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
object LeetCode1_TwoSum {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    var z = new Array[Int](2)
    for (i <- 0 to nums.length - 1; j <- i + 1 to nums.length - 1) {
      if (nums(i) + nums(j) == target) {
        z(0) = i
        z(1) = j
      }
    }
    z
  }
}
