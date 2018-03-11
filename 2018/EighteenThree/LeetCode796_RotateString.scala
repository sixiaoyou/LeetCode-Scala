package EighteenThree

/**
  * Created by You on 2018/3/11.
  */
/*
LeetCode796. Rotate String
We are given two strings, A and B.

A shift on A consists of taking string A and moving the leftmost character to the rightmost position. For example, if A = 'abcde', then it will be 'bcdea' after one shift on A. Return True if and only if A can become B after some number of shifts on A.

Example 1:
Input: A = 'abcde', B = 'cdeab'
Output: true

Example 2:
Input: A = 'abcde', B = 'abced'
Output: false
Note:

A and B will have length at most 100.
 */

object LeetCode796_RotateString {
  def rotateString(A: String, B: String): Boolean = {
    for(i<- 0 until A.length){
      if((A.substring(i+1,A.length)+A.substring(0,i+1)).equals(B)){
        return true
      }
    }
    return false
  }
}
