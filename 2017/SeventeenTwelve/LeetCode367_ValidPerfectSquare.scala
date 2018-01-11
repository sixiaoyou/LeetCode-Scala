package SeventeenTwelve

/*
LeetCode367. Valid Perfect Square
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:

Input: 16
Returns: True
Example 2:

Input: 14
Returns: False
 */


/**
  * Created by You on 2017/12/29.
  */
object LeetCode367_ValidPerfectSquare {
  def isPerfectSquare(num: Int): Boolean = {
    val ln = math.pow(num,0.5)-1
    val hn = math.pow(num,0.5)+1
    return ln.toInt*hn.toInt+1==num
  }
}
