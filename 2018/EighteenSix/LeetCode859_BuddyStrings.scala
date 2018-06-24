package EighteenSix

/**
  * Created by You on 2018/6/24.
  */

/*
'''
LeetCode859. Buddy Strings
Given two strings A and B of lowercase letters, return true if and only if we can swap two letters in A so that the result equals B.



Example 1:

Input: A = "ab", B = "ba"
Output: true
Example 2:

Input: A = "ab", B = "ab"
Output: false
Example 3:

Input: A = "aa", B = "aa"
Output: true
Example 4:

Input: A = "aaaaaaabc", B = "aaaaaaacb"
Output: true
Example 5:

Input: A = "", B = "aa"
Output: false


Note:

0 <= A.length <= 20000
0 <= B.length <= 20000
A and B consist only of lowercase letters.
'''
 */
import scala.collection.mutable.Set
object LeetCode859_BuddyStrings {
  def buddyStrings(A: String, B: String): Boolean = {
    val set = Set[Char]()
    var ls = List[Char]()
    if (A.length() != B.length()) {
      return false
    }
    for (i <- 0 until A.length) {
      set.add(A.charAt(i))
      if (A.charAt(i) != B.charAt(i)) {
        ls = ls :+ A.charAt(i)
        ls = ls :+ B.charAt(i)
      }
    }
    if (A.equals(B)) {
      if (set.size == A.length) {
        return false
      }
      return true
    }
    if (ls.size != 4) {
      return false
    }
    if (ls(0) != ls(3) || ls(1) != ls(2)) {
      return false
    }
    return true
  }
