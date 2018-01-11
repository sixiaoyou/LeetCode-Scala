package SeventeenTwelve

/*
LeetCode33. Search in Rotated Sorted Array
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.
 */

/**
  * Created by You on 2017/12/30.
  */
object LeetCode33_SearchInRotatedSortedArrayII {
  def search(nums: Array[Int], target: Int): Int = {
    if (nums.length == 0) {
      return -1
    }
    var (low, high) = (0, nums.length - 1)
    while (low <= high) {
      var mid = (low + high) / 2
      if (nums(mid) == target) {
        return mid
      } else {
        if (nums(mid) >= nums(low)) {
          if (nums(low) <= target & target <= nums(mid)) {
            high = mid - 1
          } else {
            low = mid + 1
          }
        } else {
          if (nums(mid) <= target & target <= nums(high)) {
            low = mid + 1
          } else {
            high = mid - 1
          }
        }
      }
    }
    -1
  }
}
