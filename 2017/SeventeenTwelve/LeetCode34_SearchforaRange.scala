package SeventeenTwelve
import scala.util.control._
/*
LeetCode34. Search for a Range
Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

For example,
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4].
 */
/**
  * Created by You on 2017/12/31.
  */
object LeetCode34_SearchforaRange {
  def searchRange(nums: Array[Int], target: Int): Array[Int] = {
    val loop = new Breaks
    var (low, high, start, end) = (0, nums.length - 1, -1, -1)
    if (nums.length == 0) {
      return Array(start, end)
    }
    while (low <= high) {
      var mid = (low + high) / 2
      var (flag1, flag2) = (mid, mid)
      if (nums(mid) == target) {
        loop.breakable {
          while (nums(flag1) == target) {
            start = flag1
            flag1 -= 1
            if (flag1 < 0) {
              loop.break
            }
          }
        }
        loop.breakable {
          while (nums(flag2) == target) {
            end = flag2
            flag2 += 1
            if (flag2 >= nums.length) {
              loop.break
            }
          }
        }
        return Array(start, end)

      }
      else if (nums(mid) > target) {
        high -= 1
      } else {
        low += 1
      }

    }
    Array(-1, -1)
  }
}
