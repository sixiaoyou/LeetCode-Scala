package EighteenOne

/*
LeetCode 58. Length of Last Word
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

Example:

Input: "Hello World"
Output: 5
 */
/**
  * Created by You on 2018/1/6.
  */
object LeetCode58_LengthofLastWord {
  def lengthOfLastWord(s: String): Int = {
    val res = s.split(" ")
    if(res.length == 0){
      return 0
    }
    res(res.length-1).length
  }
}
