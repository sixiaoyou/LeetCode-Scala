package SeventeenTwelve


/*
LeetCode167Two Sum II - Input array is sorted
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution and you may not use the same element twice.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
 */

/**
  * Created by Administrator on 2017/12/24.
  */
object LeetCode167_TwoSumIIInputArrayIsSorted {
  def twoSum(numbers: Array[Int], target: Int): Array[Int] = {
    var (i, j) = (0, numbers.length - 1)
    while (i <= j) {
      if (numbers(i) + numbers(j) == target) {
        return Array(i + 1, j + 1)
      } else if (numbers(i) + numbers(j) < target) {
        i += 1
      } else {
        j -= 1
      }
    }
    Array(i + 1, j + 1)
  }
}
