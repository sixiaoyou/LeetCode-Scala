package EighteenOne

/*
leetCode.3Sum(TLE)
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
*/


/**
  * Created by You on 2018/1/3.
  */
object LeetCode15_3Sum {
  def threeSum(nums: Array[Int]): List[List[Int]] = {
    var Nums = nums
    var ret = List[List[Int]]()
    if (nums.length < 3) {
      return ret
    }
    var (tar, i) = (0, 0)
    Nums = nums.sortWith(_ < _)
    while (i < Nums.length - 2) {
      var j = i + 1
      var k = Nums.length - 1
      while (j < k) {
        if ((Nums(i) + Nums(j) + Nums(k)) < tar) {
          j += 1
        } else if ((Nums(i) + Nums(j) + Nums(k)) > tar) {
          k -= 1
        } else {
          var list = List[Int]()
          list = Nums(i) +: list
          list = Nums(j) +: list
          list = Nums(k) +: list
          ret = list +: ret
          j += 1
          k -= 1
          while (j < k && Nums(j) == Nums(j - 1)) {
            j += 1
          }
          while (j < k && Nums(k) == Nums(k + 1)) {
            k -= 1
          }
        }
      }
      while (i < Nums.length - 2 && Nums(i) == Nums(i + 1)) {
        i += 1
      }
      i += 1
    }
    ret
  }
}
