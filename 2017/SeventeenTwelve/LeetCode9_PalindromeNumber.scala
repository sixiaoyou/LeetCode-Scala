package SeventeenTwelve
/*
LeetCode9.PalindromeNumber
Determine whether an integer is a palindrome. Do this without extra space.

click to show spoilers.
 */

/**
  * Created by You on 2017/12/30.
  */
object LeetCode9_PalindromeNumber {
  def isPalindrome(x: Int): Boolean = {
    val y = x.toString()
    var (start,end) = (0,y.length-1)
    while(start<=end){
      if(y(start)!=y(end)){
        return false
      }
      start+=1
      end-=1
    }
    return true
  }
}
