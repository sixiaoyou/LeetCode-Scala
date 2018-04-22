package EighteenFour

/**
  * Created by You on 2018/4/22.
  */
/*
Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.

Example 1:

Input: S = "loveleetcode", C = 'e'
Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]


Note:

S string length is in [1, 10000].
C is a single character, and guaranteed to be in string S.
All letters in S and C are lowercase.
 */
object LeetCode821_ShortestDistancetoaCharacter {
  def shortestToChar(S: String, C: Char): Array[Int] = {
    val res = new Array[Int](S.length)
    for (i <- 0 until S.length) {
      if (S.charAt(i) == C) {
        res(i) == i
      } else {
        var (start, end, count1, count2) = (i, i, 0, 0)
        while (start > 0 && S.charAt(start) != C) {
          start -= 1
          count1 += 1
        }
        while (end < S.length - 1 && S.charAt(end) != C) {
          end += 1
          count2 += 1
        }
        if (S.charAt(start) == C && S.charAt(end) != C) {
          res(i) = count1
        } else if (S.charAt(end) == C && S.charAt(start) != C) {
          res(i) = count2
        } else {
          res(i) = Math.min(count1, count2)
        }
      }
    }
    res
  }
}
