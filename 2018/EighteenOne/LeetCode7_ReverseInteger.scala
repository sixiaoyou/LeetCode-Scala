package EighteenOne

/*
【网友实现】:https://leetcode.com/problems/reverse-integer/discuss/4060/
LeetCode7. Reverse Integer
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output:  321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.


 */

/**
  * Created by You on 2018/1/3.
  */
object LeetCode7_ReverseInteger {
  def reverse(x: Int): Int = {
    var result = 0
    var X = x
    while (X != 0) {
      val tail = X % 10
      var newResult = 10 * result + tail
      if ((newResult - tail) / 10 != result) {
        return 0
      }
      result = newResult
      X = X / 10
    }
    result
  }
}

