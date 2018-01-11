package EighteenOne

/*
LeetCode13. Roman to Integer
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.
 */


/**
  * Created by You on 2018/1/3.
  */
object LeetCode13_RomantoInteger {
  def romanToInt(s: String): Int = {
    val arS = Array('I', 'V', 'X', 'L', 'C', 'D', 'M')
    val arI = Array(1, 5, 10, 50, 100, 500, 1000)
    var (res, pre) = (0, 0)
    var map: Map[Char, Int] = Map()
    for (i <- 0 until arS.length) {
//      map(arS(i)) = arI(i)
    }
    for (i <- (0 until s.length).reverse) {
      var num = map(s.charAt(i))
      if (num >= pre) {
        res += num
      } else {
        res -= num
      }
      pre = num
    }
    res

  }


}
